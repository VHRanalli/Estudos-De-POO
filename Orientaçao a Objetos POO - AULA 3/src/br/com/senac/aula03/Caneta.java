package br.com.senac.aula03;

/**
 *
 *  @author Victor Henrique Ranalli Barbosa
 */
public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
   
    public void status() { 
        System.out.println("SOBRE A CANETA:"); 
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
        
    }

    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
    }
}
