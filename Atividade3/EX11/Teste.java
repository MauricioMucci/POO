package Atividade3.EX11;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        String nome, id;

        System.out.print("Digite a empresa: ");
            nome = scanf.nextLine();
        System.out.print("Digite o CNPJ: ");
            id = scanf.nextLine();

        Empresa quack = new Empresa(nome,id);
        

        for (int i = 0; i < quack.getMAX(); i++) {
            System.out.print("\nDigite o nome do funcionario: ");
                nome = scanf.nextLine();
            System.out.print("Digite o CPF: ");
                id = scanf.nextLine();
            if (quack.CriaF(nome, id) == null) {
                System.out.println("ERRO");
                break;
            }
        }

        Funcionarios duck;

        duck = quack.buscaF(3);
        if (duck == null) {
            System.out.println("\nFuncionario nao existe!\n");
        } else {
            System.out.printf("\nFuncionario: %d\n", duck.getMatricula());
            System.out.printf("Nome: %s\n", duck.getNomeF());
            System.out.printf("CPF: %s\n", duck.getCpf());            
        }

        quack.imprimir();

        scanf.close();
    }
}
