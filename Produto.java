public class Produto {
    String descricao;
    Double valor;
    Double quantidade;

    public Produto (String descricao, Double valor, Double quantidade) {
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getDescricao () {
        return descricao;
    }

    public Double getValor () {
        return valor;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
}