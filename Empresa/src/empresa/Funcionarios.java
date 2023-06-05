package empresa;

public abstract class Funcionarios {  
    protected double salario;
    
    public Funcionarios (){        
    }

    public Funcionarios(double salario) {     
        this.salario = salario;
    }
       
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }        
    public abstract double ImprimirSalario();    
}
