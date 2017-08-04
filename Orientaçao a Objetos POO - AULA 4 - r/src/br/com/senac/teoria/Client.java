/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.teoria;

/**
 *
 *  @author Victor Henrique Ranalli Barbosa
 */
public class Client {
    public static void main(String[] args) {
         ContaBanco p1 = new ContaBanco();
         p1.abrirconta("CP", " Jubileu ", 1111);
         p1.depositar(100);
         p1.extrato();
         p1.sacar(150);
         p1.fecharconta();
    }
}
