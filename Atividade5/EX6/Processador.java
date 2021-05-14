package Atividade5.EX6;

public class Processador implements Item {
    private int preco;
    private String id;
    private String modelo;

    Processador(String modelo) {
        this.modelo = modelo;
        this.id = "WXYZ";
        this.preco = 150;
    }

    public int retornaPreco() {
        return this.preco;
    }

    public String getId() {
        return this.id;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String toString() {
        String str = "\t[Processador]" + "\nModelo: " + this.getModelo() + "\nPreco: " + String.valueOf(this.retornaPreco()) + "\nIdentificador: " + this.getId() + "\n";

        return str;
    }
}
