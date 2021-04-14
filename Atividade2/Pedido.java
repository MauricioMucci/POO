/*
4. Crie a classe Pedido, considerando que esta deva possuir:
Construtor
• O construtor deve receber os parâmetros: Código do Pedido, Nome do Cliente e Descrição.
• Dever ter outro construtor que receba apenas o código do pedido e o nome do cliente.
Atributos
• Código de Pedido
• Nome do Cliente
• Descrição do Pedido
Métodos
• Modifica o nome do Cliente
• Modifica a descrição do pedido
• Retorna a descrição do pedido
• Retorna o nome do cliente.
*/

package Atividade2;

public class Pedido {
    
    private int codigo;
    private String nome, descricao;

    Pedido(int codigo, String nome, String descricao){
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
