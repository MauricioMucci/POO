package SistemaBanco;

public class ContaInexistente extends ArrayIndexOutOfBoundsException {
    ContaInexistente(String message) {
        super(message);
    }
}
