public class Cliente {
    
    private String nome;
    private String telefone;
    private Endereço endereço;

    public Cliente(String nome, String telefone, Endereço endereço) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereço = endereço;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Endereço getEndereço() {
        return endereço;
    }
    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }
}
