package lojavendas;

import java.util.Date;

public abstract class Usuario {
    private String id;
    private String email;
    private String senha;
    private Date dataRegistro;

    public Usuario() {
    }        

    public Usuario(String id, String email, String senha, Date dataRegistro) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.dataRegistro = dataRegistro;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }        
    
    public abstract String Cadastrar();
    public abstract String Consultar();
    public abstract String Atualizar();
    public abstract String Deletar();
    public abstract String VerificarLogin();
    
}
