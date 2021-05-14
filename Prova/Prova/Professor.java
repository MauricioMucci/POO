package Prova;

public class Professor extends Pessoa implements Autenticavel {
    private int senha;
    private String matricula;

    Professor(String nome, int senha, String matricula){
        super(nome);
        this.senha = senha;
        this.matricula = matricula;
    }

    public int getSenha() {
        return this.senha;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String toString() {
        String str;
        
        str = "Nome: " + super.getNome() + "\nMatricula: " + this.getMatricula();
        
        return str;
    }
    
    @Override
    public boolean autenticar(int senha) {
        if(this.senha != senha)
            return false;
        return true;
    }
}
