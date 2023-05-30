package bancobrasil;

import java.util.Scanner;
import java.util.ArrayList;

public class BancoBrasil {

    public static void main(String[] args) {
        ContaBancaria ContaBancaria1 = new ContaBancaria();
        ContaBancaria ContaBancaria2 = new ContaBancaria();
        Usuario user1 = new Usuario();
        /*
        ContaBancaria1.agencia = "0001";
        ContaBancaria1.conta = "1234";
        ContaBancaria1.proprietario = "Jolivan";
        ContaBancaria1.saldo = 1.99;
        System.out.println(ContaBancaria1.agencia + "\n" 
                + ContaBancaria1.conta + "\n" 
                + ContaBancaria1.proprietario + "\n"
                + ContaBancaria1.saldo);
         */
 /*
        Scanner scan = new Scanner(System.in);
        System.out.println("BEM VINDO AO BANCO DO BRASIL");
        System.out.println("CADASTRO DE CONTAS");
        System.out.println("Digite a agência -> ");
        ContaBancaria1.setAgencia(scan.next());
        System.out.println("\nDigite a conta -> ");
        ContaBancaria1.setConta(scan.next());        
        //Construção e inserção de dados do usuario
        System.out.println("\nDados do Usuário");
        System.out.println("Digite o nome do cliente -> ");
        user1.setNome(scan.next());
        System.out.println("Digite o sobrenome do cliente -> ");
        user1.setSobrenome(scan.next());
        System.out.println("Digite o telefone do cliente -> ");
        user1.setTelefone(scan.next());               
        System.out.println("\nDigite o valor do deposito -> ");
        ContaBancaria1.depositar(scan.nextDouble());

        System.out.println("\n" + ContaBancaria1.agencia + "\n"
                + ContaBancaria1.conta + "\n"
                + ContaBancaria1.proprietario.imprimirInfo() + "\n"
                + ContaBancaria1.consultarSaldo());

        System.out.println("\n\n Digite o valor para saque -> ");
        ContaBancaria1.sacar(scan.nextDouble());
        
        System.out.println(ContaBancaria1.consultarSaldo());
         */
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        Usuario user;
        Usuario[] users = new Usuario[5];
        ContaBancaria conta = new ContaBancaria();

        while (opcao != 3) {
            //1º Tela
            System.out.println("***BANCO DO BRASIL***");
            System.out.println("1 - Cadastro de Cliente");
            System.out.println("2 - Cadastro de Conts");
            System.out.println("3 - Sair");
            System.out.print("Escolhe uma opção: \n");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        user = new Usuario();
                        System.out.println("***CADASTRO DE CLIENTE***");
                        System.out.println("Nome: ");
                        user.setNome(scan.next());
                        System.out.println("Sobrenome: ");
                        user.setSobrenome(scan.next());
                        System.out.println("Telefone");
                        user.setTelefone(scan.next());

                        users[i] = user;
                    }
                    break;
                case 2:
                    System.out.println("***CADASTRO DE CONTA***");
                    System.out.println("Agencia: ");
                    conta.setAgencia(scan.next());
                    System.out.println("Conta: ");
                    conta.setConta(scan.next());
                    System.out.println("CLIENTE CADASTRADO");
                    if (users[0] == null) {
                        System.out.println("USUARIO NÃO CADASTRADO");
                    } else {
                        for (int i = 0; i < 3; i++) {
                            System.out.printf("%d - %s %s\n", i + 1, users[i].getNome(), users[i].getobrenome());
                        }
                        System.out.println("Selecione o cliente: ");
                        user = new Usuario();
                        int userOpcao = scan.nextInt();
                        if (userOpcao == 1) {
                            conta.setProprietario(users[userOpcao - 1]);
                            System.out.println("\nDigite o valor do deposito -> ");
                            ContaBancaria1.depositar(scan.nextDouble());
                        } else {
                            System.out.println("NENHUM USUARIO CADASTRADO");
                        }
                        break;
                    }

                case 3:
                    System.out.println("***ATÉ NUNCA MAIS!***");
                    break;
                default:
                    System.out.println("Opção Invalida");
            }
        }

    }
}
 
//teste