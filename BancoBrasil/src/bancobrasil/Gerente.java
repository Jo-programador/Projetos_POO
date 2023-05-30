
package bancobrasil;

public class Gerente {

    private String login;
    private String password;  
    
    public Gerente(){        
    }
    
    public Gerente(String login, String password, String nome, String sibrenome, String telefone){
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setTelefone(telefone);
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String imprimirInfo(){
        return String.format("Informações do gerente \n",
                + "Nome: %s %s \n",
                + "Contato %s\n",
                + "Login %s\n", this.getNome(), this.getSobrenome(), this.getTelefone(), this.login());
    }
    
}
