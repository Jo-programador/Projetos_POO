
public class Cliente extends Pessoas {

    private int codigo;

    public Cliente() {
    }

    public Cliente(int codigo) {
        this.codigo = codigo;
    }

    public Cliente(String nome, Data nascimento, int codigo) {
        super(nome, nascimento);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    @Override 
    public String ImprimirDados(){
        return  String.format("Codigo: %s\n" + "Nome: %s\n" + "Nascimento: %s/%s/%s", this.codigo, super.nome,
                this.nascimento.getAno(), this.nascimento.getMes(), this.nascimento.getDia());
    }

}
