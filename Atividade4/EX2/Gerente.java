package Atividade4.EX2;

public class Gerente extends Empregado{
    private String nomeGerencia;

    Gerente(String nome, String genero, int idade, String nomeGerencia){
        super(nome, genero, idade);
        this.nomeGerencia = nomeGerencia;
    }

    private String getNomeGerencia() {
        return this.nomeGerencia;
    }

    public String toString(){
        String str = "\nNome: " + this.getNome() + "\nIdade: " + String.valueOf(this.getIdade()) + "\nMatricula: " + this.getMatricula() + "\nNome da gerencia: " + this.getNomeGerencia() + "\nINSS: " + String.valueOf(this.valorInss());

        return str;
    }
}
