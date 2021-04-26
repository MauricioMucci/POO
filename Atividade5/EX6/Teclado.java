package EX6;

public class Teclado implements Item {
    private int preco;

    Teclado() {
        this.preco = 30;
    }
    
    public int retornaPreco() {
        return this.preco;
    }

    public String toString() {
        String str = "\t[Teclado]" + "\nPreco: " + String.valueOf(this.retornaPreco()) + "\n";

        return str;
    }
}
