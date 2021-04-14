package Atividade3;

public class ex14 {
    public static void main(String[] args) {
        int [][] a, b, c;
        int multiplicacao, soma;

        a = new int[5][4];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = (i + 1) * (j + 1);
            }
        }

        b = new int[4][6];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                b[i][j] = (i + 2) * (j + 1);
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d  ", a[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("%d  ", b[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        c = new int[5][6];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 4; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("%d  ", c[i][j]);
            }
            System.out.println();
        }
        System.out.println();

    }
    
}
