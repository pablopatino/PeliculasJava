package AccesoDatos;

import Clases.Pelicula;
import PeliculasNegocios.CatalogoPeliculaslmpl;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccesoFunciones implements AccesoDatos {

    @Override
    public boolean existe(String nombreArchivo) {
        var archivo = new File(nombreArchivo);

        return archivo.exists();
    }

    @Override
    public List listar(String nombre) {
        var archivo = new File(nombre);

        List<Pelicula> peliculaList = new ArrayList();

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;

            linea = entrada.readLine();

            while (linea != null) {
                var pelicula = new Pelicula(linea);
                peliculaList.add(pelicula);
                linea = entrada.readLine();
            }
            entrada.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

        return peliculaList;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) {

        var archivo = new File(nombreArchivo);
        try {
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.print(pelicula.toString());
            salida.close();
            System.out.println("Se ha escrito informacion al archivo");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }

    @Override
    public String buscar(String nombreArchivo, String buscar) {
        var archivo = new File(nombreArchivo);
        String resultado = null;
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            int indice = 1;
            while (linea != null) {
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                    resultado = "Pelicula " + linea + "Encontada en el indice: " + indice;
                    break;
                }

                linea = entrada.readLine();
                indice++;
            }
            entrada.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccesoFunciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccesoFunciones.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    }

    @Override
    public void crear(String nombreArchivo) {

        File archivo = new File(nombreArchivo);

        try {
            var salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Archivo creado exitosamente");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccesoFunciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccesoFunciones.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void borrar(String nombreArchivo) {

        File archivo = new File(nombreArchivo);
        if (archivo.exists()) {
            archivo.delete();
            System.out.println("Archivo borrado exitosamente");

        }

    }

}
