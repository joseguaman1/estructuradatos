/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Calendar;
import java.util.HashMap;

/**
 *
 * @author joe
 */
public class TransformacionHash {
    public static void main(String[] args) {
        HashMap mapa = new HashMap();
        mapa.put("Maria", "Estudiante maria, nota 8.0");        
        System.out.println(mapa.get("Maria"));
        mapa.put("Maria", "Estudiante maria, nota 7.0");
        System.out.println(mapa.get("Maria"));
        //Producto
        //codigo   se forma a partir de la fecha de elaboracion + fecha de expiracion
        //2020-01-05 ----->  
        //2020-01-05 09:12:00
        
        //fecha actual (2020-01-05 10:50:24) - 2020-01-05 00:00:00 --> llave unica
        Calendar actual = Calendar.getInstance();
        Calendar ayer = Calendar.getInstance();
        ayer.set(Calendar.YEAR, 2020);
        ayer.set(Calendar.MONTH, 01);
        ayer.set(Calendar.DATE, 04);
        long aux = actual.getTime().getTime() - ayer.getTime().getTime();
        System.out.println("tiempo "+ aux);
        //29030399963
        //29030399966
        //29030399948
        
        //java   --- > link ["pag1", "pag2", "pag3", ..... pagn]   
    }
}
