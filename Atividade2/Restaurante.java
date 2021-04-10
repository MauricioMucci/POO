/*
5. Crie um programa que instancie dois objetos da classe Pedido e que modifique os valores dos
atributos: Nome do Cliente e Descrição do Pedido. Antes e após as modificações, deverá imprimir os
valores dos mesmos atributos, utilizando os métodos de retorno da classe.
*/

package Atividade2;

public class Restaurante {
    public static void main(String[] args) {

        Pedido a = new Pedido(1, "Mauricio", "Numero 1 + Batata M + Coca zero s/gelo");
        Pedido b = new Pedido(2, "Thais", "Cheddar + Batata P + Coca zero s/gelo");

        System.out.println("Nome: " + a.getNome() + "\nDescricao: " + a.getDescricao());
        System.out.println("\nNome: " + b.getNome() + "\nDescricao: " + b.getDescricao());

        a.setNome("Rubens");
        a.setDescricao("Quarteirao + Batata G + Guarana + Barbecue");        
        b.setNome("Fred");
        b.setDescricao("Whiskas sache");        

        System.out.println("\nNome: " + a.getNome() + "\nDescricao: " + a.getDescricao());
        System.out.println("\nNome: " + b.getNome() + "\nDescricao: " + b.getDescricao());
    }
}
