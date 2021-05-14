package SistemaBanco;

public class Conta {
    private int codigo;
    private String dono;
    private Banco banco;
    private double saldo, limite;

    Conta(String dono, int codigo, Banco banco) {
        this.dono = dono;
        this.codigo = codigo;
        this.banco = banco;
        this.saldo = 0.0;
        this.limite = 1000.0;
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

    boolean saca(double valor) {
        if (ultrapassouLimite(valor)) {
            throw new SaldoInsuficienteException("\n\t[Limite ultrapassado!]\n");
        } else {
            this.saldo -= valor;
            return true;
        }
    }
    
    boolean ultrapassouLimite(double valor) {
        if (valor <= (this.limite + this.saldo)) {
            return false;
        } else {
            return true;
        }
    }

    void transfere(double valor, Conta conta) {
        if (saca(valor)) {
            conta.deposita(valor);
        } else {
            System.out.println("Nao eh possivel realizar a transferencia!");
        }
    }
}
