package Atividade5.EX6;

public class Computador extends Gabinete {
    private Teclado c;
    private Mouse d;

    Computador(Memoria b, Teclado c, Mouse d) {
        super(b);
        this.c = c;
        this.d = d;
    }  

    Computador(Processador a, Teclado c, Mouse d) {
        super(a);
        this.c = c;
        this.d = d;
    }  

    Computador(Processador a, Memoria b, Teclado c, Mouse d) {
        super(a,b);
        this.c = c;
        this.d = d;
    }    

    public int retornaPreco() {
        return super.retornaPreco() + this.c.retornaPreco() + this.d.retornaPreco();
    }

    public String toString() {
        String str = "\t[Computador]" + "\nComponentes: " + super.toString() + this.c.toString() + this.d.toString() + "\n";

        return str;
    }
}
