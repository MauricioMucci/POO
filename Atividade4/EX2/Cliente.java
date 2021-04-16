package Atividade4.EX2;

import java.time.YearMonth;

public class Cliente extends Pessoa {
    private int anoNascimento;
    private double valorDivida;

    Cliente(String nome, String genero, int idade, int anoNascimento){
        super(nome, genero, YearMonth.now().getYear() - anoNascimento);
        this.anoNascimento = anoNascimento;
        this.valorDivida = 0.0;
    }

    protected int getAnoNascimento() {
        return this.anoNascimento;
    }

    protected double getValorDivida() {
        return this.valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public String toString(){
        String str = "\nNome: " + this.getNome() + "\nIdade: " + String.valueOf(this.getIdade()) + "\nGenero: " + this.getGenero() + "\nValor da divida: " + String.valueOf(this.getValorDivida()) + "\nAno de nascimento: " + String.valueOf(this.getAnoNascimento());

        return str;
    }
}
