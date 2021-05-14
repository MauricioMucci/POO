package Atividade5.EX4;

abstract class Retangulo {
    protected double base1;
    protected double base2;
    
    Retangulo(double base1, double base2){
        this.base1 = base1;
        this.base2 = base2;
    }
    
    public double getPerimetro(){
        return 2*this.base1 + 2*this.base2;
    }
    
    public double getArea(){
        return this.base1 * this.base2;
    }
}
