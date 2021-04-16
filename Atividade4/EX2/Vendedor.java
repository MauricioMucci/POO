package Atividade4.EX2;

public class Vendedor extends Empregado{
    private int qntVendas;
    private double valorVendas;

    Vendedor(String nome, String genero, int idade){
        super(nome, genero, idade);
        this.qntVendas = 0;
        this.valorVendas = 0.0;
    }

    private int getQntVendas() {
        return this.qntVendas;
    }

    private double getValorVendas() {
        return this.valorVendas;
    }

    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public String toString(){
        String str = "\nNome: " + this.getNome() + "\nSalario: " + String.valueOf(this.getSalario()) + "\nValor das vendas: " + String.valueOf(this.getValorVendas()) + "\nQuantidade de vendas: " + String.valueOf(this.getQntVendas());

        return str;
    }
}
