package br.com.senac.aula03;

/**
 *
 * @author Victor Henrique Ranalli Barbosa
 */
public class Aula03 {
    public static void main(String[] args) {
       Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f); 
       c1.status();
        System.out.println("Tenho Uma Caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        
        Caneta c2 = new Caneta("Bic Cristal", "Azul", 0.7f);
      c2.status();
      System.out.println("Tenho Uma Caneta " + c2.getModelo() + " de ponta " + c2.getPonta());   
    }
}
