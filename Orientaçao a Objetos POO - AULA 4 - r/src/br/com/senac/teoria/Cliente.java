package br.com.senac.teoria;

/**
 *
 *  @author Victor Henrique Ranalli Barbosa
 */
public class Cliente {
    public static void main(String[] args) {
        Banco jubileu = new Banco("Nome: Jubileu", "Poupança", 000.00, 000.00, "Informaçoes da Conta: ", true, false);
        jubileu.setDeposito(300.00); 
        jubileu.status();
        
        Banco cleusa = new Banco("Nome: Cleusa", "Conta Corrente", 000.00, 000.00, "Informaçoes da Conta: ", false, true);
        cleusa.setDeposito(500.00);
        cleusa.status();
    }
}
