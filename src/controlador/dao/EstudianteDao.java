/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.dao;

import modelo.Estudainte;

/**
 *
 * @author joe
 */
public class EstudianteDao extends AdaptadorDao {
    
    private Estudainte estudainte;
    
    public EstudianteDao() {
        super(new Conexion(), Estudainte.class);
    }

    public Estudainte getEstudainte() {
        if(estudainte == null)
            estudainte = new Estudainte();
        return estudainte;
    }
    
    public Boolean guardar() {
        try {
            this.getEstudainte().setId(Long.parseLong(String.valueOf(listar().tamano() + 1)));
            this.guardar(this.getEstudainte());
            return true;
        } catch (Exception e) {
            System.out.println("Error en guardar estudiante "+ e);
            return false;
        }
    }

    public void setEstudainte(Estudainte estudainte) {
        this.estudainte = estudainte;
    }
    
    
    
}
