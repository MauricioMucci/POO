package Atividade2.EX8;

public class Motor {
    private int potencia, preco;
    private String fabricante;


    public Motor(){
    }

    public Motor(int potencia, int preco, String fabricante){
        this.preco = preco;
        this.potencia = potencia;
        this.fabricante = fabricante;
    }

    public int getPreco() {
        return this.preco;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String toString(){
        String str = "Descricao:\nR$" + String.valueOf(this.preco) + "\nPotencia: " + String.valueOf(this.potencia) + "\nFabricante: " + this.fabricante + "\n";
        return str;
    }
}
