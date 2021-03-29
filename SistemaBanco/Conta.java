package SistemaBanco;

public class Conta {
    //Atributos
    int numero;
    String dono;
    double saldo,limite;

    //Construtor
    Conta(int numero, String dono,double saldo, double limite){
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
        this.limite = limite;
	}

    public String getDono(){
        return this.dono;
    }

    public double getSaldo(){
        return this.saldo;
    }

    //Metodos
    void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    boolean saca(double valor) {
        if (lim(valor)) {
            return false;
        } else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }
    
    boolean lim (double valor) {
        if (valor <= (this.limite + this.saldo)) {
            return false;
        } else {
            return true;
        }
    }

    void transfere(double valor,Conta conta) {
        if (saca(valor)) {
            conta.deposita(valor);
        } else {
            System.out.println("Nao eh possivel realizar a transferencia!");
        }
    }

    void imprime() {
        System.out.printf("Dono: %s\n", this.dono);
        System.out.printf("Saldo: %2f\n", this.saldo);
        System.out.printf("Limite: %2f\n", this.limite);
    }

}
