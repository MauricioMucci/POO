package Atividade3;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        
        Scanner scanf = new Scanner(System.in);

        int[][] matriz;
        int col, lin;

        System.out.print("Numero de colunas e: ");
            col = scanf.nextInt();
        System.out.print("Numero de linhas e: ");
            lin = scanf.nextInt();


        matriz = new int[lin][col];

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                matriz[i][j] = i*j;
            }
        }

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }

        scanf.close();
    }
    
}
