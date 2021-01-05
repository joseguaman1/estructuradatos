/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.listas.hash;

/**
 *
 * @author joe
 */
public class NodoHash {
    private Object dato;
    private NodoHash sig;
    private int clave;

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
    
    
    public NodoHash() {
        dato = null;
        sig = null;
        clave = -1;
    }

    public NodoHash(Object dato, NodoHash sig, int clave) {
        this.dato = dato;
        this.sig = sig;
        this.clave = clave;
    }
    
    
    
    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoHash getSig() {
        return sig;
    }

    public void setSig(NodoHash sig) {
        this.sig = sig;
    }
}
