package Atividade5.EX4;

abstract class Circulo {
    protected double raio;

    Circulo(double raio){
        this.raio = raio;
    }

    public double getPerimetro(){
        return 2 * 3.14 * this.raio;
    }

    public double getArea(){
        return 3.14 * Math.pow(this.raio, 2);
    }
}
