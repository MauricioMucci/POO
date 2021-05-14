package Atividade5.EX6;

public class Memoria implements Item {
    private int preco;
    private String id;
    private int capacidade;

    Memoria(int capacidade) {
        this.capacidade = capacidade;
        this.preco = capacidade * 50;
        this.id = "ABCD";
    }

    public int retornaPreco() {
        return this.preco;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public String getId() {
        return this.id;
    }

    public String toString() {
        String str = "\t[Memoria]" + "\nTamanho da memoria: " + String.valueOf(this.getCapacidade()) + "GB" + "\nPreco: " + String.valueOf(this.retornaPreco()) + "\nIdentificador: " + this.getId() + "\n";

        return str;
    }
}
