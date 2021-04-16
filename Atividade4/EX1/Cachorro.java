package Atividade4.EX1;

public class Cachorro extends Animal {
    private String raca;

    Cachorro(String nome, double peso, String raca){
        super(nome, peso);
        this.raca = raca;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String toString(){
        String str = "Nome: "+ this.getNome() + "\nPeso: " + String.valueOf(this.getPeso()) + "\nRaca: " + this.getRaca();

        return str;
    }
}
