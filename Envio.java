public class Envio {
    String formaDeEnvio;
    Double valorFrete;

    public Envio (String formaDeEnvio, Double valorFrete) {
        this.formaDeEnvio = formaDeEnvio;
        this.valorFrete = valorFrete;
    }

    public String getFormaDeEnvio() {
        return formaDeEnvio;
    }

    public Double getValorFrete() {
        return valorFrete;
    }

    public void setFormaDeEnvio (String formaDeEnvio) {
        this.formaDeEnvio = formaDeEnvio;
    }

    public void setValorFrete (Double valorFrete) {
        this.valorFrete = valorFrete;
    }
}