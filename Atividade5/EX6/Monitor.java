package EX6;

public class Monitor implements Item {
    private int preco;
    private String id;
    private double polegadas;

    Monitor(double polegadas) {
        this.polegadas = polegadas;
        this.id = "QWER";
        this.preco = 350;
    }

    public int retornaPreco() {
        return this.preco;
    }

    public double getPolegadas() {
        return this.polegadas;
    }

    public String getId() {
        return this.id;
    }

    public String toString() {
        String str = "\t[Monitor]" + "\nTamanho: " + String.valueOf(this.getPolegadas()) + "\nPreco: " + String.valueOf(this.retornaPreco()) + "\nIdentificador: " + this.getId() + "\n";

        return str;
    }
}
