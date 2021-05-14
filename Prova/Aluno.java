package Prova;

public class Aluno extends Pessoa {
    private String matricula;

    Aluno(String nome, String matricula){
        super(nome);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String toString() {
        String str;
        
        str = "Nome: " + super.getNome() + "\nMatricula: " + this.getMatricula();
        
        return str;
    }
}
