package bancobrasil;
public class ContaBancaria {   
        private String agencia;
        private String conta;
        private double saldo;
        private Usuario proprietario;
        
        public ContaBancaria(){            
        }
        
        public ContaBancaria(String agencia, String conta, double saldo, Usuario proprietario ){       
            this.agencia = agencia;
            this.conta = conta;
            this.saldo = saldo;
            this.proprietario = proprietario;
        }
        
        //INSERÇÃO DOS GETS
        public String getAgencia(){
            return this.agencia;
        }
        
        public String getConta(){
            return this.conta;
        }
        
        public double getSaldo(){
            return this.saldo;
        }
        
        public Usuario getProprietario(){
            return this.proprietario;
        }
        
              
        public void setAgencia(String agencia){
            this.agencia = agencia;
        }
        
        public void setConta(String conta){
            this.conta = conta;
        }
        
        public void setSaldo(double saldo){
            this.saldo = saldo;
        }
        
        public void setProprietario(Usuario proprietario){
            this.proprietario = proprietario;
        }

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
        
        void tranferir(ContaBancaria contabancaria, double valor) { //Metodo com parametro
            if(valor <= saldo){
               this.sacar(valor); 
               contabancaria.saldo += valor; 
            }else
               System.out.println("SALDO INSUFICIENTE VAGANUNDO!!"); 
                                                               
    }
        
        String consultarSaldo(){ ///Metado sem parametro
            //String.format() método da classe String para ultilirar formatações
            //com identificadores(%d, %f, %s).
            return String.format("Seu saldo é: R$ %.2f", this.saldo);
    }
        

    }    
