import java.util.Scanner;

public class Quarto {
    private int idQuarto;
    private String nomeQuarto;
    private int qtdCama;
    private Boolean temBanheiro;
    private String descricao;

    //  getters e setters 
    public void detalharVagas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Detalhes das Vagas no Quarto:");
        System.out.println("Escolha o tipo de quarto:");
        System.out.println("1. Quarto de 4 vagas (com banheiro)");
        System.out.println("2. Quarto de 8 vagas (sem banheiro)");
        System.out.println("3. Quarto de 12 vagas (com banheiro)");

        int opcaoQuarto = scanner.nextInt();

        switch (opcaoQuarto) {
            case 1:
                System.out.println("Vagas disponíveis: 4");
                System.out.println("Possui Banheiro");
                break;
            case 2:
                System.out.println("Vagas disponíveis: 8");
                System.out.println("Não Possui Banheiro");
                break;
            case 3:
                System.out.println("Vagas disponíveis: 12");
                System.out.println("Possui Banheiro");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();
    }

    // Método para verificar disponibilidade de vagas com ou sem banheiro
    public void verificarDisponibilidadeVagas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de quarto:");
        System.out.println("1. Quarto de 4 vagas (com banheiro)");
        System.out.println("2. Quarto de 8 vagas (sem banheiro)");
        System.out.println("3. Quarto de 12 vagas (com banheiro)");

        int opcaoQuarto = scanner.nextInt();

        switch (opcaoQuarto) {
            case 1:
                System.out.println("Quarto de 4 vagas com banheiro. Vagas disponíveis:");
                detalharVagas();
                break;
            case 2:
                System.out.println("Quarto de 8 vagas sem banheiro. Vagas disponíveis:");
                detalharVagas();
                break;
            case 3:
                System.out.println("Quarto de 12 vagas com banheiro. Vagas disponíveis:");
                detalharVagas();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();
    }
}
