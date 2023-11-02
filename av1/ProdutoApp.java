import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoApp {
    private ArrayList<Produto> listaProdutos = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void adicionarProduto() {
        Produto produto = criarNovoProduto();
        listaProdutos.add(produto);
        System.out.println("Produto cadastrado com sucesso.");
    }

    public Produto criarNovoProduto() {
        System.out.print("Nome do Produto: ");
        String nomeProduto = sc.nextLine();
        System.out.print("Id: ");
        int idProduto = sc.nextInt();
        System.out.print("Quantidade em estoque: ");
        int qtdProduto = sc.nextInt();
        System.out.print("Valor: R$");
        double valorProduto = sc.nextDouble();

        Produto novoProduto = new Produto(nomeProduto, idProduto, qtdProduto, valorProduto);

        // Verificar se já existe um produto com o mesmo ID
        if (buscarProdutoPorId(idProduto) == null) {
            return novoProduto;
        } else {
            System.out.println("Já existe um produto com o mesmo ID. Cadastro não realizado.");
            return null;
        }
    }

    public void listarProdutos() {
        if (listaProdutos.isEmpty()) {
            System.out.println("Não há produtos cadastrados.");
        } else {
            System.out.println("Lista de Produtos:");
            for (Produto p : listaProdutos) {
                System.out.println(p);
            }
        }
    }

    public void removerProduto() {
        System.out.print("Informe o ID do produto a ser removido: ");
        int idRemover = sc.nextInt();
        Produto produtoParaRemover = buscarProdutoPorId(idRemover);

        if (produtoParaRemover != null) {
            listaProdutos.remove(produtoParaRemover);
            System.out.println("Produto removido com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public Produto buscarProdutoPorId(int idProdutoAlterar) {
        for (Produto p : listaProdutos) {
            if (p.getId() == idProdutoAlterar) {
                return p;
            }
        }
        return null;
    }

    public void alterarProduto() {
        System.out.print("Informe o ID do produto a ser alterado: ");
        int idProdutoAlterar = sc.nextInt();
        Produto produtoParaAlterar = buscarProdutoPorId(idProdutoAlterar);

        if (produtoParaAlterar != null) {
            System.out.print("Novo nome do Produto: ");
            sc.nextLine(); // Consumir a quebra de linha
            String novoNomeProduto = sc.nextLine();
            System.out.print("Nova quantidade em estoque: ");
            int novaQtdProduto = sc.nextInt();
            System.out.print("Novo Valor: R$");
            double novoValorProduto = sc.nextDouble();

            produtoParaAlterar.setNome(novoNomeProduto);
            produtoParaAlterar.setQuant(novaQtdProduto);
            produtoParaAlterar.setValor(novoValorProduto);

            System.out.println("Produto alterado com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}
