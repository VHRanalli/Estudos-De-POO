package br.com.senac.encapsulamento;

/**
 *
 *  @author Victor Henrique Ranalli Barbosa
 */
public class Aula5 {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisvolume();
        c.play();
        c.pause();
        c.abrimenu();
        c.fecharmenu();
    }
}
