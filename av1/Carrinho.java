import java.util.ArrayList;

public class Carrinho {
    private ArrayList<itensCarrinho> itensNoCarrinho;

    public Carrinho() {
        this.itensNoCarrinho = new ArrayList<itensCarrinho>();
    }

    public void adicionarItem(int idProduto, int quantidade) {
        itensCarrinho item = new itensCarrinho(idProduto, quantidade);
        itensNoCarrinho.add(item);
    }

    public double calcularValorTotal(ArrayList<Produto> listaProdutos) {
        double total = 0;
        for (itensCarrinho item : itensNoCarrinho) {
            int idProduto = item.getIdProduto();
            int quantidade = item.getQuantidade();
            for (Produto produto : listaProdutos) {
                if (produto.getId() == idProduto) {
                    total += produto.getValor() * quantidade;
                }
            }
        }
        return total;
    }

    public void listarItensNoCarrinho() {
        for (itensCarrinho item : itensNoCarrinho) {
            System.out.println("Id do Produto: " + item.getIdProduto() + " | Quantidade: " + item.getQuantidade());
        }
    }
}
