package Atividade1;

import java.util.Scanner;

/*
    Este programa le 3 numeros do usario, faz a soma entre eles,
    faz a media entre eles, e verifca o maior e menor
*/


public class ex8 {
    public static void main(String[] args) {

        int a, b, c, soma, max, min;
        float media;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        a = teclado.nextInt();

        System.out.println("Informe o segundo numero: ");
        b = teclado.nextInt();

        System.out.println("Informe o terceiro numero: ");
        c = teclado.nextInt();

        soma = a + b + c;

        media = soma/3;

        max = ((a > b) && (a > c)) ? a : ((b > c) ? b : c);
        min = ((a < b) && (a < c)) ? a : ((b < c) ? b : c);

        System.out.println("Soma = " + soma + "\nMedia = " + media + "\nMaximo = " + max + "\nMinimo = " + min);
        
        teclado.close();
    }
}
