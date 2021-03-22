import java.util.Scanner;

/*
    Este programa realiza a diferenca "positiva" entre dois numeros
*/

public class ex11 {
    public static void main(String[] args) {
        
        int X, Y, resultado;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o primeiro valor?");
            X = teclado.nextInt();

        System.out.println("Qual o segundo valor?");
            Y = teclado.nextInt();

        resultado = (X > Y) ? (X - Y) : (Y - X);

        System.out.println("Resultado = " + resultado);

        teclado.close();
    }
}
