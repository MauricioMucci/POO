package Atividade2.EX8;

public class Fabrica {
    public static void main(String[] args) {
        
        Carro camaro = new Carro();

        camaro.setBanco(100, "ELX", "GM");
        camaro.setMotor(1000, 200, "GM");
        camaro.setPneu(300, "Aro 15", "GM");

        System.out.println("Camaro: " + camaro.soma());
    }
}
