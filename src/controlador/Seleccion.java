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
public class Seleccion {

    private Datos datos = new Datos();

    public void selecionNumero() {
        int cont = 0;
        // int k = 0;
        for (int i = 0; i < datos.getVector().length - 1; i++) {
            int k = i;            
            for (int j = i + 1; j < datos.getVector().length; j++) {
                if (datos.getVector()[j] < datos.getVector()[k]) {                    
                    k = j;
                }
                cont++;
            }
            int aux = datos.getVector()[i];
            datos.getVector()[i] = datos.getVector()[k];
            datos.getVector()[k] = aux;
            cont++;
        }
        System.out.println("Ha recorrido " + cont);
    }

    public Datos getDatos() {
        return datos;
    }
}
