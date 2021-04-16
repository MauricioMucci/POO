package Atividade4.EX1;

public class Peixe extends Animal {
    private String habitat;   

    Peixe(String nome, double peso, String habitat){
        super(nome, peso);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return this.habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String toString(){
        String str = "Nome: "+ this.getNome() + "\nPeso: " + String.valueOf(this.getPeso()) + "\nHabitat: " + this.getHabitat();

        return str;
    }
}
