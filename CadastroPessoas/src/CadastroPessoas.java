
import java.util.ArrayList;

public class CadastroPessoas {
    private int quantidade = 0;
    
    private ArrayList<Pessoas> cadastrados = new ArrayList<>();

    public CadastroPessoas() {
    }       
        
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public ArrayList<Pessoas> getCadastrados() {
        return cadastrados;
    }

    public void setCadastrados(Pessoas teste) {
        this.cadastrados.add(teste);
        this.quantidade = this.cadastrados.size();
    }
    
    public void imprimirCadastro() {
        for(int i = 0; i < cadastrados.size(); i++){
            System.out.println(cadastrados.get(i).ImprimirDados());
        }
    }            
        
}
