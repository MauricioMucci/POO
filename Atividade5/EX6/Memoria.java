package EX6;

public class Memoria implements Item {
    private int preco;
    private int capacidade;

    Memoria(int capacidade) {
        this.capacidade = capacidade;
        this.preco = capacidade * 50;
    }

    public int retornaPreco() {
        return this.preco;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public String toString() {
        String str = "\t[Memoria]" + "\nTamanho da memoria: " + String.valueOf(this.getCapacidade()) + "GB" + "\nPreco: " + String.valueOf(this.retornaPreco()) + "\n";

        return str;
    }
}
