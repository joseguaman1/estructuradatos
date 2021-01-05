/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Arrays;

/**
 *
 * @author joe
 */
public class Binaria {

    public int busquedaBinaria(int vector[], int dato) {
        int n = vector.length;
        int centro, inf = 0, sup = n - 1;
        
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            System.out.println("centro "+centro);
            if (vector[centro] == dato) {
                return centro;
            } else if (dato < vector[centro]) {               
                sup = centro - 1;
                System.out.println("sup "+sup);
            } else {
                inf = centro + 1;
                System.out.println("inf "+inf);
            }
        }
        return -1;
    }
    
    public void imprimir(int[] vector) {
        System.out.println("");
        for(int i = 0; i < vector.length; i++) {
            System.out.println(vector[i] + "\t");
        }
        System.out.println("");
    }
    
   
    
    public  boolean busquedaBinariaRecursiva(int[] vector, int valor) {

        int size = vector.length;  // Número de elementos
        int mitad = size / 2;        // Mitad del array

        System.out.println("Size: " + size);
        System.out.println("Middle: " + mitad);
        System.out.println("Arreglo: " );
        imprimir(vector);
        if(vector.length == 0) {
            return false;
        } 
        if (vector[mitad] == valor) {
            return true;
        } 
        else if (size == 0) {
            return false;
        } else if (vector[mitad] > valor) {
            return busquedaBinariaRecursiva(Arrays.copyOfRange(vector, 0, mitad), valor);
        } else {
            return busquedaBinariaRecursiva(Arrays.copyOfRange(vector, mitad + 1, size), valor);
        }
    }

    public static void main(String[] args) {
        Binaria b = new Binaria();
        int[] vector = {1, 4, 7, 8, 9, 14, 23, 47, 56, 60, 61, 63, 65, 66, 68, 69, 70, 73, 76, 77, 79, 80, 82};
        int valorBuscado = 850;
        int busqueda = b.busquedaBinaria(vector, valorBuscado);
        boolean encontrado = b.busquedaBinariaRecursiva(vector, valorBuscado);
        System.out.println("La posicion del dato en el vector es: "+ busqueda + " datos: " );
        System.out.println("RECURSIVO. La posicion del dato en el vector es: "+ encontrado + " datos: ");
        //63   pos 11
        //14   pos 5    4
        //     pos 2
        // 9    pos 4
    }
}
