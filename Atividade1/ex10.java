package Atividade1;

import java.util.Scanner;

/*
    Este programa faz a potencia dos numeros base e expoente,
    atraves de um loop --while
*/

public class ex10 {
    public static void main(String[] args) {
        
        int base, expoente, resultado = 1, counter = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a base: ");
            base = teclado.nextInt();
        System.out.print("Informe o expoente: ");
            expoente = teclado.nextInt();

        //resultado = Math.pow(base, expoente); --trocar para resultado para tipo double
        
        while (counter < expoente) {
            resultado *= base;
            counter++;
        }

        System.out.println("Resultado = " + resultado);

        teclado.close();
    }
}
