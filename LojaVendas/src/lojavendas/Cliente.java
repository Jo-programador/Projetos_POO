package lojavendas;

import java.util.Date;
import java.util.Scanner;

public class Cliente extends Usuario {
    Scanner scan = new Scanner(System.in);
    private String nomeCliente;
    private String cpf;
    private String endereco;
    private String telefone;
    private String inforCartCred;

    public Cliente() {
    }

    public Cliente(String nomeCliente, String cpf, String endereco, String telefone, String inforCartCred) {
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.inforCartCred = inforCartCred;
    }

    public Cliente(String nomeCliente, String cpf, String endereco, String telefone, String inforCartCred, String id, String email, String senha, Date dataRegistro) {
        super(id, email, senha, dataRegistro);
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.inforCartCred = inforCartCred;
    }
    
    public String RedefinirSenha(){
        return String.format(cpf);
    }
    
    @Override
    public String Cadastrar(){
        return String.format("Nome: %s\n CPF: %s\n Endereço: %s\n Telefone: %s\n Informações do Cartão: %s\n Email: %s\n Senha: %s\n " 
                + this.nomeCliente 
                + this.cpf 
                + this.endereco 
                + this.telefone 
                + this.inforCartCred);
    }

    @Override
    public String Consultar() {
        throw new UnsupportedOperationException("Nome: %s\n CPF: %s\n Endereço: %s\n Telefone: %s\n" + this.nomeCliente + this.cpf + this.endereco + this.telefone);
    }

    @Override
    public String Atualizar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String Deletar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String VerificarLogin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
