/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;

/**
 *
 * @author caelb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     for (Tamaño t: Tamaño.values()){
        System.out.println(t.toString()+ " $ " +t.Preciofinal());
     }
    }
    
}
