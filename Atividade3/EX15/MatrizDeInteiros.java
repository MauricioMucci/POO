package Atividade3.EX15;

public class MatrizDeInteiros {
    private int[][] matriz;

    MatrizDeInteiros(int linha, int coluna){
        this.matriz = new int[linha][coluna];
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                this.matriz[i][j] = 0;
            }
        }
    }

    public void novaMatriz(int linha, int coluna, int valor){
        
        if ((linha >= this.matriz.length) || (coluna >= this.matriz[0].length)) {
            System.out.println("ERROR: POSICAO NAO EXISTE");
        } else {
            this.matriz[linha][coluna] = valor;
        }
    }

    public boolean ehQuadrada(){
        if (this.matriz.length == this.matriz[0].length) {
            return true;
        } else {
            return false;
        }
    }

    public int total(){
        int soma = 0;
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[0].length; j++) {
                soma += this.matriz[i][j];
            }
        }
        return soma;
    }

    public int busca(int valor){
        int i, j;
        
        for (i = 0; i < this.matriz.length; i++) {
            for (j = 0; j < this.matriz[0].length; j++) {
                if (valor == this.matriz[i][j]) {
                    return i;
                }
            }
        }
        return -1;
    }
}
