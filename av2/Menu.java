import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    // Listas para armazenar os dados
    private List<Cliente> clientes = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();
    private List<Quarto> quartos = new ArrayList<>();
    private List<Cama> camas = new ArrayList<>();

    public void Processamento() {
        int opcao = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Reserve sua locação conosco! Diárias a partir do meio dia. Escolha Quartos individuais ou Vagas coletivas");
            System.out.println("Informe a data para CheckIn: 'ddmmaaaa'");
            String dataEntrada = sc.nextLine();
            System.out.println("Informe a data para CheckOut: 'ddmmaaaa'");
            String dataSaida = sc.nextLine();
            System.out.println("Informe o tipo de quarto: \n1- Individual\n2- Coletivo");
            int tipoQuarto = sc.nextInt();
            System.out.println("Informe a quantidade de pessoas: ");
            int qtdPessoas = sc.nextInt();
            System.out.println("Informe a quantidade de camas: ");
            int qtdCamas = sc.nextInt();

            // Calcular quantidade de diárias e valor total da reserva previo
            int quantidadeDiarias = CalculadoraDiarias.calcularQuantidadeDiarias(dataEntrada, dataSaida);
            double valorDiaria = 50.0; //  valor da diária
            double valorTotal = CalculadoraDiarias.calcularValorTotal(quantidadeDiarias, valorDiaria);

            System.out.println("Quantidade de diárias: " + quantidadeDiarias);
            System.out.println("Valor total da reserva: R$" + valorTotal);

            System.out.println("Com base nas informações prévias, forneça os dados abaixo: ");
            System.out.println("1- Incluir Reserva");
            System.out.println("2- Alterar Reserva");
            System.out.println("3- Excluir Reserva");
            System.out.println("4- Listar Reservas");
            System.out.println("5- Buscar Reserva");
            System.out.println("6- Sair");

            opcao = Integer.parseInt(sc.nextLine());

            System.out.println("Opção é: " + opcao);

            switch (opcao) {
                case 1:
                    // Incluir Reserva
                    Reserva novaReserva = new Reserva();
                    novaReserva.setIdReserva(42451);
                    novaReserva.setIdQuarto(4532);
                    novaReserva.setIdCliente(12313123);
                    novaReserva.setDataEntrada(dataEntrada);
                    novaReserva.setDataSaida(dataSaida);

                    // Adicionar a nova reserva à lista de reservas
                    reservas.add(novaReserva);

                    System.out.println("Reserva incluída com sucesso!");
                    break;

                case 2:
                    // Alterar Reserva
                    System.out.println("Informe a data da reserva que deseja alterar: 'ddmmaaaa'");
                    String dataReservaAlterar = sc.nextLine();
                    Reserva.alterarReserva(reservas, dataReservaAlterar);
                    break;

                case 3:
                    // Excluir Reserva
                    System.out.println("Informe a data da reserva que deseja excluir: 'ddmmaaaa'");
                    String dataReservaExcluir = sc.nextLine();
                    Reserva.excluirReserva(reservas, dataReservaExcluir);
                    break;

                case 4:
                    // Listar Reservas
                    Reserva.listarReservas(reservas);
                    break;

                case 5:
                    // Buscar Reserva
                    System.out.println("Informe a data da reserva que deseja buscar: 'ddmmaaaa'");
                    String dataReservaBuscar = sc.nextLine();
                    Reserva.buscarReserva(reservas, dataReservaBuscar);
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
