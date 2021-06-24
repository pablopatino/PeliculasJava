/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopeliculas;

import PeliculasNegocios.CatalogoPeliculas;
import PeliculasNegocios.CatalogoPeliculaslmpl;

/**
 *
 * @author pablo
 */
public class ProyectoPeliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        var archivo = "archivo.txt";
        
        var pelicula = new CatalogoPeliculaslmpl();
        
        pelicula.iniciarArchivo(archivo);
        
        
    }
    
}
