package Atividade5.EX4;

public class Cilindro extends Circulo {
    private double altura;

    Cilindro(double raio, double altura){
        super(raio);
        this.altura = altura;
    }

    public double getArea(){
        return 2*super.getArea() + this.altura*super.getPerimetro();
    }

    public double getVolume(){
        return this.altura * super.getArea();
    }
}
