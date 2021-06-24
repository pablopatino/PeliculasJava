/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeliculasNegocios;

import AccesoDatos.AccesoDatos;
import AccesoDatos.AccesoFunciones;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CatalogoPeliculaslmpl implements CatalogoPeliculas {
    
     private final AccesoDatos datos;
     
     public CatalogoPeliculaslmpl(){
         this.datos = new AccesoFunciones();
     }
    
    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
     
        this.datos.crear(nombreArchivo);
        
    }
    
    @Override
    public void listarPeliculas(String nombreArchivo) {
        
   
    }
    
    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
       
    }
    
    @Override
    public void iniciarArchivo(String nombreArchivo) {
        

        
    }
    
}
