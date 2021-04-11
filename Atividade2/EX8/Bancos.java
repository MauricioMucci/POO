package Atividade2.EX8;

public class Bancos {
    private int preco;
    private String modelo, fabricante;

    public Bancos(){
    }

    public Bancos(int preco, String modelo, String fabricante){
        this.preco = preco;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    public int getPreco() {
        return this.preco;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String toString(){
        String str = "Descricao:\nR$" + String.valueOf(this.preco) + "\nModelo: " + this.modelo + "\nFabricante: " + this.fabricante + "\n";
        return str;
    }
}