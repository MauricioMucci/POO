package SistemaBanco;

public class Conta {
    private int codigo;
    private String dono;
    private Banco banco;
    private double saldo, limite;

    Conta(){

    }

    Conta(String dono, int codigo, Banco banco) {
        this.dono = dono;
        this.codigo = codigo;
        this.banco = banco;
        this.saldo = 0.0;
        this.limite = 1000.0;
    }

    public Banco getBanco() {
        return this.banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return this.saldo;
    }

    void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        if (ultrapassouLimite(valor)) {
            throw new SaldoInsuficienteException("\n\t[Saldo Insuficinete! Saldo atual: " + this.getSaldo() + "]\n");
        } else {
            this.saldo -= valor;
        }
    }
    
    private boolean ultrapassouLimite(double valor) {
        if (valor <= (this.limite + this.saldo)) {
            return false;
        } else {
            return true;
        }
    }

    public void transfere(double valor, Conta conta) {
        saca(valor);
        conta.deposita(valor);
    }

    public String toString() {
        return "Nome: " + this.getDono() + "\nSaldo: " + this.getSaldo();
    }
}
