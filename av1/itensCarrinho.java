public class itensCarrinho {
      public int idProduto;
      public int quantidade;

      public itensCarrinho(int idProduto, int quantidade) {
          this.idProduto = idProduto;
          this.quantidade = quantidade;
      }

      public int getIdProduto() {
          return idProduto;
      }

      public void setIdProduto(int idProduto) {
          this.idProduto = idProduto;
      }

      public int getQuantidade() {
          return quantidade;
      }

      public void setQuantidade(int quantidade) {
          this.quantidade = quantidade;
      }
  }
