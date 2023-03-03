/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.banana.negocio;


import mx.itson.banana.enumerador.Existencia;
import static mx.itson.banana.enumerador.Existencia.INEXISTENTE;
import mx.itson.banana.exception.BananaException;

/**
 *
 * @author medin
 */
public class Operacion {
    public void BananaExistencia(Existencia existencia) throws BananaException{
    
        if(existencia.equals(INEXISTENTE)){
        throw new BananaException("Lo siento, el producto no esta agotado, intente otro día");
        }
        
    }
}
