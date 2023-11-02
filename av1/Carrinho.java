import java.util.ArrayList;

public class Carrinho {
    private ArrayList<itensCarrinho> itensNoCarrinho; 
    private ArrayList<Produto> listaProdutos; // Acesso à lista de produtos em estoque
    

    public Carrinho() {
        this.itensNoCarrinho = new ArrayList<itensCarrinho>();
    }
  
    public ArrayList<itensCarrinho> getItens() {
        return itensNoCarrinho;
    }
  

  

}
