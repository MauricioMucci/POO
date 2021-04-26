package EX6;

public class Processador implements Item {
    private int preco;
    private String modelo;

    Processador(String modelo) {
        this.modelo = modelo;
        this.preco = 150;
    }

    public int retornaPreco() {
        return this.preco;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String toString() {
        String str = "\t[Processador]" + "\nModelo: " + this.getModelo() + "\nPreco: " + String.valueOf(this.retornaPreco()) + "\n";

        return str;
    }
}
