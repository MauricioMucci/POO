package EX6;

public class Gabinete implements Item {
    private Processador processador;
    private Memoria memoria;
    private int tipo = 0;

    Gabinete(Processador processador) {
        this.tipo = 1;
        this.processador = processador;
    }

    Gabinete(Memoria memoria) {
        this.tipo = 2;
        this.memoria = memoria;
    }

    Gabinete(Processador processador, Memoria memoria) {
        this.tipo = 0;
        this.processador = processador;
        this.memoria = memoria;
    }

    public int retornaPreco() {
        int valor = 0;
        switch (this.tipo) {
            case 0:
                valor = this.processador.retornaPreco() + this.memoria.retornaPreco();
                break;
            case 1:
                valor = this.processador.retornaPreco();
                break;
            case 2:
                valor = this.memoria.retornaPreco();
                break;
        }
        return valor;
    }
    
    public String toString() {
        String str = "";
        
        switch (this.tipo) {
            case 0:
                str = "\n[Gabinete]" + "\n" + this.processador.toString() + this.memoria.toString();
                break;
            case 1:
                str = "\n[Gabinete]\n" + this.processador.toString();
                break;
            case 2:
                str = "\n[Gabinete]\n" + this.memoria.toString();
                break;
        }
        return str;
    }
}
