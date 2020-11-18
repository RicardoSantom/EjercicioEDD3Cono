/*
 * This program calculates the volume of a cone by requesting parameters from  
 * the keyboard and displaying them on the screen. It also invites you to a coffee.
 */
package com.mycompany.ejercicioedd3;

/**
 *
 * @author Ricardo Santiago Tomé
 * @version 1.0
 * @since 16/11/2020
 */
public class Cono {
    private float radio;
    private float altura;
    private float pi;

    
     Cono(float radio, float altura,float pi) {
        this.radio = radio;
        this.altura = altura;
        this.pi = pi;
    }

    Cono() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }
/**
 * This function returns the value of the volume of the cone.
 * @return volume of the cone.
 */
    float calcularVolumen(){
        return (pi*radio*radio*altura)/3f;
    }


}
