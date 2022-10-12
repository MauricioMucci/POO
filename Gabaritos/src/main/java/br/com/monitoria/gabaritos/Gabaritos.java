package br.com.monitoria.gabaritos;

import br.com.monitoria.gabaritos.exercicios.Pessoa;
import br.com.monitoria.gabaritos.exercicios.Universidade;
import br.com.monitoria.gabaritos.tarefa1.Criatura;
import br.com.monitoria.gabaritos.tarefa1.Humano;
import br.com.monitoria.gabaritos.tarefa1.Personagem;
import br.com.monitoria.gabaritos.tarefa3.Animal;
import br.com.monitoria.gabaritos.tarefa3.Cachorro;
import br.com.monitoria.gabaritos.tarefa3.Gato;
import br.com.monitoria.gabaritos.tarefa3.Porco;
import br.com.monitoria.gabaritos.tarefa3.Vaca;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mauricio
 */
public class Gabaritos {

    public static void main(String[] args) {
        int option;
        try ( Scanner scanf = new Scanner(System.in)) {
            do {
                System.out.println(
                        "-----------------------------------------------------------\n"
                        + "\t\t\tHello World!\n"
                        + "-----------------------------------------------------------");
                System.out.println("Escolha a tarefa:\n"
                        + "1. RPG\n"
                        + "2. RPG explicação\n"
                        + "3. Fazenda\n"
                        + "4. Calculadora\n"
                        + "5. Pessoa e Universidade\n"
                        + "6. Fibonacci\n"
                        + "7. Investimento\n"
                        + "8. Raiz Quadrada\n"
                        + "9. Ackermann\n"
                        + "0.Sair");
                option = scanf.nextInt();
                scanf.nextLine();

                switch (option) {
                    case 0 ->
                        System.out.println("\n[ Saindo... ]\n");
                    case 1 ->
                        tarefa1(scanf);
                    case 2 ->
                        tarefa2();
                    case 3 ->
                        tarefa3();
                    case 4 ->
                        tarefa4();
                    case 5 ->
                        exercicioPessoaUniversidade();
                    case 6 ->
                        fibonacci(scanf);
                    case 7 ->
                        investe(scanf);
                    case 8 ->
                        raiz(scanf);
                    case 9 ->
                        ackermann(scanf);
                    default ->
                        System.out.println("\n[ Opcão Inválida! ]\n");
                }
            } while (option != 0);
        }

    }

    public static void tarefa1(Scanner scanf) {
        Personagem humano = new Humano();
        Personagem criatura = new Criatura();

        humano.criarPersonagem(scanf);
        scanf.nextLine();
        criatura.criarPersonagem(scanf);

        if (humano.getPoderDeAtaque() > criatura.getPoderDeDefesa()) {
            System.out.println("\n[ " + humano.toString() + " venceu! ]\n");
        } else if (humano.getPoderDeAtaque() == criatura.getPoderDeDefesa()) {
            System.out.println("\n[ " + humano.toString() + " empatou com " + criatura.toString() + " ]\n");
        } else {
            System.out.println("\n[ " + criatura.toString() + " venceu! ]\n");
        }
    }

    public static void tarefa2() {
        System.out.println("\n-----------------------------------------------------------");
        System.out.println("[ Me consulte na monitoria para eu passar observações sobre o por que montei "
                + "as classes Personagem, Humano e Criatura dessa forma :) ]");
        System.out.println("-----------------------------------------------------------\n");
    }

    public static void tarefa3() {
        List<Animal> animal = new ArrayList();
        Cachorro c = new Cachorro();
        c.setNome("Zeus");
        Gato g = new Gato();
        g.setNome("Poseidon");
        Vaca v = new Vaca();
        v.setNome("Atenas");
        Porco p = new Porco();
        p.setNome("Hades");

        animal.add(c);
        animal.add(g);
        animal.add(v);
        animal.add(p);

        System.out.println("\n-----------------------------------------------------------");
        // utilizei algo chamado expressão lambda caso tenham interesse! (Programação Funcional)
        // pode ser substituido por um foreach comum caso tenham dúvidas me procurem!
        animal.forEach(obj -> System.out.println(obj.toString()));
        System.out.println("-----------------------------------------------------------\n");
    }

