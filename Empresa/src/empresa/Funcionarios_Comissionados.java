package empresa;

public class Funcionarios_Comissionados extends Funcionarios {
 protected double vendas;
    protected double comissao;

    public Funcionarios_Comissionados() {
    }
    

    public Funcionarios_Comissionados(double vendas, double comissao) {
        this.vendas = vendas;
        this.comissao = comissao;
    }

    public Funcionarios_Comissionados(double vendas, double comissao, double salario) {
        super(salario);
        this.vendas = vendas;
        this.comissao = comissao;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double porcentagem) {
        this.comissao = porcentagem;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    @Override
    public double ImprimirSalario() {
        return (this.comissao/100) * vendas;
    }
}
