/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenaciontercero;

import controlador.Burbuja;

/**
 *
 * @author joe
 */
public class Ordenaciontercero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Burbuja burbuja = new Burbuja();
        burbuja.llenadoAleatoreo();
        //burbuja.imprimir();
        
        burbuja.ordenar();
        burbuja.llenadoAleatoreo();
        burbuja.ordenarAlreves();
        //burbuja.imprimir();
      //con cadenas
        //burbuja.imprimirCadena();
        //burbuja.ordenarAlrevesString();
        //burbuja.imprimirCadena();
        burbuja.llenadoAleatoreo();
        burbuja.imprimir();
        burbuja.ordenarMejoradoBurbuja();
        burbuja.imprimir();
    }
    
}
