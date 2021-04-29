package EX6dif;

public class Mouse extends ItemAvulso {
    
    Mouse() {
        this.preco = 20;
        this.id = "ASDF";
    }
    
    public String retornaID() {
        return this.id;
    }

    public String toString() {
        String str = "\t[Mouse]" + "\nPreco: " + String.valueOf(this.retornaPreco()) + "\nIdentificador: " + this.retornaID() + "\n";

        return str;
    }
}
