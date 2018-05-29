/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.control;

import aplicacion.modelo.datos.ListaCuadrado;
import aplicacion.modelo.dominio.Cuadrado;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped
public class CuadradoFormBean implements Serializable {
    private Cuadrado cuadrado;
    private ListaCuadrado listaCuadrado;
    private double a;
    private double per;
    private double sup;
    private Cuadrado objcuadrado = new Cuadrado();
    
    public CuadradoFormBean() {
        listaCuadrado=new ListaCuadrado();
        cuadrado=new Cuadrado();
    }
    
    public void ingresarC(){
        per=a*4;
        sup=Math.pow(a, 2);
        
        cuadrado.setA(a);
        cuadrado.setPer(per);
        cuadrado.setSup(sup);
        getListaCuadrado().Agregar(cuadrado);
        cuadrado=new Cuadrado(getA(),getPer(),getSup());
    }
    
    public void reiniciarLista(){
        FacesMessage message=new FacesMessage("Se reinicio la lista");
        FacesContext.getCurrentInstance().addMessage(null, message);
        listaCuadrado = new ListaCuadrado();
    }
   
    public void modificar()
    {
    
        getObjcuadrado().setA(a);
    }
    public void elejirCuadrado(Cuadrado Elejido){
       
        setObjcuadrado(Elejido);
      a=getObjcuadrado().getA();
    }

    /**
     * @return the unCuadrado
     */
   

    /**
     * @return the listaCuadrado
     */
    public ListaCuadrado getListaCuadrado() {
        return listaCuadrado;
    }

    /**
     * @param listaCuadrado the listaCuadrado to set
     */
    public void setListaCuadrado(ListaCuadrado listaCuadrado) {
        this.listaCuadrado = listaCuadrado;
    }

    /**
     * @return the lado
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the lado to set
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * @return the cuadrado
     */
    public Cuadrado getCuadrado() {
        return cuadrado;
    }

    /**
     * @param cuadrado the cuadrado to set
     */
    public void setCuadrado(Cuadrado cuadrado) {
        this.cuadrado = cuadrado;
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

    /**
     * @return the objcuadrado
     */
    public Cuadrado getObjcuadrado() {
        return objcuadrado;
    }

    /**
     * @param objcuadrado the objcuadrado to set
     */
    public void setObjcuadrado(Cuadrado objcuadrado) {
        this.objcuadrado = objcuadrado;
    }
    
}
