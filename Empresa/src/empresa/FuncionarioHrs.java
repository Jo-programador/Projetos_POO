package empresa;

public class FuncionarioHrs extends Funcionarios {    
    private double horaExtra;
    private double taxa_horas;   

    public FuncionarioHrs() {
    }

    public FuncionarioHrs(double horaExtra, double taxa_horas) {
        this.horaExtra = horaExtra;
        this.taxa_horas = taxa_horas ;
    }

    public FuncionarioHrs(double horaExtra, double taxa_horas, double salario) {
        super(salario);
        this.horaExtra = horaExtra;
        this.taxa_horas = taxa_horas;
    }

    public double getTaxa_horas() {
        return taxa_horas;
    }

    public void setTaxa_horas(double taxa_horas) {
        this.taxa_horas = taxa_horas;
    }
  

    public double getHoraExtra() {
        return horaExtra;       
    }

    public void setHoraExtra(double horaExtra) {       
        this.horaExtra = horaExtra;
    }            

    @Override
    public double ImprimirSalario() {
        return super.salario+((this.taxa_horas * 1.5) * this.horaExtra);
        } 

}
