package br.com.senac.teoria;

/**
 *
 * @author Victor Henrique Ranalli Barbosa
 */
public class Banco {
   private String client; 
   private String conta;
   private double deposito;
   private double salario;
   protected String informaçoes;
   private boolean poupanca;
   private boolean contacorrente;
   private double depositada;

    public Banco(String client, String conta, double deposito, double salario, String informaçoes, boolean poupanca, boolean contacorrente) {
        this.client = client;
        this.conta = conta;
        this.deposito = deposito;
        this.salario = salario;
        this.informaçoes = informaçoes;
        this.poupanca = poupanca;
        this.contacorrente = contacorrente;
    }

   
    public void status() { 
        System.out.println(this.getInformaçoes()); 
        System.out.println("Depositado" + this.getDeposito());
        if (poupanca == true) {
            System.out.println("Sua conta e uma poupança -- " + this.isPoupanca());  
        } else {
            System.out.println("sua conta e uma conta corrente -- " + this.isContacorrente());
        }
        System.out.println("Quanto foi depositado: " + this.getDeposito());
        
    }

    public String getClient() {
        return client;
    }

    public void setClient(String cl) {
        this.client = cl;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String con) {
        this.conta = con;
    }

    public double getDeposito() {
        return deposito;
    }
    
    public void setDeposito(double depo) {
        this.deposito = depo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double s) {
        this.salario = s;
    }

    public String getInformaçoes() {
        return informaçoes;
    }

    public void setInformaçoes(String i) {
        this.informaçoes = i;
    }

    public boolean isPoupanca() {
        return poupanca;
    }

    public void setPoupanca(boolean p) {
        this.poupanca = p;
    }

    public boolean isContacorrente() {
        return contacorrente;
    }

    public void setContacorrente(boolean c) {
        this.contacorrente = c;
    }

    public double getDepositada() {
        return depositada;
    }

    public void setDepositada(double d) {
        this.depositada = d;
    }
}
