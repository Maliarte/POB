  import java.util.ArrayList;

  public class Cliente {
      private String nome;
      private ArrayList<Produto> produtos = new ArrayList<Produto>();

      public Cliente(String nome) {
          this.nome = nome;
      }

      public String getNome() {
          return nome;
      }
     
      public void setNome(String nome) {
	   	this.nome = nome;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public void adicionarProduto(Produto produto) {
          produtos.add(produto);
      }

  public void listarProdutos() {
          for (Produto p : produtos) {
              System.out.println(p);
          }
      }
  }
