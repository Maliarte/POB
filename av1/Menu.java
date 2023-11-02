import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Produto> listaProdutos = new ArrayList<>();
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    public ProdutoApp produtoApp = new ProdutoApp();
    public ClienteApp clienteApp = new ClienteApp();
    public CarrinhoApp carrinhoApp = new CarrinhoApp();

    public void processamento() {
        int opcao;
        Scanner sc = new Scanner(System.in);

        while (true) {
            exibirMenu();

            opcao = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    produtoApp.adicionarProduto();
                    break;
                case 2:
                
                    produtoApp.listarProdutos();
                    break;
                case 3:
                    produtoApp.removerProduto();
                    break;
                case 4:
                    produtoApp.alterarProduto();
                    break;
                case 5:
                    produtoApp.buscarProdutoPorId(listaProdutos);
                    break;
                case 6:
                    finalizarCompra(listaProdutos, null, null);
                    break;
                case 7:
                    clienteApp.listarClientes(listaClientes);
                    break;
                case 8:
                    clienteApp.removerCliente(listaClientes);
                    break;
                case 9:
                    clienteApp.buscarCliente(listaClientes);
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

    

    private void exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Cadastrar Produto");
        System.out.println("2. Listar Produtos");
        System.out.println("3. Remover Produto");
        System.out.println("4. Alterar Produto");
        System.out.println("5. Buscar Produto");
        System.out.println("6. Finalizar Compra");
        System.out.println("7. Listar Clientes");
        System.out.println("8. Remover Cliente");
        System.out.println("9. Buscar Cliente");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

  private void finalizarCompra(ArrayList<Produto> listaProdutos, Carrinho carrinho, Cliente cliente) {
      double valorTotal = carrinhoApp.calcularValorTotal();

      // Verifique se o cliente existe na lista de clientes
      if (cliente != null) {
        

          System.out.println("Compra finalizada com sucesso!");
          System.out.println("Valor total da compra: R$" + valorTotal);
      } else {
          System.out.println("Cliente não encontrado. A compra não pode ser finalizada.");
      }
  }


}