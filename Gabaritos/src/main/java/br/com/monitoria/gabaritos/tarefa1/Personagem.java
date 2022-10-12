package br.com.monitoria.gabaritos.tarefa1;

import java.util.Scanner;

/**
 *
 * @author mauricio
 */
public abstract class Personagem {

    protected String nome;
    protected int poderDeAtaque;
    protected int poderDeDefesa;

    public String getNome() {
        return nome;
    }

    public int getPoderDeAtaque() {
        return poderDeAtaque;
    }

    public int getPoderDeDefesa() {
        return poderDeDefesa;
    }

    public abstract void criarPersonagem(Scanner scanf);

}
