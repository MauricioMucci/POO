package Atividade3.EX11;

public class Funcionarios {
    private String nome;
    private String cpf;
    private int matricula;

    public Funcionarios(String nome, String cpf, int matricula){
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    public String getNomeF() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public int getMatricula() {
        return this.matricula;
    }
}
