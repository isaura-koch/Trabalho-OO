public class Envio () {
    String formaDeEnvio
    Int valorFrete

    public Envio (String formaDeEnvio, Int valorFrete) {
        this.formaDeEnvio = formaDeEnvio;
        this.valorFrete = valorFrete;
    }

    public String getFormaDeEnvio() {
        return formaDeEnvio;
    }

    public Int getValorFrete() {
        return valorFrete;
    }

    public void setFormaDeEnvio (String formaDeEnvio) {
        this.formaDeEnvio = formaDeEnvio;
    }

    public void setValorFrete (Int valorFrete) {
        this.valorFrete = valorFrete;
    }
}