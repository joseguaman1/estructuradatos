/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenaciontercero;

import controlador.Burbuja;
import controlador.Insersion;
import controlador.OrdenacionNumero;
import controlador.Seleccion;

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
        
      /*  burbuja.llenadoAleatoreo();
        //burbuja.imprimir();
        
        burbuja.ordenar();
        burbuja.llenadoAleatoreo();
        burbuja.ordenarAlreves();
        //burbuja.imprimir();
      //con cadenas
        //burbuja.imprimirCadena();
        //burbuja.ordenarAlrevesString();
        //burbuja.imprimirCadena();
        */
       // burbuja.llenadoAleatoreo();
       System.out.println("BURBUJA");
        Burbuja burbuja = new Burbuja();
        burbuja.imprimir();
        burbuja.ordenarMejoradoBurbuja();
        burbuja.imprimir();
        System.out.println("INSERSION");
        Insersion insersion = new Insersion();
        //insersion.getDatos().llenadoAleatoreo(100);
        insersion.getDatos().imprimir();
        insersion.insersionNumero();
        insersion.getDatos().imprimir();
        System.out.println("SELECCION");
        Seleccion seleccion = new Seleccion();
        //seleccion.getDatos().llenadoAleatoreo(100);
        seleccion.getDatos().imprimir();
        seleccion.selecionNumero();
        seleccion.getDatos().imprimir();
      
        //lista
        System.out.println("LISTA");
        OrdenacionNumero ordenacion = new OrdenacionNumero();
        ordenacion.llenar(50);
        ordenacion.imprimir();
        ordenacion.ordenar();
        ordenacion.imprimir();
        
    }
    
}
