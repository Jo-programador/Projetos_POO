package bancobrasil;
public class ContaBancaria {   
        String agencia;
        String conta;
        double saldo;
        Usuario proprietario;

        void depositar(double valor){//Métado com parametro
            this.saldo += valor;
    }
        
        void sacar(double valor) {
            
            if (valor > saldo){
                System.out.println("SALDO INSUFICIENTE VAGANUNDO!!");                
            }else{
               this.saldo -= valor;
            }
    }
        
        void tranferi() {
    }
        
        String consultarSaldo(){ ///Metado sem parametro
            //String.format() método da classe String para ultilirar formatações
            //com identificadores(%d, %f, %s).
            return String.format("Seu saldo é: R$ %.2f", this.saldo);
    }
        

    }    
