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
    
      public int getQuant() {
      return id;
      }

      public void setNome(String nome) {
      this.nome = nome;
      }

     
      public void setQuant(int quant) {
      this.quant = quant;
      }
      public void setId(int id) {
      this.id = id;
      }

      public void setValor(double valor) {
      this.valor=valor;
      }

     public void removerDoEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= quant) {
            quant -= quantidade;
        } else {
            System.out.println("Quantidade inválida. Produto não removido do estoque.");
        }
    }
      
      @Override
      public String toString() {
          return "Produto: " + nome + " | Id: " + id + " | Quantidade: " + quant + " | Valor: R$" + valor;
      }
  }
