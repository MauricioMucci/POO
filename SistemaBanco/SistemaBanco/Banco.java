package SistemaBanco;

import java.util.ArrayList;

public class Banco {
    private static int proxBanco = 1;
    private int proxConta;
    private String nome;
    private int codigo;
    private ArrayList <Conta> conta = new ArrayList<Conta>();


    Banco(String nome) {
        this.nome = nome;
        this.codigo = proxBanco++;
        this.proxConta = 1;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionaConta(String nome) {
        Conta conta = new Conta(nome, this.proxConta, this);
        this.conta.add(conta);
        this.proxConta++;
    }

    public void removeConta(Conta conta) {
        this.conta.remove(conta);
    }

    public Conta procuraConta(int codigo) {
        for (int i = 0; i < this.conta.size(); i++) {
            if(codigo == this.conta.get(i).getCodigo())
            {
                return this.conta.get(i);
            }
        }
        throw new ContaInexistente("\n\t[Conta inexistente!]\n");
    }

    public String toString() {
        return "[Banco: " + this.getNome() + "]";
    }

    public void imprimir() {
        System.out.println("\n\t" + toString());
        for (int i = 0; i < this.conta.size(); i++) {
            System.out.println("Conta " + this.conta.get(i).getCodigo() + ":");
            System.out.println("Nome: " + this.conta.get(i).getDono());
            System.out.println("Saldo: " + this.conta.get(i).getSaldo());
            System.out.println();
        }
    }    
}
