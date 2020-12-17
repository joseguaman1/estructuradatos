/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.listas.ListaSimple;

/**
 *
 * @author joe
 */
public class OrdenacionNumero {
    private ListaSimple lista = new ListaSimple();
    public void llenar(int tamano) {
        for (int i = 0; i < tamano; i++) {
            int aux = (int) (Math.random() * 100);
            lista.insertarFinal(aux);
        }
    }
    
    public void imprimir() {
        lista.verDatos();
    }
    
    public void ordenar() {
        lista.ordenar(ListaSimple.ORDENAR_DESCENDENTE);
    }
    
}
