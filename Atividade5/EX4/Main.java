package Atividade5.EX4;

public class Main {
    public static void main(String[] args) {
        
        Caixa a = new Caixa(2.5, 3.7, 4.0);
        Cilindro b = new Cilindro(1.7, 4.3);
        
        comparaArea(a,b);
        comparaVolume(a, b);    
    }
 
    private static void comparaArea(Caixa a, Cilindro b){
        if (a.getArea() < b.getArea()) {
            System.out.println("Area da caixa e menor\n");
        } else {
            System.out.println("Area do cilindro e menor\n");
        }
    }
 
    private static void comparaVolume(Caixa a, Cilindro b){
        if (a.getVolume() < b.getVolume()) {
            System.out.println("Volume da caixa e menor\n");
        } else {
            System.out.println("Volume do cilindro e menor\n");
        }
    }
}
