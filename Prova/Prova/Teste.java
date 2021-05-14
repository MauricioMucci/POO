package Prova;

public class Teste {
    public static void main(String[] args) {
        Disciplina poo, aed;

        Professor Rafael = new Professor("Rafael", 123, criaMatricula(1000, 2010, 'B'));
        Professor Toto = new Professor("Toto", 456, criaMatricula(1000, 2006, 'A'));

        poo = new Disciplina(20, "Programacao Orientada a Objeto");
        aed = new Disciplina(40, "Algoritmo e Estrutura de Dados");

        poo.adiciona(Rafael);
        poo.adiciona(new Aluno("Mauricio", criaMatricula(1000, 2019, 'A')), Rafael);
        poo.adiciona(new Aluno("Lucas", criaMatricula(1000, 2019, 'B')), Rafael);

        aed.adiciona(new Aluno("Rubens", criaMatricula(1000, 2019, 'B')), Toto);
        aed.adiciona(Toto);

        poo.imprimir();
        aed.imprimir();
        
        poo.remove(new Aluno("Lucas", criaMatricula(1000, 2019, 'B')), Rafael);

        poo.imprimir();
    }

    public static String criaMatricula(int numero, int ano, char semestre){
        return String.valueOf(numero) + String.valueOf(ano) + semestre;
    }
}
