/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.encapsulamento;

/**
 *
 * @author Victor Henrique Ranalli Barbosa
 */
public class ControleRemoto implements Controlador {
      
  // Atributos  
  private int volume;
  private boolean ligado;
  private boolean tocando;
  
  //metodos expeciais

    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
  // Metodos Abstratus
 //  Metodos Controladores

    @Override
    public void ligar() {
    this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrimenu() {
        System.out.println("----- MENU -----");
        System.out.println("Esta Ligado? " + this.isLigado());
        System.out.println("Esta Tocando? " + this.isTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=5){
            System.out.print("|");   
        }
    }

    @Override
    public void fecharmenu() {
        System.out.println();
        System.out.println("Fechando o Menu...");
    }

    @Override
    public void maisvolume() {
    if (this.isLigado()){
        this.setVolume(this.getVolume() + 1);
    } else{
        System.out.println("Impossível aumentar volume");
    }
    }

    @Override
    public void menosvolume() {
        if (this.isLigado()) {
            this.setVolume(- 1);
        } else{
            System.out.println("Impossível diminuir volume");
        }
    }

    @Override
    public void ligarmudo() {
        if (this.isLigado() && this.getVolume() > 0 ) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarmudo() {
        if (this.isLigado() && this.getVolume() <= 0) {
            this.setVolume(50);
        } else{
            
        
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())) {
            
            this.setTocando(true);
            
        } else {
            System.out.println("Impossível dar play");   
        }    
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
         
            this.setTocando(false);
            
        } else {
            System.out.println("nao conssegui reproduzir");
        }
    }
}
