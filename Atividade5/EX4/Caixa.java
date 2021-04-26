package EX4;

public class Caixa extends Retangulo {
    private double altura;

    Caixa(double a, double b, double altura){
        super(a, b);
        this.altura = altura;
    }

    public double getArea(){
        return 2 * (super.getArea() + (this.base1 * this.altura) + (this.base2 * this.altura));
    }

    public double getVolume(){
        return super.getArea() * this.altura;
    }
}
