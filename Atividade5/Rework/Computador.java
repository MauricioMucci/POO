package Atividade5.Rework;

public class Computador extends ItemMontado {
    private int tipo = 0;
    private Gabinete gabinete;
    private Monitor monitor;
    private Teclado teclado;
    private Mouse mouse;

    Computador(Gabinete gabinete, Monitor monitor) {
        this.tipo = 1;
        this.gabinete = gabinete;
        this.monitor = monitor;
        this.preco = this.gabinete.retornaPreco() + this.monitor.retornaPreco();
    }

    Computador(Gabinete gabinete, Monitor monitor, Teclado teclado) {
        this.tipo = 2;
        this.gabinete = gabinete;
        this.monitor = monitor;
        this.teclado = teclado;
        this.preco = this.gabinete.retornaPreco() + this.monitor.retornaPreco() + this.teclado.retornaPreco();
    }

    Computador(Gabinete gabinete, Monitor monitor, Mouse mouse) {
        this.tipo = 3;
        this.gabinete = gabinete;
        this.monitor = monitor;
        this.mouse = mouse;
        this.preco = this.gabinete.retornaPreco() + this.monitor.retornaPreco() + this.mouse.retornaPreco();
    }

    Computador(Gabinete gabinete, Teclado teclado, Mouse mouse) {
        this.tipo = 4;
        this.gabinete = gabinete;
        this.teclado = teclado;
        this.mouse = mouse;
        this.preco = this.gabinete.retornaPreco() + this.teclado.retornaPreco() + this.mouse.retornaPreco();
    }

    Computador(Gabinete gabinete, Monitor monitor, Teclado teclado, Mouse mouse) {
        this.tipo = 0;
        this.gabinete = gabinete;
        this.monitor = monitor;
        this.teclado = teclado;
        this.mouse = mouse;
        this.preco = this.gabinete.retornaPreco() + this.monitor.retornaPreco() + this.mouse.retornaPreco() + this.teclado.retornaPreco();
    }

    public String toString() {
        String str;
        
        switch (this.tipo) {
            case 0:
                str = "\n\t[Computador]\n" + this.gabinete.toString() + this.monitor.toString() + this.teclado.toString() + this.mouse.toString() + "Preco Total: " + String.valueOf(this.retornaPreco());
                break;
            case 1:
                str = "\n\t[Computador]\n" + this.gabinete.toString() + this.monitor.toString() + "Preco Total: " + String.valueOf(this.retornaPreco());
                break;
            case 2:
                str = "\n\t[Computador]\n" + this.gabinete.toString() + this.monitor.toString() + this.teclado.toString() + "Preco Total: " + String.valueOf(this.retornaPreco());
                break;
            case 3:
                str = "\n\t[Computador]\n" + this.gabinete.toString() + this.monitor.toString() + this.mouse.toString() + "Preco Total: " + String.valueOf(this.retornaPreco());
                break;
            case 4:
                str = "\n\t[Computador]\n" + this.gabinete.toString() + this.teclado.toString() + this.mouse.toString() + "Preco Total: " + String.valueOf(this.retornaPreco());
                break;
            default:
                str = null;
                break;
        }
        return str;
    }
}
