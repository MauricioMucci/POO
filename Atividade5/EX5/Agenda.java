package EX5;

import java.util.ArrayList;
public class Agenda {

    private static byte MAX = 0;
   // private Contato[] pessoa;
   private ArrayList <Contato> pessoa = new ArrayList<Contato>();
    
    public void adicionaContato(Contato pessoa) {
       this.pessoa.add(pessoa);
       MAX++;
       
        /* if (this.indice == MAX) {
            this.pessoa[this.indice] = null;
        } else {
            this.pessoa[this.indice++] = pessoa;            
        }
        */
    }
    
    public void imprimeContatos() {
        
        for (int i = 0; i < MAX; i++) {
            System.out.printf("\t[Contato %d]\n", i + 1);
            System.out.println(this.pessoa.get(i).toString());    
        }
    }
}
