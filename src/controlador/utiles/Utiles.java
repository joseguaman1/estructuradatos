/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.utiles;

import modelo.Estudainte;

/**
 *
 * @author joe
 */
public class Utiles {
    public static int compareTo(Object o, Object o1) {
        int i = 0;
        if(o instanceof Integer && o1 instanceof Integer) {
            Integer uno = (Integer)o;
            Integer dos = (Integer)o1;
            if(uno > dos)
                i = 1;
            else if(uno < dos)
                i = -1;
            
                
        }
        
        if(o instanceof Estudainte && o1 instanceof Estudainte) {
            Estudainte uno = (Estudainte)o;
            Estudainte dos = (Estudainte)o1;
            //i = uno.getApellidos().toUpperCase().compareTo(dos.getApellidos().toUpperCase());
            if(uno.getApellidos().toUpperCase().compareTo(dos.getApellidos().toUpperCase()) > 0) 
                i = 1;
            else 
                i = -1;
        }
        
        return i;
    }
    
    
}
