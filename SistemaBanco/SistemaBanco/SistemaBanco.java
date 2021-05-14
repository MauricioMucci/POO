package SistemaBanco;

import java.util.Scanner;

public class SistemaBanco {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        int escolha, codigo;
        String nome;
        Banco banco = new Banco("Itau");

        do {
            System.out.println("-----[ Menu ]-----");
            System.out.println("1 - Incluir");
            System.out.println("2 - Remover");
            System.out.println("3 - Listar");
            System.out.println("4 - Acessar sua conta");
            System.out.println("5 - Sair");
            System.out.print("Digite: ");
                escolha = scanf.nextInt();
                scanf.nextLine();
            switch (escolha) {
                case 1:
                    System.out.print("Qual o nome do correntista?\nR: ");
                        nome = scanf.nextLine();
                    banco.adicionaConta(nome);
                    break;
                case 2:
                    System.out.print("Qual o numero da conta?\nR: ");
                        codigo = scanf.nextInt();
                    banco.removeConta(banco.procuraConta(codigo));
                    break;
                case 3:
                    banco.imprimir();
                    break;
                case 4:
                    try {
                        System.out.print("Qual o numero da conta?\nR: ");
                            codigo = scanf.nextInt();
                            scanf.nextLine();
                        Conta dono = banco.procuraConta(codigo);
                        do {
                            int valor;

                            System.out.println("-----[ Menu ]-----");
                            System.out.println("1 - Depositar");
                            System.out.println("2 - Sacar");
                            System.out.println("3 - Ver saldo");
                            System.out.println("4 - Transeferir");
                            System.out.println("5 - Sair");
                            System.out.print("Digite: ");
                                escolha = scanf.nextInt();
                                scanf.nextLine();
                            switch (escolha) {
                                case 1:
                                    System.out.print("Qual o valor?\nR: ");
                                        valor = scanf.nextInt();
                                        scanf.nextLine();
                                    dono.deposita(valor);
                                    break;
                                case 2:
                                    try {
                                        System.out.print("Qual o valor?\nR: ");
                                            valor = scanf.nextInt();
                                            scanf.nextLine();
                                        dono.saca(valor);
                                    } catch (SaldoInsuficienteException e){
                                        System.out.println(e.getMessage());
                                    }
                                    break;
                                case 3:
                                    System.out.println("Saldo: " + dono.getSaldo());
                                    break;
                                case 4:
                                    System.out.print("Qual o valor?\nR: ");
                                        valor = scanf.nextInt();
                                    System.out.print("Qual o codigo da conta a transferir?\nR: ");
                                        codigo = scanf.nextInt();
                                        scanf.nextLine();
                                    dono.transfere(valor, banco.procuraConta(codigo));
                                case 5:
                                    break;
                                default:
                                    System.out.println("\t[Tente novamente!]");
                                    break;
                            }
                        } while (escolha != 5);
                    } catch (ContaInexistente e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    scanf.close();
                    return;
                default:
                    System.out.println("\t[Tente novamente!]");
                    break;
            } 
        } while (true);
    }
}
