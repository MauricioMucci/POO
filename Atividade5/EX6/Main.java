package Atividade5.EX6;

public class Main {
    public static void main(String[] args) {
        Computador a, b, c;

        a = new Computador(new Processador("INTEL"), new Memoria(128), new Teclado(), new Mouse());
        b = new Computador(new Memoria(256), new Teclado(), new Mouse());
        c = new Computador(new Processador("AMD"), new Teclado(), new Mouse());

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
    }
}
