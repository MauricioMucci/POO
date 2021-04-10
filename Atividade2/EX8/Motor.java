package Atividade2.EX8;

public class Motor {
    private int potencia, preco;
    private String fabricante;

    public Motor(int potencia, int preco, String fabricante){
        this.setPreco(preco);
        this.setPotencia(potencia);
        this.setFabricante(fabricante);
    }
    public Motor(){
        this(0,0,"");
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
}
