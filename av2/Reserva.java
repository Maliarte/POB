import java.util.List;
import java.util.ArrayList;

public class Reserva {
    private int idReserva;
    private int idQuarto;
    private int idCliente;
    private String dataEntrada;
    private String dataSaida;

    private static List<Reserva> reservas = new ArrayList<>();

    public Reserva() {
        // Construtor vazio
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

    public static void excluirReserva(int idReserva) {
        reservas.removeIf(reserva -> reserva.getIdReserva() == idReserva);
        System.out.println("Reserva excluída com sucesso!");
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
