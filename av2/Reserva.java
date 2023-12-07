import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reserva {
    private int idReserva;
    private int idQuarto;
    private int idCliente;
    private String dataEntrada;
    private String dataSaida;
    private static int ultimoId = 0;

   
    private static List<Reserva> reservas = new ArrayList<>();

    public Reserva() {
        // Construtor vazio
        // Incrementa o contador de ID e atribui à reserva atual
        this.idReserva = ++ultimoId;
    }

    public Reserva(int idReserva, int idQuarto, int idCliente, String dataEntrada, String dataSaida) {
        this.idReserva = idReserva;
        this.idQuarto = idQuarto;
        this.idCliente = idCliente;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    // Métodos getters e setters

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    // Métodos adicionais
    
    //  gerar ID inteiro
    private int gerarIdReserva() {
    return reservas.size() + 1;
    }

     // Método para verificar se faltam menos de 3 dias a partir da data atual
    private static boolean verificarMenosDe3Dias(String dataEntrada) {
        try {
            // Obtém a data atual
            LocalDate dataAtual = LocalDate.now();

            // Converte a string da data de entrada para um objeto LocalDate
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMuuuu");
            LocalDate dataReserva = LocalDate.parse(dataEntrada, formatter);

            // Calcula a diferença em dias entre a data atual e a data de entrada
            long diasRestantes = ChronoUnit.DAYS.between(dataAtual, dataReserva);

            // Retorna true se faltar menos de 3 dias, caso contrário, retorna false
            return diasRestantes < 3;
        } catch (Exception e) {
            // Trata exceções ao fazer parsing da data
            System.out.println("Erro ao verificar a diferença de dias: " + e.getMessage());
            return false; // Pode retornar false em caso de erro
        }
    }
    
    public static void adicionarReserva(Reserva novaReserva) {
        reservas.add(novaReserva);
    }

    public static void alterarReserva(int idReserva, String newDataEntrada, String newDataSaida) {
        for (Reserva reserva : reservas) {
            if (reserva.getIdReserva() == idReserva) {
                reserva.setDataEntrada(newDataEntrada);
                reserva.setDataSaida(newDataSaida);
                System.out.println("Reserva alterada com sucesso!");
                return;
            }
        }
        System.out.println("Reserva não encontrada.");
    }


    // Método para excluir uma reserva com base no ID
    public static void excluirReserva(int idReserva) {
    Reserva reservaEncontrada = buscarReserva(idReserva);
    if (reservaEncontrada != null) {
        String dataEntrada = reservaEncontrada.getDataEntrada();
        // Adicione a lógica para verificar se faltam menos de 3 dias a partir da data de entrada
        if (verificarMenosDe3Dias(dataEntrada)) {
            System.out.println("Não é possível excluir a reserva. Menos de 3 dias restantes.");
        } else {
            reservas.remove(reservaEncontrada);
            System.out.println("Reserva excluída com sucesso!");
        }
    } else {
        System.out.println("Reserva não encontrada com o ID fornecido.");
    }
}


    public static void listarReservas(List<Reserva> reservas) {
        System.out.println("Lista de Reservas:");
        for (Reserva reserva : reservas) {
            System.out.println(reserva.toString()); // Supondo que você tenha um método toString() adequado em sua classe Reserva
        }
    }

    
    public static Reserva buscarReserva(int idReserva) {
        for (Reserva reserva : reservas) {
            if (reserva.getIdReserva() == idReserva) {
                return reserva;
            }
        }
        return null; // Retorna null se a reserva não for encontrada
    }

    // Método toString para imprimir detalhes da reserva
    @Override
    public String toString() {
        return "Reserva{" +
                "idReserva=" + idReserva +
                ", idQuarto=" + idQuarto +
                ", idCliente=" + idCliente +
                ", dataEntrada='" + dataEntrada + '\'' +
                ", dataSaida='" + dataSaida + '\'' +
                '}';
    }
}
