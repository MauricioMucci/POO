package Atividade1;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {

        int tempo, horas, minutos;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Quanto tempo foi gasto em minutos?");
            tempo = teclado.nextInt();

        horas = tempo / 60;
        minutos = tempo%60;
        
        System.out.println(horas + ":" + minutos);
        
        teclado.close();
    }
}
