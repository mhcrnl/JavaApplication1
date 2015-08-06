/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author mhcrnl
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Salut Romania!");
        NewClass nc = new NewClass(100, 236, "00rom");
        nc.setlimiteCartao(289);
        nc.imprimir();
    }
    
}
