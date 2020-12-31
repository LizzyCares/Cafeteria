/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;

/**
 *
 * @author Liz
 */
public enum Tamaño {
    
    CHICO(0),
    MEDIANO(4),
    GRANDE(8);
    public final double preciofinal;
    
    private Tamaño(double preciofinal){
     this.preciofinal=preciofinal;
    }
    
    public double Preciofinal(){
      return preciofinal;  
    }      
}
