package EX6dif;

public class Main {
    public static void main(String[] args) {
        Computador a, b, c, d;
        
        a = new Computador(new Gabinete(new Processador("INTEL"), new Memoria(256)), new Monitor(22.5), new Teclado(), new Mouse());

        b = new Computador(new Gabinete(new Memoria(128)), new Teclado(), new Mouse());
        
        c = new Computador(new Gabinete(new Processador("AMD")), new Monitor(17.5), new Teclado());

        d = new Computador(new Gabinete(new Processador("AMD"), new Memoria(512)), new Monitor(17.5), new Mouse());

        imprimir(a);
        imprimir(b);
        imprimir(c);
        imprimir(d);
    }

    private static void imprimir(Computador b) {
        System.out.println(b.toString());
    }
}