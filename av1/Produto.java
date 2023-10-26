  public class Produto {
      private String nome;
      private int id;
      private int quant;
      private double valor;

      public Produto(String nome, int id, int quant, double valor) {
          this.nome = nome;
          this.id = id;
          this.quant = quant;
          this.valor = valor;
      }

      public String getNome() {
      return nome;
      }
      
    public int getId() {
          return id;
      }

      public double getValor() {
          return valor;
      }

      @Override
      public String toString() {
          return "Produto: " + nome + " | Id: " + id + " | Quantidade: " + quant + " | Valor: R$" + valor;
      }
  }
