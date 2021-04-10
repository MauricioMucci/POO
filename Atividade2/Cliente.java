/*
6. Crie uma classe Cliente, considerando que esta deva possuir :
Construtor
• O Constutor da classe deve possuir como parâmetro somente o código do Cliente
Atributos
• Código do Cliente
• Nome Completo
Métodos
• Inserção do nome do cliente
• Retorna do nome do cliente
• Retorna Código do Cliente
*/

package Atividade2;

public class Cliente {
    
    private int codigo;
    private String nome;

    public Cliente(int codigo){
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int getCodigo() {
        return this.codigo;
    }
}
