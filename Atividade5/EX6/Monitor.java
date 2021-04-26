package EX6;

public class Monitor implements Item {
    private int preco;
    private double polegadas;

    Monitor(double polegadas) {
        this.polegadas = polegadas;
        this.preco = 350;
    }

    public int retornaPreco() {
        return this.preco;
    }

    public double getPolegadas() {
        return this.polegadas;
    }

    public String toString() {
        String str = "\t[Monitor]" + "\nTamanho: " + String.valueOf(this.getPolegadas()) + "\nPreco: " + String.valueOf(this.retornaPreco()) + "\n";

        return str;
    }
}
