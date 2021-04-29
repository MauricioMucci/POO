package EX6dif;

public class Memoria extends ItemAvulso {
    private int capacidade;

    Memoria(int capacidade) {
        this.capacidade = capacidade;
        this.preco = capacidade * 50;
        this.id = "ABCD";
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public String retornaID() {
        return this.id;
    }

    public String toString() {
        String str = "[Memoria]" + "\nTamanho da memoria: " + String.valueOf(this.getCapacidade()) + "GB" + "\nPreco: " + String.valueOf(this.retornaPreco()) + "\nIdentificador: " + this.retornaID() + "\n";

        return str;
    }
}
