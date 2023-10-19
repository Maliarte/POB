import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
            ArrayList<Produto> listaProdutos = new ArrayList<>();
            ArrayList<Cliente> listaClientes = new ArrayList<>();

            
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
                        System.out.print("Nome do Produto: ");
                        String nomeProduto = sc.nextLine();
                        System.out.print("Id: ");
                        int idProduto = sc.nextInt();
                        System.out.print("Quantidade: ");
                        int qtdProduto = sc.nextInt();
                        System.out.print("Valor: R$");
                        double valorProduto = sc.nextDouble();

                        Produto produto = new Produto(nomeProduto, idProduto, qtdProduto, valorProduto);
                        
                        listaProdutos.add(produto);
                        
                        break;

                    case 2:
                    if (listaProdutos.isEmpty()) {
                      System.out.println("Não há produtos cadastrados.");
                    } else {
                      // listar os produtos
                      for (Produto p : listaProdutos) {
                          System.out.println(p);
                      }
                    }
                    break;

                    case 3:
                        System.out.print("Informe o nome do produto a ser removido: ");
                        String nomeRemover = sc.nextLine();
                        listaProdutos.removeIf(p->p.nome.equals(nomeRemover));
                        break;

                    case 4:
                   
                    System.out.print("Informe o Id: ");
                    int id = sc.nextInt();
                    System.out.print("Informe o nome do produto ");
                    sc.nextLine(); // Consumir a quebra de linha
                    String nomeProd = sc.nextLine();

                    boolean produtoEncontrado = false;
                    for (Produto prod : listaProdutos) {
                        if (prod.nome.equals(nomeProd)) {

                            produtoEncontrado = true;
                            break;
                        }
                    }

                    if (!produtoEncontrado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                    //finalizar compra
                  case 5:
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
                            cliente.produtos.add(listaProdutos.get(escolha - 1));
                            System.out.println("Produto adicionado ao carrinho.");
                            
                        } else {
                            System.out.println("Escolha inválida.");
                        }
                        Carrinho carrinho = new Carrinho();
                        carrinho.adicionarItem(idProduto, qtdProduto);
                        break;

                      //listar clientes
                    case 6:
                    if (listaClientes.isEmpty()) {
                      System.out.println("Não há clientes cadastrados.");
                    } else {
                        System.out.println("Lista de Clientes:");
                        for (Cliente c : listaClientes) {
                            System.out.println(c.nome);
                            for (Produto p : c.produtos) {
                                System.out.println("  - " + p);
                            }
                        }
                      }

                    double valorTotalCarrinho = carrinho.calcularValorTotal(listaProdutos);
                    System.out.println("Valor Total do Carrinho: R$" + valorTotalCarrinho);
                    carrinho.listarItensNoCarrinho();
                    break;

                    //remover
                    case 7:
                        System.out.println("Informe o nome do cliente a ser removido: ");
                        String nomeClienteRemover = sc.nextLine();
                        listaClientes.removeIf(c->c.nome.equals(nomeClienteRemover));
                        break;

                    //buscar
                    case 8:
                        System.out.print("Informe o nome do cliente a ser buscado: ");
                        String nomeClienteBuscar = sc.nextLine();
                        for (Cliente c : listaClientes) {
                            if (c.nome.equals(nomeClienteBuscar)) {
                                System.out.println(c);
                            }
                        }
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
    }


