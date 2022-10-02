package br.com.monitoria.gabaritos;

import br.com.monitoria.gabaritos.tarefa1.Criatura;
import br.com.monitoria.gabaritos.tarefa1.Humano;
import br.com.monitoria.gabaritos.tarefa1.Personagem;
import br.com.monitoria.gabaritos.tarefa3.Animal;
import br.com.monitoria.gabaritos.tarefa3.Cachorro;
import br.com.monitoria.gabaritos.tarefa3.Gato;
import br.com.monitoria.gabaritos.tarefa3.Porco;
import br.com.monitoria.gabaritos.tarefa3.Vaca;
import java.util.ArrayList;
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
        animal.forEach(obj -> {
            System.out.println(obj.toString());
        });
        System.out.println("-----------------------------------------------------------\n");
    }

    public static void tarefa4() {
        System.out.println("\n-----------------------------------------------------------");
        System.out.println("[ Rodar o arquivo (Formulário.java) do package: br.com.monitoria.gabaritos.tarefa4 ]");
        System.out.println("-----------------------------------------------------------\n");
    }

}
