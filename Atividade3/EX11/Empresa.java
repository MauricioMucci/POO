package Atividade3.EX11;

public class Empresa {
    private int MAX = 3, proxf, indice;
    private String nome;
    private String cnpj;
    private Funcionarios[] a;

    public Empresa (String nome, String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
        this.a = new Funcionarios[MAX];
        this.proxf = 1;
        this.indice = 0;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public String getNome() {
        return this.nome;
    }

    public int getMAX() {
        return this.MAX;
    }

    public Funcionarios CriaF(String n, String c){
        Funcionarios b;
        
        if (this.proxf - 1 == MAX){
            b = null;
        } else {
            b = new Funcionarios(n,c,this.proxf);
            this.proxf++;
            this.a[this.indice] = b;
            this.indice++;
        }
        return b;
    }

    public Funcionarios buscaF(int matricula){
        for (int i = 0; i < this.indice; i++) {
            if (a[i].getMatricula() == matricula) {
                return a[i];
            }
        }
        return null;
    }

    public void imprimir(){
        System.out.println("\nEmpresa: " + this.getNome() + "\tCnpj: " + this.getCnpj());
        for (int i = 0; i < this.indice; i++) {
            System.out.printf("--- [Matricula: %d] ---\n", this.a[i].getMatricula());
            System.out.printf("Nome: %s\n", this.a[i].getNomeF());
            System.out.printf("CPF: %s\n", this.a[i].getCpf());
        }
    }
}
