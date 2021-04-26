package EX5;

public class Contato {
    private String nome;
    private String cidade;
    private Telefone info;

    Contato(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public void adicionaTelefone(Telefone a) {
        this.info = a;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCidade() {
        return this.cidade;
    }

    public String getInfo() {
        return this.info.toString();
    }

    public String toString() {
        String str = "Nome: " + this.getNome() + "\nCidade: " + this.getCidade() + "\nInformacoes de contato: " + this.getInfo() + "\n"; 
        
        return str;
    }
}
