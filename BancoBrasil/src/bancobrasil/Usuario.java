
package bancobrasil;
import java.util.Date;
public class Usuario {    
        String nome;
        String sobrenome;
        String telefone;
        Date dataRegistro = new Date();
        
      String imprimirInfo(){       
            return String.format("INFORMAÇÕES DO CLIENTE: \nNome: %s\n, Sobrenome: %s\n, Telefone: %s\n, DataRegistro: %s",
                    this.nome, this.sobrenome, this.telefone, this.dataRegistro);
    }
}        

