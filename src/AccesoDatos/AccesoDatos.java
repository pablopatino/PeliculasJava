
package AccesoDatos;

import Clases.Pelicula;
import java.util.List;


public interface AccesoDatos  {
    
    boolean existe( String nombreArchivo );
    
    List<Pelicula> listar( String nombre );
    
    void escribir( Pelicula pelicula, String nombreArchivo, boolean anexar);
    
    String buscar( String nombreArchivo, String buscar );
    
    void crear( String nombreArchivo );
    
    void borrar( String nombreArchivo );
    
    
}
