package EX6;

public class Teclado implements Item {
    private int preco;
    private String id;

    Teclado() {
        this.preco = 30;
        this.id = "ZXCV";
    }
    
    public int retornaPreco() {
        return this.preco;
    }

    public String getId() {
        return this.id;
    }

    public String toString() {
        String str = "\t[Teclado]" + "\nPreco: " + String.valueOf(this.retornaPreco()) + "\nIdentificador: " + this.getId() + "\n";

        return str;
    }
}
