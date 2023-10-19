

class Produto {
    String nome;
    int id;
    double valor;
    int quant;

    public Produto(String nome, int id, int quant, double valor) {
        this.nome = nome;
        this.id = id;
        this.quant = quant;
        this.valor = valor;
    }


    @Override
    public String toString() {
        return "Produto: " + nome + " | Id: " + id + "  | Quantidade: " + quant + " | Valor: R$" + valor;
    }


    public int getId() {
        return 0;
    }


    public int getValor() {
        return 0;
    }
}

