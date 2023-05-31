public class Funcionario extends Pessoas {

    protected float salario;  

    public Funcionario() {
    }
    
    public Funcionario(String nome, Data nascimento, float salario) {
        super(nome, nascimento);
        this.salario = salario;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    @Override
    public String ImprimirDados(){
        return  String.format("Nome: %s\n"
                + "Salario: %s\n" 
                + "Nascimento: %s/%s/%s", super.nome, calcularImporto(),this.nascimento.getAno(), this.nascimento.getMes(), this.nascimento.getDia());
    }
    
    public float calcularImporto() {
        return salario - ((salario * 3) / 100);
    }
    
  
}
