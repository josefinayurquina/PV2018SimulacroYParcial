/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.datos;

import aplicacion.modelo.dominio.Imagen;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class ListadoImagenes {
    private byte[] Imagen;
    private int numImg;
    private ArrayList<Imagen> listaImagenes;
    
    public ListadoImagenes() {
        listaImagenes=new ArrayList();
    }
    
    public void llenarListado(byte[] imgGuardar ){
        if(getListaImagenes().isEmpty()){
            setNumImg(0);
        }
        else {
            setNumImg(getListaImagenes().size());
          
        }
        getListaImagenes().add(new Imagen(getNumImg(),imgGuardar));
    }
    
    public ArrayList<Imagen> getListaImagenes(){
        return listaImagenes;
    }

    public ListadoImagenes(byte[] Imagen, int numImg, ArrayList<Imagen> listaImagenes) {
        this.Imagen = Imagen;
        this.numImg = numImg;
        this.listaImagenes = listaImagenes;
    }

    /**
     * @return the Imagen
     */
    public byte[] getImagen() {
        return Imagen;
    }

    /**
     * @param Imagen the Imagen to set
     */
    public void setImagen(byte[] Imagen) {
        this.Imagen = Imagen;
    }

    /**
     * @return the numImg
     */
    public int getNumImg() {
        return numImg;
    }

    /**
     * @param numImg the numImg to set
     */
    public void setNumImg(int numImg) {
        this.numImg = numImg;
    }

    /**
     * @return the listaImagenes
     */
   

    /**
     * @param listaImagenes the listaImagenes to set
     */
    public void setListaImagenes(ArrayList<Imagen> listaImagenes) {
        this.listaImagenes = listaImagenes;
    }

    
    
    
    
}
