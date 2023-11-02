import java.util.ArrayList;

 public class CarrinhoApp {

        private ArrayList<itensCarrinho> itens;

   

        public void adicionarItem(ArrayList<Produto> listaProdutos, Produto produto, int quantidade) {
            // Verificar se o produto com o ID especificado existe na lista de produtos
            int produtoEncontrado = 0;
            for (Produto p : listaProdutos) {
                if (p.getId() == produto.getId()) {
                    produtoEncontrado = p;
                    break;
                }
            }

            if (produtoEncontrado!= 0) {
                itensCarrinho item = new itensCarrinho(produtoEncontrado, quantidade);
                itensCarrinho.add(item);
                System.out.println("Produto adicionado ao carrinho.");
            } else {
                System.out.println("Produto não encontrado com o ID especificado.");
            }
        }

        public void removerItem(int idProduto, int quantidade) {
            itensCarrinho itemParaRemover = null;
        
            for (itensCarrinho item : itens) {
                if (itensCarrinho.getIdProduto() == idProduto) {
                    itemParaRemover = item;
                    break;
                }
            }
        
            if (itemParaRemover != null) {
                int quantidadeNoCarrinho = itemParaRemover.getQuantidade();
                if (quantidadeNoCarrinho <= quantidade) {
                    // Remova o item completamente se a quantidade a ser removida for maior ou igual à quantidade no carrinho
                    itensCarrinho.remove(itemParaRemover);
                } else {
                    // Atualize a quantidade se a quantidade a ser removida for menor
                    itemParaRemover.setQuantidade(quantidadeNoCarrinho - quantidade);
                }
        
                System.out.println("Produto removido do carrinho.");
            } else {
                System.out.println("Produto não encontrado no carrinho.");
            }
        }
        

    public  void listarItensCarrinho(CarrinhoApp carrinho) {
        System.out.println("Itens no Carrinho:");
        ArrayList<itensCarrinho> itens = carrinho.getItens();
        for (itensCarrinho item : itens) {
            System.out.println("Produto: " + item.getIdProduto().getNome() + " | Quantidade: " + item.getQuantidade());
        }
    }

    public  double calcularValorTotal() {
        ArrayList<itensCarrinho> itens = carrinho.getItens();
        double valorTotal = 0.0;

        for (itensCarrinho item : itens) {
            Produto produto = item.getIdProduto();
            int quantidade = item.getQuantidade();
            valorTotal += produto.getValor() * quantidade;
        }

        return valorTotal;
    }
   

  
    public  void finalizarCompra(ArrayList<Produto> listaProdutos, CarrinhoApp carrinho, Cliente cliente) {
      double valorTotal = carrinho.calcularValorTotal();

      // Verifique se o cliente existe na lista de clientes
      if (cliente != null) {
          
          // Atualize o estoque de produtos
          for (itensCarrinho item : carrinho.getItens()) {
              Produto produto = item.getIdProduto();
              int quantidade = item.getQuantidade();
              produto.setQuant(produto.getQuant() - quantidade);
          }

          System.out.println("Compra finalizada com sucesso!");
          System.out.println("Valor total da compra: R$" + valorTotal);
      } else {
          System.out.println("Cliente não encontrado. A compra não pode ser finalizada.");
      }
    }
}



