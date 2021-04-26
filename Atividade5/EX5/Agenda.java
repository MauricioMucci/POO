package EX5;

public class Agenda {

    private int indice, MAX = 2;
    private Contato[] pessoa;

    Agenda(){
        this.pessoa = new Contato[MAX];
        this.indice = 0;
    }
    
    public void adicionaContato(Contato pessoa) {
        if (this.indice == MAX) {
            this.pessoa[this.indice] = null;
        } else {
            this.pessoa[this.indice++] = pessoa;            
        }
    }
    
    public void imprimeContatos() {
        
        for (int i = 0; i < this.pessoa.length; i++) {
            System.out.printf("\t[Contato %d]\n", i + 1);
            System.out.println(this.pessoa[i].toString());    
        }
    }
}
