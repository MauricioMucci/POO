package br.com.monitoria.gabaritos.tarefa1;

import java.util.Scanner;

/**
 *
 * @author mauricio
 */
public class Criatura extends Personagem {

    @Override
    public void criarPersonagem(Scanner scanf) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Qual o nome da Criatura?");
        nome = scanf.nextLine();
        System.out.println("Quanto é o dano de ataque da Criatura?");
        poderDeAtaque = scanf.nextInt();
        System.out.println("Quanto é a resistência da Criatura?");
        poderDeDefesa = scanf.nextInt();
        System.out.println("-----------------------------------------------------------");
    }

    @Override
    public String toString() {
        return Criatura.class.getSimpleName() + ": " + this.getNome();
    }
}
