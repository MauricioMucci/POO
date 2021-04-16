package Atividade4.EX2;

public class Empregado extends Pessoa {
    private double salario;
    private String matricula;

    Empregado(String nome, String genero, int idade){
        super(nome, genero, idade);
        this.salario = 0.0;
        this.matricula = "NAO IDENTIFICADO";
    }

    protected double getSalario() {
        return this.salario;
    }

    protected String getMatricula() {
        return this.matricula;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    protected double valorInss(){
        double inss = this.salario * 11/100;

        return inss;
    }
}
