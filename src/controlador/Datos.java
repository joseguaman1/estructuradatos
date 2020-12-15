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
public class Datos {

    private int[] vector = {54,70,71,48,20,33,30,82,67,81,63,90,63,82,19,82,93,52,27,97,72,88,94,35,39,80,36,47,77,23,66,8,5,56,38,93,19,88,59,28,24,2,22,67,87,78,77,21,54,93,40,50,31,37,85,94,78,67,92,26,9,56,8,85,60,58,0,41,27,36,84,32,57,13,10,43,3,95,37,33,2,62,97,99,60,7,39,6,5,58,74,72,12,4,94,65,23,21,21,33};
    private String[] cadena = {"Loja", "Guayas", "Sucumbios", "Galapagos", "Bolivar", "Manabi"};
    
    
    public void llenadoAleatoreo(int tamano) {
        vector = new int[tamano];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100);
        }
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public String[] getCadena() {
        return cadena;
    }

    public void setCadena(String[] cadena) {
        this.cadena = cadena;
    }
    
    public void imprimir() {
        System.out.println("*****");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + "\t");
        }
        System.out.println("*****");
    }

    public void imprimirCadena() {
        System.out.println("*****");
        for (int i = 0; i < cadena.length; i++) {
            System.out.print(cadena[i] + "\t");
        }
        System.out.println("*****");
    }

}
