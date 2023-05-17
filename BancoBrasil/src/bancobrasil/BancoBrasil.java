package bancobrasil;

import java.util.Scanner;

public class BancoBrasil {

    public static void main(String[] args) {
        ContaBancaria ContaBancaria1 = new ContaBancaria (); 
        ContaBancaria ContaBancaria2 = new ContaBancaria(); 
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
        
        Scanner scan = new Scanner (System.in);
        System.out.println("BEM VINDO AO BANCO DO BRASIL");
        System.out.println("CADASTRO DE CONTAS");
        System.out.println("Digite a agência -> ");
        ContaBancaria1.agencia = scan.next();
        System.out.println("\nDigite a conta -> ");
        ContaBancaria1.conta =  scan.next();
        System.out.println("\nDigite o proprietário -> ");
        ContaBancaria1.proprietario = scan.next();
        System.out.println("\nDigite o saldo inicial -> ");
        ContaBancaria1.saldo = scan.nextDouble();
    }
    
}
