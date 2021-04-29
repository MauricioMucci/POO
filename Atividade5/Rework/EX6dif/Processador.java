package EX6dif;

public class Processador extends ItemAvulso {
    private String modelo;

    Processador(String modelo) {
        this.id = "WXYZ";
        this.preco = 150;
        this.modelo = modelo;
    }

    public String retornaID() {
        return this.id;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String toString() {
        String str = "[Processador]" + "\nModelo: " + this.getModelo() + "\nPreco: " + String.valueOf(this.retornaPreco()) + "\nIdentificador: " + this.retornaID() + "\n";

        return str;
    }
}
