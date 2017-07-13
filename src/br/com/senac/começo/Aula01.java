package br.com.senac.começo;

/**
 *
 * @author Victor
 */
public class Aula01 {
    public static void main(String[] args) {
     Caneta c1 = new Caneta();
     c1.cor = "Azul";
     c1.ponta = 0.5f;
     c1.tampada = false;
     c1.carga = 75;
     c1.status();
     c1.rabiscar();
     
        System.out.println("_____________________________");
     
     Caneta c2 = new Caneta();
     c2.modelo = "Bic";
     c2.cor = "Preta"; 
     c2.ponta = 0.7f;
     c2.carga = 50;
     c2.destampar();
     c2.rabiscar();
     c2.status();
    }
}