    public static void tarefa4() {
        System.out.println("\n-----------------------------------------------------------");
        System.out.println("[ Rodar o arquivo (Formulário.java) do package: br.com.monitoria.gabaritos.tarefa4 ]");
        System.out.println("-----------------------------------------------------------\n");
    }

    private static void exercicioPessoaUniversidade() {
        List<Pessoa> p = Arrays.asList(
                new Pessoa(14, 3, 1879, "Albert Einstein", "Anglo", "albert@gmail.com", "935.981.810-00"),
                new Pessoa(4, 1, 1643, "Isaac Newton", "Capao", "isac@gmail.com", "997.168.980-45")
        );

        List<Universidade> u = Arrays.asList(
                new Universidade("Princeton"),
                new Universidade("Cambridge")
        );

        System.out.println("\n-----------------------------------------------------------");
        // utilizei algo chamado method reference caso tenham interesse! caso tenham duvidas me procurem!
        p.forEach(Pessoa::calculaIdade);
        p.forEach(obj -> System.out.println(obj.getNome() + " tem " + obj.getIdade() + " anos"));
        System.out.println("-----------------------------------------------------------\n");

        p.get(0).setUni(u.get(0));
        p.get(1).setUni(u.get(1));

        System.out.println("\n-----------------------------------------------------------");
        p.forEach(System.out::println);
    }

    private static int calcFib(int n) {
        return n < 2 ? n : calcFib(n - 1) + calcFib(n - 2);
    }

    private static void fibonacci(Scanner scanf) {
        int numero = 0;
        while (numero <= 0) {
            System.out.println("\n-----------------------------------------------------------");
            System.out.print("INSIRA UM NUMERO MAIOR DO QUE ZERO: ");
            numero = scanf.nextInt();
            System.out.println("-----------------------------------------------------------");
        }
        for (int i = 0; i < numero; i++) {
            System.out.println(calcFib(i));
        }
    }

    private static double calcInvest(double i, double t) {
        double resul = 0;
        for (int mes = 1; mes <= 12; mes++) {
            resul = i * (1.0 + t / 100) + resul * (1.0 + t / 100);
        }
        return resul;
    }

    private static void investe(Scanner scanf) {
        //investimento e taxa
        double i, t, ano = 1;
        String option;
        System.out.println("\n-----------------------------------------------------------");
        System.out.print("Insira o valor do investimento mensal: ");
        i = scanf.nextDouble();
        System.out.print("Insira o valor da taxa: ");
        t = scanf.nextDouble();
        scanf.nextLine();
        double resul = calcInvest(i, t);
        do {
            System.out.println("Resultado apos " + ano + " ano(s): " + resul);
            System.out.println("Deseja proseguir(s/n)?");
            option = scanf.nextLine();
            if (option.equals("s")) {
                resul = calcInvest(resul, t);
                ano++;
            }
            System.out.println("-----------------------------------------------------------");
        } while (!option.equals("n"));

    }

    private static int calcRaiz(int numero) {
        int i = 1, resul = 0;
        while (numero >= i) {
            numero -= i;
            i += 2;
            resul++;
        }
        return resul;
    }

    private static void raiz(Scanner scanf) {
        int numero = 0;
        while (numero <= 0) {
            System.out.println("\n-----------------------------------------------------------");
            System.out.print("INSIRA UM NUMERO MAIOR OU IGUAL A ZERO: ");
            numero = scanf.nextInt();
            System.out.println("-----------------------------------------------------------");
        }
        System.out.println("A parte inteira da raiz de " + numero + " = " + calcRaiz(numero));
    }

    private static void ackermann(Scanner scanf) {
        int m, n;
        System.out.println("\n-----------------------------------------------------------");
        System.out.print("Insira o valor de m: ");
        m = scanf.nextInt();
        System.out.print("Insira o valor de n: ");
        n = scanf.nextInt();
        System.out.println("-----------------------------------------------------------");
        scanf.nextLine();
        
        try {
            System.out.println("Resultado: " + calcAckermann(m, n));
        } catch (IllegalAccessException ex) {
            System.out.println("ERRO");
        }
    }

    private static int calcAckermann(int m, int n) throws IllegalAccessException {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return calcAckermann(m - 1, 1);
        } else if (m > 0 && n > 0) {
            return calcAckermann(m - 1, calcAckermann(m, n - 1));
        } else {
            throw new IllegalAccessException("Valores negativos");
        }
    }

}
