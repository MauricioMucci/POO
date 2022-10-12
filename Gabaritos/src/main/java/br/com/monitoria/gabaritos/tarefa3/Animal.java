package br.com.monitoria.gabaritos.tarefa3;

/**
 *
 * @author mauricio
 */
public abstract class Animal {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String gritar();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + this.getNome() + " " + this.gritar();
    }
}
