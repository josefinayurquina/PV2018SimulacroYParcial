/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Alumno
 */
public class Cuadrado implements Serializable{
    private double a;
    private double per;
    private double sup;

    
    public Cuadrado() {
    }
   
    public Cuadrado(double a, double per, double sup) {
        this.a = a;
        this.per = per;
        this.sup = sup;
    }
    
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * @return the per
     */
    public double getPer() {
        return per;
    }

    /**
     * @param per the per to set
     */
    public void setPer(double per) {
        this.per = per;
    }

    /**
     * @return the sup
     */
    public double getSup() {
        return sup;
    }

    /**
     * @param sup the sup to set
     */
    public void setSup(double sup) {
        this.sup = sup;
    }
}


