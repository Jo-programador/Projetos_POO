package bancobrasil;

import java.util.Date;

public abstract class Usuario {

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
    public String getobrenome(){
        return this.sobrenome;
    }
    public String getTelefone(){
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
    
    public abstract String imprimirInfo();
        
}
