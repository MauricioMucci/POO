package EX6;

public class Mouse implements Item {
    private int preco;
    private String id;

    Mouse() {
        this.preco = 20;
        this.id = "ASDF";
    }
    
    public int retornaPreco() {
        return this.preco;
    }

    public String getId() {
        return this.id;
    }

    public String toString() {
        String str = "\t[Mouse]" + "\nPreco: " + String.valueOf(this.retornaPreco()) + "\nIdentificador: " + this.getId() + "\n";

        return str;
    }
}
