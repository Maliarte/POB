
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Menu {
    private List<Cliente> clientes = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();
    private List<Quarto> quartos = new ArrayList<>();
    private List<Cama> camas = new ArrayList<>();

    public void processamento() {
        int opcao = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Reserve sua locação conosco! Diárias a partir do meio dia. Escolha Quartos individuais ou Vagas coletivas");
            System.out.println("1- Incluir Reserva");
            System.out.println("2- Alterar Reserva");
            System.out.println("3- Excluir Reserva");
            System.out.println("4- Listar Reservas");
            System.out.println("5- Buscar Reserva");
            System.out.println("6- Sair");
            System.out.println("Escolha uma opção:");

            // Leia a opção do usuário
            opcao = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

            switch (opcao) {
                case 1:
                    System.out.println("Informe a data para CheckIn: 'ddmmaaaa'");
                    String dataEntrada = sc.nextLine();
                    System.out.println("Informe a data para CheckOut: 'ddmmaaaa'");
                    String dataSaida = sc.nextLine();
                    System.out.println("Informe o tipo de quarto: \n1- Individual\n2- Coletivo");
                    int tipoQuarto = sc.nextInt();
                    sc.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()
                    System.out.println("Informe a quantidade de pessoas: ");
                    int qtdPessoas = sc.nextInt();
                    sc.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()
                    System.out.println("Informe a quantidade de camas: ");
                    int qtdCamas = sc.nextInt();
                    sc.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

                    // Calcular quantidade de diárias e valor total da reserva previamente
                    int quantidadeDiarias = CalculadoraDiarias.calcularQuantidadeDiarias(dataEntrada, dataSaida);
                    double valorDiaria = 50.0; // valor da diária
                    double valorTotal = CalculadoraDiarias.calcularValorTotal(quantidadeDiarias, valorDiaria);

                    System.out.println("Quantidade de diárias: " + quantidadeDiarias);
                    System.out.println("Valor total da reserva: R$" + valorTotal);

                    // Incluir Reserva
                    Reserva novaReserva = new Reserva();
                    novaReserva.setIdReserva(gerarIdReserva()); // Função para gerar ID inteiro
                    novaReserva.setIdQuarto(4532);
                    novaReserva.setIdCliente(12313123);
                    novaReserva.setDataEntrada(dataEntrada);
                    novaReserva.setDataSaida(dataSaida);

                    // Adicionar a nova reserva à lista de reservas
                    reservas.add(novaReserva);

                    System.out.println("Reserva incluída com sucesso! ID da Reserva: " + novaReserva.getIdReserva());
   
                    break;

                case 2:
                    // Alterar Reserva
                    System.out.println("Informe o ID da reserva que deseja alterar:");
                    int idReservaAlterar = sc.nextLine();
                    Reserva.alterarReserva(reservas, idReservaAlterar);
                    break;

                case 3:
                    // Excluir Reserva
                    System.out.println("Informe o ID da reserva que deseja excluir:");
                    int idReservaExcluir = sc.nextLine();
                    Reserva.excluirReserva(reservas, idReservaExcluir);
                    break;

                case 4:
                    // Listar Reservas
                    Reserva.listarReservas(reservas);
                    break;

                case 5:
                    // Buscar Reserva
                    System.out.println("Informe o ID da reserva que deseja buscar:");
                    int idReservaBuscar = sc.nextLine();
                    Reserva.buscarReserva(reservas, idReservaBuscar);
                    break;

                case 6:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }

        } while (opcao != 6);
    }
}
