/*
7. Crie um programa que instancie dois objetos Cliente, atribua o valor ao atributo Nome do Cliente.
Antes e após a atribuição, imprima o Nome do Cliente utilizando a função de retorno.
*/

package Atividade2;

public class Teste {
    public static void main(String[] args) {
        
        Cliente a = new Cliente(1);
        Cliente b = new Cliente(2);

        System.out.println("Nome: " + a.getNome() + "\nCodigo: " + a.getCodigo());
        System.out.println("\nNome: " + b.getNome() + "\nCodigo: " + b.getCodigo());

        a.setNome("Mauricio");
        b.setNome("Thais");

        System.out.println("\nNome: " + a.getNome() + "\nCodigo: " + a.getCodigo());
        System.out.println("\nNome: " + b.getNome() + "\nCodigo: " + b.getCodigo());

    }
    
}
