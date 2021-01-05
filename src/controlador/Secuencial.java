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
public class Secuencial {
    public static void main(String[] args) {
		int[] lista = new int[100];	// Lista de números enteros que supondremos llena.
                for(int j = 0; j < lista.length; j++) {
                    lista[j] = (int)(Math.random()*10000);
                }
                
                System.out.println("presentar");
                for(int j = 0; j < lista.length; j++) {
                    System.out.print(lista[j]+"\t");
                }
                System.out.println("");
                int valor = 13;  //valor a buscar
		boolean encontrado = false;	// Declaramos e inicializamos una bandera.
		int i = 0;			// Declaramos e inicializamos un índice.
		
		while ( (i < lista.length) && !encontrado )
			if (lista[i++] == valor)		// Incrementamos el índice después de la comparación
				encontrado = true;
		
		// Al finalizar el programa, la bandera nos indica si hemos encontrado el valor
		if (encontrado)
			System.out.println("Sí hay algún valor 13 en la lista.");
		else
			System.out.println("No hay ningún valor 13 en la lista.");
	}
}
