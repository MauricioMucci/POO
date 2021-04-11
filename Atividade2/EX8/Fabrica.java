package Atividade2.EX8;

public class Fabrica {
    public static void main(String[] args) {

        Pneus p = new Pneus(157, "ELX", "GM");
        Motor m = new Motor(1000, 3540, "GM");
        Bancos b = new Bancos(548, "Americano", "GM");

        Carro camaro = new Carro(p, m, b);

        System.out.println("Camaro: " + camaro.soma());

        System.out.println(camaro.toString());
    }
}
