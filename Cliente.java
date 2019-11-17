public class Cliente () {
    String nome;
    String cpf;
    String endereco;
    String contato;
    Int idCliente;

    public Cliente (String nome, String cpf, String endereco, String contato, Int idCliente) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String  getEndereco() {
        return endereco;
    }

    public String getContato() {
        return contato;
    }

    public Int getIdCliente(){
        return idCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente
    }

}