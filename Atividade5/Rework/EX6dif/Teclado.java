package EX6dif;

public class Teclado extends ItemAvulso {
    
    Teclado() {
        this.preco = 30;
        this.id = "ZXCV";
    }
    
    public String retornaID() {
        return this.id;
    }

    public String toString() {
        String str = "\t[Teclado]" + "\nPreco: " + String.valueOf(this.retornaPreco()) + "\nIdentificador: " + this.retornaID() + "\n";

        return str;
    }
}
