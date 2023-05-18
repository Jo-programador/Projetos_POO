package bancobrasil;

import java.util.Scanner;

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

        Scanner scan = new Scanner(System.in);
        System.out.println("BEM VINDO AO BANCO DO BRASIL");
        System.out.println("CADASTRO DE CONTAS");
        System.out.println("Digite a agência -> ");
        ContaBancaria1.agencia = scan.next();
        System.out.println("\nDigite a conta -> ");
        ContaBancaria1.conta = scan.next();
        //Construção e inserção de dados do usuario
        System.out.println("\nDados do Usuário");
        System.out.println("Digite o nome do cliente -> ");
        user1.nome = scan.next();
        System.out.println("Digite o sobrenome do cliente -> ");
        user1.sobrenome = scan.next();
        System.out.println("Digite o telefone do cliente -> ");
        user1.telefone = scan.next();
        ContaBancaria1.proprietario = user1;
        
        System.out.println("\nDigite o valor do deposito -> ");
        ContaBancaria1.depositar(scan.nextDouble());

        System.out.println("\n" + ContaBancaria1.agencia + "\n"
                + ContaBancaria1.conta + "\n"
                + ContaBancaria1.proprietario.imprimirInfo() + "\n"
                + ContaBancaria1.consultarSaldo());

        System.out.println("\n\n Digite o valor para saque -> ");
        ContaBancaria1.sacar(scan.nextDouble());
        
        System.out.println(ContaBancaria1.consultarSaldo());
        
    }
}
