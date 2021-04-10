package Atividade2.EX8;

public class Bancos {
    private int preco;
    private String modelo, fabricante;

    public Bancos(int preco, String modelo, String fabricante){
        this.setPreco(preco);
        this.setModelo(modelo);
        this.setFabricante(fabricante);
    }
    public Bancos(){
        this(0,"","");
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
}