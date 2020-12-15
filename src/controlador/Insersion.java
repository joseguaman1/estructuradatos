/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author joe
 */
public class Insersion {
    private Datos datos = new Datos();    
    public void insersionNumero() {
        int cont = 0;
        for(int i = 1; i < datos.getVector().length; i++) {
            int j = i -1;
            int t = datos.getVector()[i];
            while (j >= 0 && t < datos.getVector()[j]) {                
                datos.getVector()[j + 1] = datos.getVector()[j];
                j--;                
                cont++;
            }
            datos.getVector()[j+1] = t;
            cont++;
        }
        System.out.println("Ha recorrido " + cont);
    }

    public Datos getDatos() {
        return datos;
    }
    
}
