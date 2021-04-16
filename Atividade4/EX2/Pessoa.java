package Atividade4.EX2;

public class Pessoa {
    private String nome;
    private String genero;
    private int idade;

    Pessoa(String nome, String genero, int idade){
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    protected String getNome() {
        return this.nome;
    }

    protected String getGenero() {
        return this.genero;
    }

    protected int getIdade() {
        return this.idade;
    }
}
