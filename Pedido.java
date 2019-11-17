public class Pedido () {
    Int numeroPedido;
    Double valorTotal;
    String formaPagamento;

    public Pedido (Int numeroPedido, Double valorTotal, String formaPagamento) {
        this.numeroPedido = numeroPedido;
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
    }

    public Int getNumeroPedido() {
        return numeroPedido;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setNumeroPedido (Int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public void setValorTotal (Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setFormaPagamento (String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}