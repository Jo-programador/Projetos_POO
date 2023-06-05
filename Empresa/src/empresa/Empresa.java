package empresa;

import java.io.InputStream;
import java.util.Scanner;

public class Empresa {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        double salario1 = 0;
        FuncionarioHrs salariado = new FuncionarioHrs();
        FuncionarioHrs HrsTrabalhadas = new FuncionarioHrs();
        Assalariados_Comissionados  comissao = new Assalariados_Comissionados();

        while (opcao != 5) {
            System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");            
            System.out.println("*-*-*-*- FUNCIONAIORS -*-*-*-*");
            System.out.println("1 - FUNCIONARIO ASSALARIADO");
            System.out.println("2 - FUNCIONARIO DIARIA ");
            System.out.println("3 - FUNCIONARIO COMISSIONADO");
            System.out.println("4 - FUNCIONARIO ASSALARIADO COMISSIONADO");
            System.out.println("5 - SAIR");
            System.out.printf("OPÇÃO: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n*-*-*-*- FUNCIONARIO ASSALARIADO -*-*-*-*");
                    System.out.println("INFORME O SALARIO: ");
                    salariado.setSalario(scan.nextInt());
                    System.out.println("SEU SALARIO É: " + salariado.getSalario());
                    salariado.ImprimirSalario();
                    break;
                case 2:
                    System.out.println("\n*-*-*-*- FUNCIONARIO DIARIA -*-*-*-*");
                    System.out.println("INFORME O SALARIO: ");
                    salariado.setSalario(scan.nextInt());
                    System.out.println("INFORME A HORA EXTRA: ");
                    HrsTrabalhadas.setHoraExtra(scan.nextDouble());
                    System.out.println("INFORME A TAXA DA HORA: ");
                    HrsTrabalhadas.setTaxa_horas(scan.nextDouble());

                    System.out.println("SALARIO: " + HrsTrabalhadas.ImprimirSalario());
                    break;

                case 3:
                    System.out.println("\n*-*-*-*- FUNCIONARIO COMISSIONADO -*-*-*-*");                   
                    System.out.println("QUANTO FOI VENDIDO: ");
                    comissao.setVendas(scan.nextDouble());
                    System.out.println("QUANTO FOI A COMISSÃO: ");
                    comissao.setComissao(scan.nextDouble());
                    System.out.println("SUA COMISSÃO FOI DE: " + comissao.ImprimirSalario());
                    break;

                case 4:
                    System.out.println("\n*-*-*-*- FUNCIONARIO ASSALARIADO COMISSIONADO -*-*-*-*");
                    System.out.println("INFORME O SALARIO: ");
                    salariado.setSalario(scan.nextInt());
                    System.out.println("QUANTO FOI VENDIDO: ");
                    comissao.setVendas(scan.nextDouble());
                    System.out.println("QUANTO FOI A COMISSÃO: ");
                    comissao.setComissao(scan.nextDouble());
                    System.out.println("SUA COMISSÃO FOI DE: " + comissao.ImprimirSalario());
                    break;                    
                default:
                    System.out.println("OPÇÃO IMVALIDA");
                    break;
            }
        }

        System.out.println("");
    }

}
 