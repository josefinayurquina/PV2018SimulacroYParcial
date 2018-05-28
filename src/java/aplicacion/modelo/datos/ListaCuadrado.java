/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.datos;

import aplicacion.modelo.dominio.Cuadrado;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class ListaCuadrado {
    private ArrayList<Cuadrado> listado;

    public ListaCuadrado() {
        listado=new ArrayList();
    }

    public ListaCuadrado(ArrayList<Cuadrado> listado) {
        this.listado = listado;
    }
    
    public void Agregar(Cuadrado unCuadrado){
        listado.add(unCuadrado);
    }

    /**
     * @return the listado
     */
    public ArrayList<Cuadrado> getListado() {
        return listado;
    }

    /**
     * @param listado the listado to set
     */
    public void setListado(ArrayList<Cuadrado> listado) {
        this.listado = listado;
    }
    

}


