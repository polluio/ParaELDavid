package Veterinaria;


import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

abstract class Mascota implements Serializable {
    protected int id;
    protected Cliente duenyo;
    protected String nombre;
    protected LocalDate fechaNacimiento;
    protected String especie;
    private ArrayList<Tratamiento> historial = new ArrayList<Tratamiento>();


    public Mascota(int id, Cliente duenyo, String nombre, LocalDate fechaNacimiento, String especie)  {
        this.id = id;
        this.duenyo = duenyo;
        this.nombre = nombre;
        if (fechaNacimiento==null){
            this.fechaNacimiento=LocalDate.parse("0/0/0");
        }else{
            this.fechaNacimiento = fechaNacimiento;
        }
        this.especie = especie;
    }

    //Se agrega el tratamiento al ArayList historial
    public void agregarTratamiento(String descripcion) {

        historial.add(new Tratamiento(LocalDate.now(), descripcion));
    }
    //Metodo para pasar el ArrayList "Historial" a un fichero

    public void imprimirHistorrialArchivo(String nombreArchivo) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo));
            writer.println("Historial de tratamientos para " + nombre + " (" + especie + "):");

            for (Tratamiento tratamiento : historial) {
                writer.println("Fecha: " + tratamiento.getFecha() + ", Descripción: " + tratamiento.getDescripcion());

            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo " + nombreArchivo);
        }
    }
    
    public void Historial() {
        for (Tratamiento tratamiento : historial) {
            System.out.println("Fecha: " + tratamiento.getFecha() + ", Descripción: " + tratamiento.getDescripcion());

        }
    }


    @Override
    public String toString() {
        return "id: " + id + ", nombre: " + nombre;
    }

  
}

