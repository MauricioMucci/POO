package SistemaBanco;

import java.util.Scanner;
import java.util.InputMismatchException;

public class SistemaBanco {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        int escolha = 0, codigo = 0;
        String nome;
        Banco banco = new Banco("Itau");

        do {
            System.out.println("\n-----[ Menu ]-----");
            System.out.println("1 - Incluir");
            System.out.println("2 - Remover");
            System.out.println("3 - Listar");
            System.out.println("4 - Acessar sua conta");
            System.out.println("5 - Sair");
            System.out.print("Digite: ");
            try {
                escolha = scanf.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nErro: O valor digitado não corresponde a um número.\n");
            } finally {
                scanf.nextLine();
            }
            switch (escolha) {
                case 1:
                    System.out.print("\nQual o nome do correntista?\nR: ");
                        nome = scanf.nextLine();
                    banco.adicionaConta(nome);
                    break;
                case 2:
                    System.out.print("\nQual o numero da conta?\nR: ");
                        codigo = scanf.nextInt();
                        try {
                            banco.removeConta(banco.procuraConta(codigo));    
                        } catch (ContaInexistente e) {
                            System.out.println(e.getMessage());
                        }
                    break;
                case 3:
                    banco.imprimir();
                    break;
                case 4:
                    try {
                        System.out.print("\nQual o numero da conta?\nR: ");
                            codigo = scanf.nextInt();
                            scanf.nextLine();

                        Conta dono = banco.procuraConta(codigo);
                        do {
                            int valor;
                            
                            System.out.println("\n--------------------------------");
                            System.out.println(dono.toString());
                            System.out.println("--------------------------------");
                            
                            System.out.println("\n-----[ Menu ]-----");
                            System.out.println("1 - Depositar");
                            System.out.println("2 - Sacar");
                            System.out.println("3 - Transeferir");
                            System.out.println("4 - Sair");
                            System.out.print("Digite: ");
                            try {
                                escolha = scanf.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("\nErro: O valor digitado não corresponde a um número.\n");
                            } finally {
                                scanf.nextLine();
                            }
                            switch (escolha) {
                                case 1:
                                    System.out.print("\nQual o valor?\nR: ");
                                        valor = scanf.nextInt();
                                        scanf.nextLine();
                                    dono.deposita(valor);
                                    break;
                                case 2:
                                    try {
                                        System.out.print("\nQual o valor?\nR: ");
                                            valor = scanf.nextInt();
                                            scanf.nextLine();
                                        dono.saca(valor);
                                    } catch (SaldoInsuficienteException e){
                                        System.out.println(e.getMessage());
                                    }
                                    break;
                                case 3:
                                    System.out.print("\nQual o valor?\nR: ");
                                        valor = scanf.nextInt();
                                    System.out.print("\nQual o codigo da conta a transferir?\nR: ");
                                        codigo = scanf.nextInt();
                                        scanf.nextLine();
                                    try {
                                        dono.transfere(valor, banco.procuraConta(codigo));    
                                    } catch (ContaInexistente e) {
                                        System.out.println(e.getMessage());
                                    }
                                    break;
                                case 4:
                                    break;
                                default:
                                    System.out.println("\t[Tente novamente!]");
                                    break;
                            }
                        } while (escolha != 4);
                    } catch (ContaInexistente e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    scanf.close();
                    return;
                default:
                    System.out.println("\n\t[Tente novamente!]");
                    break;
            } 
        } while (true);
    }
}
