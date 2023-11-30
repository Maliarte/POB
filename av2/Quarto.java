import java.util.Scanner;

public class Quarto {
    private int idQuarto;
    private String nomeQuarto;
    private int qtdCama;
    private Boolean temBanheiro;
    private String descricao;

    public int getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }

    public String getNomeQuarto() {
        return nomeQuarto;
    }

    public void setNomeQuarto(String nomeQuarto) {
        this.nomeQuarto = nomeQuarto;
    }

    public int getQtdCama() {
        return qtdCama;
    }

    public void setQtdCama(int qtdCama) {
        this.qtdCama = qtdCama;
    }

    public Boolean getTemBanheiro() {
        return temBanheiro;
    }

    public void setTemBanheiro(Boolean temBanheiro) {
        this.temBanheiro = temBanheiro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void detalharVagas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Detalhes das Vagas no Quarto:");
        System.out.println("Escolha o tipo de quarto:");
        System.out.println("1. Quarto de 4 vagas (com banheiro)");
        System.out.println("2. Quarto de 8 vagas (sem banheiro)");
        System.out.println("3. Quarto de 12 vagas (com banheiro)");

        int opcaoQuarto = scanner.nextInt();
        if (opcaoQuarto == 1) {
            System.out.println("Vagas disponíveis: 4");
            System.out.println("Possui Banheiro");
        } else if (opcaoQuarto == 2) {
            System.out.println("Vagas disponíveis: 8");
            System.out.println("Não Possui Banheiro");
        } else if (opcaoQuarto == 3) {
            System.out.println("Vagas disponíveis: 12");
            System.out.println("Possui Banheiro");
        } else {
            System.out.println("Opção inválida.");
            return;
        }

        scanner.close();
        int opcaoCama = scanner.nextInt();
        System.out.println("Escolha o tipo de cama:");
        System.out.println("1. Cama Beliche Superior");
        System.out.println("2. Cama Beliche Inferior");
        System.out.println("3. Cama Solteiro");


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
        }

        scanner.close();
    }
}
