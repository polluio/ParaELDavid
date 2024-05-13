

package Veterinaria;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Rafa
 * @company Ciclo Superior de Informatica
 */
public class Tratamiento implements Serializable{
    private LocalDate fecha;
    private String descripcion;

    public Tratamiento(LocalDate fecha, String descripcion) {
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
   
    
}
