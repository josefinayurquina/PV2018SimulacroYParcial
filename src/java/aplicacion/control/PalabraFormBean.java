/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.control;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped
public class PalabraFormBean {
    private String palabra;
    private ArrayList<String> listaPalabras;

    public PalabraFormBean() {
        listaPalabras=new ArrayList();
    }
    
    public void guardarPalabra(){
        getListaPalabras().add(getPalabra());
    }
    
    public void ordenarA(){
        String auxp = null;
        int aux;
        for(int i=0;i<getListaPalabras().size();i++){
            for(int j=i;j<getListaPalabras().size();j++){
                aux=getListaPalabras().get(i).compareToIgnoreCase(getListaPalabras().get(j));
                if(aux>0){
                    auxp=getListaPalabras().get(i);
                    getListaPalabras().set(i, getListaPalabras().get(j));
                    getListaPalabras().set(j, auxp);
                
                }
            }
        }
    }
    
    public void reinicializar(){
        listaPalabras = new ArrayList();
    }

    public PalabraFormBean(String palabra, ArrayList<String> listaPalabras) {
        this.palabra = palabra;
        this.listaPalabras = listaPalabras;
    }

    
    /**
     * @return the listaPalabras
     */
    public ArrayList<String> getListaPalabras() {
        return listaPalabras;
    }

    /**
     * @param listaPalabras the listaPalabras to set
     */
    public void setListaPalabras(ArrayList<String> listaPalabras) {
        this.listaPalabras = listaPalabras;
    }

    /**
     * @return the palabra
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * @param palabra the palabra to set
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
    
    
    
    /**
     * Creates a new instance of PalabraFormBean
     */
}   