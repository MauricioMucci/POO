package EX6dif;

public class Monitor extends ItemAvulso {
    private double polegadas;

    Monitor(double polegadas) {
        this.preco = 350;
        this.id = "QWER";
        this.polegadas = polegadas;
    }

    public double getPolegadas() {
        return this.polegadas;
    }

    public String retornaID() {
        return this.id;
    }

    public String toString() {
        String str = "\t[Monitor]" + "\nDimensao: " + String.valueOf(this.getPolegadas()) + "\nPreco: " + String.valueOf(this.retornaPreco()) + "\nIdentificador: " + this.retornaID() + "\n";

        return str;
    }
}
