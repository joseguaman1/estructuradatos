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
public class Burbuja {

    private int[] numeros = {54,70,71,48,20,33,30,82,67,81,63,90,63,82,19,82,93,52,27,97,72,88,94,35,39,80,36,47,77,23,66,8,5,56,38,93,19,88,59,28,24,2,22,67,87,78,77,21,54,93,40,50,31,37,85,94,78,67,92,26,9,56,8,85,60,58,0,41,27,36,84,32,57,13,10,43,3,95,37,33,2,62,97,99,60,7,39,6,5,58,74,72,12,4,94,65,23,21,21,33};
    private String[] apellidos = {"Salazar", "Armijos", "Zeas", "Tacuri", "TACURI", "Soto"};

    public void llenadoAleatoreo() {
        numeros = new int[100];
        for (int i = 0; i < 100; i++) {
            numeros[i] = (int) (Math.random() * 100);
        }
    }

    public void ordenar() {
        int cont = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
                cont++;
            }
          //  System.out.println("----------");
       //     imprimir();
      //      System.out.println("----------");
        }
        System.out.println("ITERO ordenar clasico" + cont);
    }

    public void ordenarAlreves() {
        int cont = 0;
        for (int i = numeros.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
                cont++;
            }
         //   System.out.println("----------");
     //       imprimir();
       //     System.out.println("----------");
        }
        System.out.println("ITERO ordenarAlreves" + cont);
    }

    public void ordenarAlrevesString() {
        int cont = 0;
        for (int i = apellidos.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (apellidos[j].compareTo(apellidos[j + 1]) > 0) {
                    String aux = apellidos[j];
                    apellidos[j] = apellidos[j + 1];
                    apellidos[j + 1] = aux;
                }
                cont++;
            }
          //  System.out.println("----------");
         //   imprimirCadena();
         //   System.out.println("----------");
        }
        System.out.println("ITERO CADENAS" + cont);
    }

    public void imprimir() {
        System.out.println("*****");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "\t");
        }
        System.out.println("*****");
    }

    public void imprimirCadena() {
        System.out.println("*****");
        for (int i = 0; i < apellidos.length; i++) {
            System.out.print(apellidos[i] + "\t");
        }
        System.out.println("*****");
    }

    public void ordenarMejoradoBurbuja() {
        int cont = 0;
        int l = 1;
        int r = numeros.length - 1;
        int k = numeros.length - 1;
        do {
            for (int j = r; j >= l; j--) {
                if (numeros[j - 1] > numeros[j]) {
                    int aux = numeros[j - 1];
                    numeros[j - 1] = numeros[j];
                    numeros[j] = aux;
                    k = j;
                }
                cont++;
            }
            l = k + 1;
            for (int j = l; j <= r; j++) {
                if (numeros[j - 1] > numeros[j]) {
                    int aux = numeros[j - 1];
                    numeros[j - 1] = numeros[j];
                    numeros[j] = aux;
                    k = j;
                }
                cont++;
            }
            r = k - 1;
            cont++;
        } while (l < r);
        System.out.println("Itero el mejorado "+cont);
    }

}
