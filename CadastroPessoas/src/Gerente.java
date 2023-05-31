
public class Gerente extends Funcionario {

    private String area;

    public Gerente() {
    }

    public Gerente(String area) {
        this.area = area;
    }

    public Gerente(String area, String nome, Data nascimento, float salario) {
        super(nome, nascimento, salario);
        this.area = area;
    }

    
     @Override
    public String ImprimirDados(){
        return  String.format("Nome: %s\n" + "Salario: %s\n" + "Nascimento: %s/%s/%s", super.nome, calcularImporto(),
                this.nascimento.getAno(), this.nascimento.getMes(), this.nascimento.getDia());
    }
    
    @Override
    public float calcularImporto() {
        return salario - ((salario * 5) / 100);
    }
}
