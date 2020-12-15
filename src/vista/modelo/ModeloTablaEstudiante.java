/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.modelo;

import controlador.listas.ListaSimple;
import javax.swing.table.AbstractTableModel;
import modelo.Estudainte;

/**
 *
 * @author joe
 */
public class ModeloTablaEstudiante extends AbstractTableModel{
    private ListaSimple lista = new ListaSimple();

    public ListaSimple getLista() {
        return lista;
    }

    public void setLista(ListaSimple lista) {
        this.lista = lista;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public int getRowCount() {
        return lista.tamano();
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Estudainte e = (Estudainte)lista.obtenerPorPosicion(i);
        switch(i1) {
            case 0: return i+1;
            case 1: return e.getCedula();
            case 2: return e.getApellidos() + " " + e.getNombres();
            case 3: return e.getTelefono();
            case 4: return e.getCorreo();
            default:return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0: return "Nro";
            case 1: return "CEDULA";
            case 2: return "ESTUDIANTE";
            case 3: return "TELEFONO";
            case 4: return "CORREO";
            default:return null;
        }
    }
    
    
    
    
}
