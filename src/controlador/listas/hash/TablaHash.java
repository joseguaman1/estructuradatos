/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.listas.hash;

import controlador.utiles.Utiles;

/**
 *
 * @author joe
 */
public class TablaHash {
    public NodoHash cabecera;
    public static final int ORDENAR_ASCENDENTE = -1;
    public static final int ORDENAR_DESCENDENTE = 1;

    public TablaHash() {
        this.cabecera = null;
    }

    public int tamano() {
        int tamano = 0;
        if (!estaVacio()) {
            NodoHash tmp = cabecera;
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
        NodoHash tmp = new NodoHash(dato, null, tamano());
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
            NodoHash tmp = cabecera;
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
    
    public Object obtenerPorLlave(int llave) {
        Object r = null;
        if (!estaVacio()) {
            NodoHash tmp = cabecera;
            while(tmp != null) {
                if(tmp.getClave() == llave) {
                    r = tmp;
                    break;
                }
                tmp = tmp.getSig();
            }
        }
        return r;
    }
    

    public void verDatos() {
        if (!estaVacio()) {
            NodoHash tmp = cabecera;
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
            NodoHash iterador = cabecera;
            for (int i = 0; i < pos; i++) {
                if (iterador.getSig() == null) {
                    break;
                }
                iterador = iterador.getSig();
            }
            NodoHash tmp = new NodoHash(dato, iterador.getSig(), tamano());
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
                NodoHash aux = cabecera;
                // Recorre la lista hasta lleger al nodo anterior al eliminar.
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSig();
                }
                // Alctualiza el valor del nodo.
                aux.setDato(dato);
            }
        }
    }

    public void ordenar(int tipo_ordenacion, String atributo) {
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
    }
}
