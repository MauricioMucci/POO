package Atividade2.EX8;

public class Carro {
    Pneus a;
    Motor b;
    Bancos c;

    public Carro(){
        this.a = new Pneus();
        this.b = new Motor();
        this.c = new Bancos();
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

    public int soma(){
        int soma;

        soma = this.a.getPreco() + this.b.getPreco() + this.c.getPreco();

        return soma;
    }
}