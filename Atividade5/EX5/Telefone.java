package EX5;

public class Telefone {
    private int ddi;
    private int dd;
    private int numero;

    Telefone(int ddi, int dd, int numero) {
        this.ddi = ddi;
        this.dd = dd;
        this.numero = numero;
    }

    protected int getDdi() {
        return this.ddi;
    }

    protected int getDd() {
        return this.dd;
    }

    protected int getNumero() {
        return this.numero;
    }

    public String toString() {
        String str = "+" + String.valueOf(getDdi()) + " (" + String.valueOf(getDd()) + ") " + String.valueOf(getNumero());
        return str;
    }

}
