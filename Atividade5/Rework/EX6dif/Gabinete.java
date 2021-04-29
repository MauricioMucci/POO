package EX6dif;

public class Gabinete extends ItemMontado {
    private int tipo;
    private Processador processador;
    private Memoria memoria;

    Gabinete(Processador processador) {
        this.tipo = 1;
        this.processador = processador;
        this.preco = this.processador.retornaPreco();
    }

    Gabinete(Memoria memoria) {
        this.tipo = 2;
        this.memoria = memoria;
        this.preco = this.memoria.retornaPreco();
    }

    Gabinete(Processador processador, Memoria memoria) {
        this.tipo = 0;
        this.processador = processador;
        this.memoria = memoria;
        this.preco = this.processador.retornaPreco()+ this.memoria.retornaPreco();
    }

    public String toString() {
        String str;
        
        switch (this.tipo) {
            case 0:
                str = "[Gabinete]\n" + this.processador.toString() + this.memoria.toString() + "Preco Total Gabinete: " + String.valueOf(this.retornaPreco()) + "\n";
                break;
            case 1:
                str = "[Gabinete]\n" + this.processador.toString();
                break;
            case 2:
                str = "[Gabinete]\n" + this.memoria.toString();
                break;
            default:
                str = null;
                break;
        }
        return str;
    }
}
