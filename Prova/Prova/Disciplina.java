package Prova;

import java.util.ArrayList;

public class Disciplina {
    private int numAlunos;
    private String nomeDisciplina;
    private ArrayList <Aluno> aluno = new ArrayList<Aluno>();
    private ArrayList <Professor> ministrante = new ArrayList<Professor>();
    
    Disciplina(int numAlunos, String nomeDisciplina){
        this.numAlunos = numAlunos;
        this.nomeDisciplina = nomeDisciplina;
    }

    public void adiciona(Aluno aluno, Professor ministrante){
       if (ministrante.autenticar(ministrante.getSenha()) && this.aluno.size() < numAlunos) {
            this.aluno.add(aluno);
       } else {
            System.out.println("\nSem autorizacao!\n");
       }
    }

    public void adiciona(Professor ministrante){
        if (ministrante.autenticar(ministrante.getSenha())) {
            this.ministrante.add(ministrante);
       } else {
            System.out.println("\nSem autorizacao!\n");
       }
    }

    public void remove(Aluno aluno, Professor ministrante){
       if (ministrante.autenticar(ministrante.getSenha())) {
           for(int i = 0;i < this.aluno.size();i++){
               if((this.aluno.get(i).getNome() == aluno.getNome())){
                    this.aluno.remove(i);
                    break;
               }
           } 
       } else {
            System.out.println("Sem autorizacao!");
       }
    }


    public String getNomeDisciplina() {
        return this.nomeDisciplina;
    }

    public int getNumAlunos() {
        return this.numAlunos;
    }

    public void imprimir(){

        System.out.printf("\tDisciplina %s\n", this.getNomeDisciplina());
        System.out.printf("Numero total de alunos: %d\n", this.aluno.size());
        System.out.printf("Numero maximo de alunos: %d\n", this.getNumAlunos());
        for(int i = 0; i < this.aluno.size(); i++){
            System.out.println(this.aluno.get(i).toString());
        }
        System.out.println("Professor(es): ");
        for(int i = 0; i < ministrante.size(); i++){
            System.out.println(this.ministrante.get(i).toString());
        }
        System.out.println();
    }

}
