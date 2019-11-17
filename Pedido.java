public class Pedido {
    String formaPagamento;
    Produto produto;
    Cliente cliente;
    Envio envio;

    public Pedido (String formaPagamento, Produto produto, Cliente cliente, Envio envio) {
        this.formaPagamento = formaPagamento;
        this.produto = produto;
        this.cliente = cliente;
        this.envio = envio;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public Produto getProduto () {
        return produto;
    }

    public Cliente getCliente () {
        return cliente;
    }

    public Envio getEnvio () {
        return envio;
    }

    public void setFormaPagamento (String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setProduto (Produto produto) {
        this.produto = produto;
    }

    public void setCliente (Cliente cliente) {
        this.cliente = cliente;
    }

    public void setEnvio (Envio envio) {
        this.envio = envio;
    }
}