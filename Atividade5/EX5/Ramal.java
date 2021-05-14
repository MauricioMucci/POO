package Atividade5.EX5;

public class Ramal extends Telefone {
    private int ramal;

    Ramal(int ddi, int dd, int numero, int ramal) {
        super(ddi, dd, numero);
        this.ramal = ramal;
    }

    protected int getRamal() {
        return this.ramal;
    }

    public String toString() {
        String str = super.toString() + " Ramal: " + String.valueOf(getRamal());
        return str;
    }

}
