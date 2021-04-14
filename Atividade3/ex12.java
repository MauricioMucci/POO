package Atividade3;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        
        Scanner scanf = new Scanner(System.in);

        int[] a, b, c;
        int n;

        System.out.print("Qual o tamanho do vetor?\nR: ");
            n = scanf.nextInt();

        a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = scanf.nextInt();
        }

        b = new int[n];
        for (int i = 0; i < b.length; i++) {
            System.out.printf("b[%d] = ", i);
            b[i] = scanf.nextInt();
        }

        c = new int[n];
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] * b[i];
        }

        System.out.print("A = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.print("B = ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        System.out.print("C = ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();

        scanf.close();
    }
}
