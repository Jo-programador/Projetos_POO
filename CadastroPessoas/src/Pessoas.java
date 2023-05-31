
public abstract class Pessoas {
    protected String nome;
    protected Data nascimento; 

    public Pessoas(){
        
    }

    public Pessoas(String nome, Data nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }        

    public abstract String ImprimirDados();
          
}
