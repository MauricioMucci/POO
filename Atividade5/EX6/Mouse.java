package EX6;

public class Mouse implements Item {
    private int preco;

    Mouse() {
        this.preco = 20;
    }
    
    public int retornaPreco() {
        return this.preco;
    }

    public String toString() {
        String str = "\t[Mouse]" + "\nPreco: " + String.valueOf(this.retornaPreco()) + "\n";

        return str;
    }
}
