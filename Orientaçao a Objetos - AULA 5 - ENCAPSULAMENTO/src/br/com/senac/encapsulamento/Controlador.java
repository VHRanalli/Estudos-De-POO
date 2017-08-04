package br.com.senac.encapsulamento;

/**
 *
 *  @author Victor Henrique Ranalli Barbosa
 */
public interface Controlador {
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrimenu();
    public abstract void fecharmenu();
    public abstract void maisvolume();
    public abstract void menosvolume();
    public abstract void ligarmudo();
    public abstract void desligarmudo();
    public abstract void play();
    public abstract void pause();
}
