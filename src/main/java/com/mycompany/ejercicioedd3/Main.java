/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd3;
import java.util.Scanner;

/**
 *
 * @author Ricardo Santiago Tomé
 * @since 17/11/2020
 * @version 1.0
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float altura,radio,pi;
        Cono conoUsuario = new Cono();
        
        System.out.println("Introduzca altura del cono: ");
        Scanner reader = new Scanner(System.in);
        conoUsuario.setAltura (reader.nextFloat());
        
        System.out.println("Introduzca radio del cono: ");
        conoUsuario.setRadio (reader.nextFloat());
        
        System.out.println("Introduzca valor estimado para PI: ");
        conoUsuario.setPi (reader.nextFloat());
        
        System.out.println("El volumen del cono introducido es: "+conoUsuario.calcularVolumen());
        
        
    }
    
}
