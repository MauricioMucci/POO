package Atividade1;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {

        int X, Y;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o valor de X?");
            X = teclado.nextInt();
        System.out.println("Qual o valor de Y?");
            Y = teclado.nextInt();

        if (X < Y) {
            if ((Y % X) == 0) {
                System.out.printf("Entradas: %d e %d ==> %d e multiplo de %d\n", X, Y, X, Y);
            } else
            {
                System.out.printf("Entradas: %d e %d ==> %d nao e multiplo de %d", X, Y, Y, X); 
            } 
        } else {
            if ((X % Y) == 0) {
                System.out.println("Entradas: " + X + " e " + Y + " ==> " + X + " e multiplo de " + Y);
            } else
            {
                System.out.println("Entradas: " + X + " e " + Y + " ==> " + X + " nao e multiplo de " + Y);
            }
        }

        teclado.close();
    }    
}
