/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.banana.main;

import mx.itson.banana.entidades.Almacen;
import mx.itson.banana.entidades.Producto;
import mx.itson.banana.enumerador.Existencia;
import mx.itson.banana.negocio.Operacion;

/**
 *
 * @author medin
 */
public class VistaBanana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Producto p = new Producto();
        Operacion o = new Operacion();
        
        p.setNombre("xd");
        p.setPrecio(15.2);
        p.setExistencia(Existencia.INEXISTENTE);
        System.out.println(p.getNombre()+ "      "+p.getPrecio()+"    "+p.getExistencia());
        o.BananaExistencia(p.getExistencia());
        }catch(Exception e){
        System.out.println(e);
        }
        
    }
    
}
