package Atividade2.EX8;

public class Carro {
    private Pneus a;
    private Motor b;
    private Bancos c;

    public Carro(){
        this.a = new Pneus();
        this.b = new Motor();
        this.c = new Bancos();
    }

    public Carro(Pneus a,Motor b,Bancos c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setPneu(int p, String t, String f){
        this.a.setPreco(p);
        this.a.setTipo(t);
        this.a.setFabricante(f);
    }

    public void setMotor(int pot, int p, String f){
        this.b.setPreco(p);
        this.b.setPotencia(pot);
        this.b.setFabricante(f);
    }

    public void setBanco(int p, String m, String f){
        this.c.setPreco(p);
        this.c.setModelo(m);
        this.c.setFabricante(f);
    }

    public String toString(){
        String str = a.toString() + b.toString() + c.toString();
        return str;
    }

    public int soma(){
        int soma;

        soma = this.a.getPreco() + this.b.getPreco() + this.c.getPreco();

        return soma;
    }
}