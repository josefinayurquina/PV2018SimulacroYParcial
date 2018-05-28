/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.control;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped
public class NumeroFormBean implements Serializable {
    private int num;
    private int sum;
    private int cont;

    /**
     * Creates a new instance of NumeroFormBean
     */
    public NumeroFormBean() {
        
    } 
    
     /**
     * @return the sum
     */
    public int getSum() {
        return sum;
    }

    /**
     * @param sum the sum to set
     */
    public void setSum(int sum) {
        this.sum = sum;
    }
    
    public void calcularSum(){
        
        sum=0;
        for(int i=1;i<=getNum();i++){
            sum=sum+((i*(i*1))/((2*i)-1)); 
     // o puede ser sum=sum+i pero de esa forma ya no se pondria la formula       
     // que se indica en el punto tres, por eso no lo escribí así.
            
        }
        
    }
    
    

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    

    /**
     * @return the cont
     */
    public int getCont() {
        return cont;
    }

    /**
     * @param cont the cont to set
     */
    public void setCont(int cont) {
        this.cont = cont;
    }

    
    
    
}
