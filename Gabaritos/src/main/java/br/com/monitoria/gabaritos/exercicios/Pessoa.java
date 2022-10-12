package br.com.monitoria.gabaritos.exercicios;

import java.time.LocalDate;
import java.time.Period;

/**
 * Exercício 1)
    Criar a classe Pessoa com as seguintes características:
    atributos: 
        idade e dia, mês e ano de nascimento, nome da pessoa, endereço, email, cpf
    métodos:
        o calculaIdade(), que recebe a data atual em dias, mês e anos e calcula 
        e armazena no atributo idade a idade atual da pessoa
        métodos getters e setters para os atributos
        método construtor que receba todos os atributos do objeto
        Criar dois objetos da classe Pessoa, um representando Albert Einstein 
        (nascido em 14/3/1879) e o outro representando Isaac Newton (nascido em 4/1/1643).
        Fazer uma classe principal que instancie os objetos, inicialize e mostre 
        quais seriam as idades de Einstein e Newton caso estivessem vivos.
 * @author mauricio
 */
public class Pessoa {

    private int idade;
    private int dia;
    private int mes;
    private int ano;
    private String nome;
    private String endereco;
    private String email;
    private String cpf;
    private Universidade uni;

    public Pessoa(int dia, int mes, int ano, String nome, String endereco, String email, String cpf) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return nome + " trabalhou como professor em " + uni.getNome();
    }

    public Universidade getUni() {
        return uni;
    }

    public void setUni(Universidade uni) {
        this.uni = uni;
    }
    
    public int getIdade() {
        return idade;
    }

    public void calculaIdade() {
        LocalDate today = LocalDate.now();
        LocalDate birth = LocalDate.of(ano, mes, dia);
        this.idade = Period.between(birth, today).getYears();
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
