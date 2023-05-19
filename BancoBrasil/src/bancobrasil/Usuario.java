package bancobrasil;

import java.util.Date;

public class Usuario {

    String nome;
    String sobrenome;
    String telefone;
    private Date dataRegistro = new Date();
    
    public Usuario(){       
    }
    
    public Usuario(String nome, String sobrenome, String telefone){
        this.nome =  nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;              
    }
    
    public String getNome(){
        return nome;
    }
    public String getsobrenome(){
        return this.sobrenome;
    }
    public String gettelefone(){
        return this.telefone;
    }
    public Date getdataRegistro(){
        return this.dataRegistro;
    }
    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setDataRegistro(Date dataRegistro){
        this.dataRegistro = dataRegistro;
    }
    String imprimirInfo() {
        return String.format("INFORMAÇÕES DO CLIENTE: \nNome: %s\n, Sobrenome: %s\n, Telefone: %s\n, DataRegistro: %s",
                this.nome, this.sobrenome, this.telefone, this.dataRegistro);
    }
}
