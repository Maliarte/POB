import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Produto> listaProdutos = new ArrayList<>();
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private Carrinho carrinho = new Carrinho();

    public void Processamento() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Remover Produto");
            System.out.println("4. Buscar Produto");
            System.out.println("5. Finalizar Compra");
            System.out.println("6. Listar Clientes");
            System.out.println("7. Remover Cliente");
            System.out.println("8. Buscar Cliente");
            System.out.println("0. Sair");

            int opcao = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;

                case 2:
                    listarProdutos();
                    break;

                case 3:
                    removerProduto(sc);
                    break;

                case 4:
                    buscarProduto(sc);
                    break;

                case 5:
                    finalizarCompra(sc);
                    break;

                case 6:
                    listarClientes();
                    break;

                case 7:
                    removerCliente(sc);
                    break;

                case 8:
                    buscarCliente(sc);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void cadastrarProduto() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do Produto: ");
        String nomeProduto = sc.nextLine();
        System.out.print("Id: ");
        int idProduto = sc.nextInt();
        System.out.print("Quantidade: ");
        int qtdProduto = sc.nextInt();
        System.out.print("Valor: R$");
        double valorProduto = sc.nextDouble();
        sc.nextLine(); // Consumir a quebra de linha

        Produto produto = new Produto(nomeProduto, idProduto, qtdProduto, valorProduto);
        listaProdutos.add(produto);
        System.out.println("Produto cadastrado com sucesso.");
    }

    private void listarProdutos() {
        if (listaProdutos.isEmpty()) {
            System.out.println("Não há produtos cadastrados.");
        } else {
            System.out.println("Lista de Produtos:");
            for (Produto p : listaProdutos) {
                System.out.println(p);
            }
        }
    }

    private void removerProduto(Scanner sc) {
        //Scanner sc = new Scanner(System.in);
        System.out.print("Informe o nome do produto a ser removido: ");
        String nomeRemover = sc.nextLine();
        listaProdutos.removeIf(p -> p.getNome().equals(nomeRemover));
        System.out.println("Produto removido com sucesso.");
    }

    private void buscarProduto(Scanner sc) {
        //Scanner sc = new Scanner(System.in);
        System.out.print("Informe o nome do produto a ser buscado: ");
        String nomeProduto = sc.nextLine();
        boolean produtoEncontrado = false;
        for (Produto prod : listaProdutos) {
            if (prod.getNome().equals(nomeProduto)) {
                System.out.println("Produto encontrado: " + prod);
                produtoEncontrado = true;
                break;
            }
        }
        if (!produtoEncontrado) {
            System.out.println("Produto não encontrado.");
        }
    }

    private void finalizarCompra(Scanner sc) {
        //Scanner sc = new Scanner(System.in);
        System.out.print("Nome do Cliente: ");
        String nomeCliente = sc.nextLine();
        Cliente cliente = new Cliente(nomeCliente);
        listaClientes.add(cliente);

        System.out.println("Escolha produtos para adicionar ao carrinho:");
        for (int i = 0; i < listaProdutos.size(); i++) {
            System.out.println((i + 1) + ". " + listaProdutos.get(i));
        }
        int escolha = sc.nextInt();
        if (escolha >= 1 && escolha <= listaProdutos.size()) {
            Produto produtoEscolhido = listaProdutos.get(escolha - 1);
            carrinho.adicionarItem(produtoEscolhido.getId(), 1);
            cliente.adicionarProduto(produtoEscolhido);
            System.out.println("Produto adicionado ao carrinho.");
        } else {
            System.out.println("Escolha inválida.");
        }
    }

    private void listarClientes() {
        if (listaClientes.isEmpty()) {
            System.out.println("Não há clientes cadastrados.");
        } else {
            System.out.println("Lista de Clientes:");
            for (Cliente c : listaClientes) {
                System.out.println(c);
                c.listarProdutos();
            }
        }
    }

    private void removerCliente(Scanner sc) {
        //Scanner sc = new Scanner(System.in);
        System.out.print("Informe o nome do cliente a ser removido: ");
        String nomeClienteRemover = sc.nextLine();
        listaClientes.removeIf(c -> c.getNome().equals(nomeClienteRemover));
        System.out.println("Cliente removido com sucesso.");
    }

    private void buscarCliente(Scanner sc) {
        //Scanner sc = new Scanner(System.in);
        System.out.print("Informe o nome do cliente a ser buscado: ");
        String nomeClienteBuscar = sc.nextLine();
        boolean clienteEncontrado = false;
        for (Cliente c : listaClientes) {
            if (c.getNome().equals(nomeClienteBuscar)) {
                System.out.println("Cliente encontrado: " + c);
                clienteEncontrado = true;
                break;
            }
        }
        if (!clienteEncontrado) {
            System.out.println("Cliente não encontrado.");
        }
    }
  
}
