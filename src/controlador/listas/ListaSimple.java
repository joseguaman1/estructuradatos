/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.listas;

import controlador.utiles.Utiles;

/**
 *
 * @author joe
 */
public class ListaSimple {

    public Nodo cabecera;
    public static final int ORDENAR_ASCENDENTE = -1;
    public static final int ORDENAR_DESCENDENTE = 1;

    public ListaSimple() {
        this.cabecera = null;
    }

    public int tamano() {
        int tamano = 0;
        if (!estaVacio()) {
            Nodo tmp = cabecera;
            while (tmp != null) {
                tamano++;
                tmp = tmp.getSig();
            }
        }
        return tamano;
    }

    public void insertar(Object dato) {
        if (dato == null) {
            new NullPointerException("Se debe agregar un objeto restaurante");
        }
        //se crea el nodo con el dato y que apunte a nulo
        Nodo tmp = new Nodo(dato, null);
        //se apunta el nodo temporal a la cabecera
        tmp.setSig(cabecera);
        //se mueve el nodo tmp a la cabecera
        cabecera = tmp;
    }

    public boolean estaVacio() {
        return (this.cabecera == null);//(this.cabecera != null) ? false : true;
    }

    public Object extraer() {
        Object dato = null;

        if (!estaVacio()) {
            dato = cabecera.getDato();
            cabecera = cabecera.getSig();
        }
        return dato;
    }

    public Object obtenerPorPosicion(int pos) {
        Object r = null;
        if (!estaVacio()) {
            Nodo tmp = cabecera;
            for (int i = 0; i < pos; i++) {
                tmp = tmp.getSig();
                if (tmp == null) {
                    break;
                }
            }
            //System.out.println(tmp.getDato());
            if (tmp != null) {
                r = tmp.getDato();
            }
        }
        return r;
    }

    public void verDatos() {
        if (!estaVacio()) {
            Nodo tmp = cabecera;
            while (tmp != null) {
                System.out.print(tmp.getDato().toString() + "\t");
                tmp = tmp.getSig();
            }

        }
        System.out.println("");
    }

    public void insertar(Object dato, int pos) {
        if (estaVacio() || pos <= 0) {
            insertar(dato);
        } else {
            Nodo iterador = cabecera;
            for (int i = 0; i < pos; i++) {
                if (iterador.getSig() == null) {
                    break;
                }
                iterador = iterador.getSig();
            }
            Nodo tmp = new Nodo(dato, iterador.getSig());
            iterador.setSig(tmp);
        }
    }

    public void insertarFinal(Object dato) {
        insertar(dato, tamano() - 1);
    }

    public void editar(int posicion, Object dato) {
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y < que el numero de elementos del la lista.
        if (posicion >= 0 && posicion < tamano()) {
            // Consulta si el nodo a eliminar es el primero.
            if (posicion == 0) {
                // Alctualiza el valor delprimer nodo.
                cabecera.setDato(dato);
            } else {
                // En caso que el nodo a eliminar este por el medio 
                // o sea el ultimo
                Nodo aux = cabecera;
                // Recorre la lista hasta lleger al nodo anterior al eliminar.
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSig();
                }
                // Alctualiza el valor del nodo.
                aux.setDato(dato);
            }
        }
    }
    //2020-12-12 ---String
    
    public ListaSimple ordenar(int tipo_ordenacion, String atributo) {
        if (!estaVacio()) {
            for (int i = 0; i < tamano() - 1; i++) {
                int k = i;
                for (int j = i + 1; j < tamano(); j++) {
                    if (Utiles.compareTo(obtenerPorPosicion(j), obtenerPorPosicion(k), atributo) == tipo_ordenacion) {
                        k = j;
                    }                    
                }
                Object aux = obtenerPorPosicion(i);                
                editar(i, obtenerPorPosicion(k));
                editar(k, aux);                
            }
        }
        return this;
    }
    
    public Object busquedaBinaria(String dato, String atributo) {
        System.out.println("DATO " + dato + " ATRIBUTO " + atributo);
        int n = tamano();
        int centro, inf = 0, sup = n - 1;

        while (inf <= sup) {
            centro = (sup + inf) / 2;

            System.out.println("centro " + centro + " ss " + obtenerPorPosicion(centro) + " saa " + dato);
            //if ((String.valueOf(obtenerPorPosicion(centro))).equalsIgnoreCase(dato)) {
            if(Utiles.comparar(dato, obtenerPorPosicion(centro), atributo)) {
                return obtenerPorPosicion(centro);
            } else if (Utiles.compareTo(dato, obtenerPorPosicion(centro), atributo) < 0) {//else if (dato.compareTo(String.valueOf(obtenerPorPosicion(centro))) < 0) {
                sup = centro - 1;
                System.out.println(" sup " + sup);
            } else {
                inf = centro + 1;
                System.out.println("inf " + inf);
            }

        }
        return null;
    }

}
