package Atividade2.EX8;

public class Pneus {
    private int preco;
    private String tipo, fabricante;

    public Pneus(int preco, String tipo, String fabricante){
        this.setPreco(preco);
        this.setTipo(tipo);
        this.setFabricante(fabricante);
    }
    public Pneus(){
        this(0,"","");
    }

    public int getPreco() {
        return this.preco;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
