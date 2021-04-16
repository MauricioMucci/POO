package Atividade3.EX15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);        
        
        int linha, coluna;

        System.out.print("Qual a quantidade de linhas?\nR: ");
            linha = scanf.nextInt();    
        System.out.print("Qual a quantidade de colunas?\nR: ");
            coluna = scanf.nextInt();
            
        MatrizDeInteiros matriz = new MatrizDeInteiros(linha, coluna);

        if (matriz.ehQuadrada()) {
            System.out.println("Matriz eh quadrada");
        } else {
            System.out.println("Matriz nao eh quadrada");
        }

        matriz.novaMatriz(0, 0, 10);
        matriz.novaMatriz(0, 1, 15);
        matriz.novaMatriz(1, 0, 5);
        matriz.novaMatriz(1, 1, 20);

        System.out.printf("\nSoma = %d\n", matriz.total());

        if (matriz.busca(5) == -1) {
            System.out.println("Esse valor nao existe");
        } else {
            System.out.printf("\nEsse valor esta nessa linha %d\n", matriz.busca(5));
        }

        scanf.close();
    }
}
