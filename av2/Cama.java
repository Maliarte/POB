import java.util.Scanner;

public class Cama {
    private int idCama;
    private int codigoQuarto;
    private int qtdCama;
    private Boolean ehBeliche;
    private String posicao;
    private String descricao;

    public int getIdCama() {
        return idCama;
    }

    public void setIdCama(int idCama) {
        this.idCama = idCama;
    }

    public int getCodigoQuarto() {
        return codigoQuarto;
    }

    public void setCodigoQuarto(int codigoQuarto) {
        this.codigoQuarto = codigoQuarto;
    }

    public int getQtdCama() {
        return qtdCama;
    }

    public void setQtdCama(int qtdCama) {
        this.qtdCama = qtdCama;
    }

    public Boolean getEhBeliche() {
        return ehBeliche;
    }

    public void setEhBeliche(Boolean ehBeliche) {
        this.ehBeliche = ehBeliche;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Métodos da classe Cama

    public void escolherTipoCama() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de cama:");
        System.out.println("1. Cama Beliche Superior");
        System.out.println("2. Cama Beliche Inferior");
        System.out.println("3. Cama Solteiro");

        int opcaoCama = scanner.nextInt();

        // Lógica para lidar com a escolha do usuário
        switch (opcaoCama) {
            case 1:
                System.out.println("Você escolheu Cama Beliche Superior.");
                
                break;
            case 2:
                System.out.println("Você escolheu Cama Beliche Inferior.");
                
                break;
            case 3:
                System.out.println("Você escolheu Cama Solteiro.");
               
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
