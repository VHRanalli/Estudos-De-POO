package br.com.senac.teoria;

/**
 *
 *  @author Victor Henrique Ranalli Barbosa
 */

public class ContaBanco {
    public int numconta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    
    //metodos personalizados
    public void abrirconta(String t, String d, int n){
      setNumconta(n);
      setTipo(t);
      setDono(d);
      setStatus(true);
        if (t == "CC") {
           setSaldo(150.00); 
        } else {
            setSaldo(50.00);
        }
    }
    public void fecharconta(){
        if (this.getSaldo() > 0) {
            System.out.println("Ainda há dinheiro na conta");
        } else if (saldo < 0) {
            System.out.println("A Conta esta em estado devedor e nao pode ser fechada");
            
        } else if (this.isStatus() == false) {
           
            System.out.println("Voce nao pode fechar uma conta que nao existe");
            
        }else{
         
            System.out.println("Conta fechada");
            setStatus(false);
            setDono(null);
            setTipo(null);
            
        }
    }
    public void depositar(double v){
        if (this.isStatus() == true) {
            this.setSaldo(this.getSaldo() + v);
            /* Comando em getter e setter
            setSaldo(getSaldo() + v)
            */
            System.out.println("deposito de " + this.getSaldo() + " Depositado com sucesso ");
        } else {
            System.out.println("nao existe conta entao esse valor nao pode ser depositado");
        }
    }
    public void sacar(double v){
        if (this.isStatus() == true && this.getSaldo() >= v ){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("saque realizado com sucesso " + this.getDono() + this.getSaldo());
            
        } else if (this.isStatus() ==true && this.getSaldo() < v){
           System.out.println("voce nao possui dinheiro em sua conta");   
        
        } else {
            System.out.println("voce nao possui uma conta");
        }
    }
    public void pagarmensal(){
        if (this.getTipo() == "CC" && this.isStatus() == true) {
            this.setSaldo(this.getSaldo() - 12.00);
        } else if(this.getTipo() == "CP" && this.isStatus() == true) {
            this.setSaldo(this.getSaldo() - 20.00);
        } else{
            System.out.println("nao ha uma conta"); 
        } 
    }
        public void saldonatela(){
            System.out.println("_________________");
            System.out.println("saldo da conta" + this.getSaldo());  
        }
        public void extrato(){
            System.out.println("_____________________________");
            System.out.println("numero da conta: " + this.getNumconta());
            System.out.println("estado da conta: " + this.isStatus());
            System.out.println("Tipo de Conta: " + this.getTipo());
            System.out.println("" + this.getDono());
            System.out.println("Saldo da conta: " + this.getSaldo());
 
        }
    
    //metodos especiais
    
    //metodo construtor    
    public ContaBanco(){
       this.saldo = 0;
       this.status = false;
    }
    //metodos getters e setters
   //todo metodo boolean retorna is e nao get    
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }
    
    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int n) {
        this.numconta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double s) {
        this.saldo = s;
    }
  }


