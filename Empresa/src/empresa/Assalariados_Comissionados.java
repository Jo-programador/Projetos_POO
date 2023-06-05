package empresa;

public class Assalariados_Comissionados extends Funcionarios {

    protected double vendas;
    protected double comissao;

    public Assalariados_Comissionados() {
    }
    

    public Assalariados_Comissionados(double vendas, double comissao) {
        this.vendas = vendas;
        this.comissao = comissao;
    }

    public Assalariados_Comissionados(double vendas, double comissao, double salario) {
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
        return (super.salario + (super.salario * 0.10) + (vendas + (comissao/100)));
    }
}
