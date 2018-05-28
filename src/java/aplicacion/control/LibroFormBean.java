/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.control;

import aplicacion.modelo.datos.ListaLibro;
import aplicacion.modelo.dominio.Libro;
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
public class LibroFormBean {
    private ListaLibro libros;
    private String nomL;
    private String autor;
    private String cod;
    private Libro libro;
    private String bl;
    
    

    /**
     * Creates a new instance of LibroFormBean
     */
    public LibroFormBean() {
        libros=new ListaLibro();
    }
    
    public void reiniciarLista(){
        FacesMessage message=new FacesMessage("Se reinicio la lista");
        FacesContext.getCurrentInstance().addMessage(null, message);
        libros=new ListaLibro();
    }
    
    public void agregarLibro(){
        libro=new Libro(getNomL(),getAutor(),getCod());
        libros.agregarLista(libro);
        FacesMessage message=new FacesMessage("El libro fue agregado a la lista");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    public void eliminarLibro(){
        libros.eliminarLibros(libro);
    }
    
    public void buscarLibro(){
        for(int i=0;i<libros.getLista().size();i++){
            if(libros.getLista().get(i).getNombreLibro().equals(getBl())){
                FacesMessage message=new FacesMessage("El libro encontrado se muestra en la lista");
                FacesContext.getCurrentInstance().addMessage(null, message);
                libro.setNombreLibro(libros.getLista().get(i).getNombreLibro());
                libro.setAutor(libros.getLista().get(i).getAutor());
                libro.setCodigo(libros.getLista().get(i).getCodigo());
                libros=new ListaLibro();
                libros.agregarLista(libro);
                
            }
        }
    }
    
    public void modificarLibro(){
        libros.modificarLibros(libro);
    }
    
    public void establecerLibro(Libro unLibro){
        setLibro(unLibro);
    }

    public LibroFormBean(ListaLibro libros, String nomL, String autor, String cod, Libro libro, String bl) {
        this.libros = libros;
        this.nomL = nomL;
        this.autor = autor;
        this.cod = cod;
        this.libro = libro;
        this.bl = bl;
    }

    /**
     * @return the libros
     */
    public ListaLibro getLibros() {
        return libros;
    }

    /**
     * @param libros the libros to set
     */
    public void setLibros(ListaLibro libros) {
        this.libros = libros;
    }

    /**
     * @return the nomL
     */
    public String getNomL() {
        return nomL;
    }

    /**
     * @param nomL the nomL to set
     */
    public void setNomL(String nomL) {
        this.nomL = nomL;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the cod
     */
    public String getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(String cod) {
        this.cod = cod;
    }

    /**
     * @return the libro
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * @param libro the libro to set
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    /**
     * @return the bl
     */
    public String getBl() {
        return bl;
    }

    /**
     * @param bl the bl to set
     */
    public void setBl(String bl) {
        this.bl = bl;
    }
    
    
    
}
