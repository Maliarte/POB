public class itensCarrinho {
    public int idProduto;
    public int quantidade;

    public itensCarrinho(int produtoEncontrado, int quantidade) {
        this.idProduto = produtoEncontrado;
        this.quantidade = quantidade;
    }

    public  int getIdProduto() {
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
