package br.com.monitoria.gabaritos.tarefa1;

import java.util.Scanner;

/**
 *
 * @author mauricio
 */
public class Humano extends Personagem {

    @Override
    public void criarPersonagem(Scanner scanf) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Qual o nome do Humano?");
        nome = scanf.nextLine();
        System.out.println("Quanto é o dano de ataque do Humano?");
        poderDeAtaque = scanf.nextInt();
        System.out.println("Quanto é a resistência do Humano?");
        poderDeDefesa = scanf.nextInt();
        System.out.println("-----------------------------------------------------------");
    }

    @Override
    public String toString() {
        return Humano.class.getSimpleName() + ": " + this.getNome();
    }
}
