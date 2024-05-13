package Veterinaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.io.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
class Mamifero extends Mascota implements Vacunable {

    private LocalDate fechaVacunacion;
    private boolean estaVacunado;

    public Mamifero(int id, Cliente duenyo, String nombre, LocalDate fechaNacimiento, String especie) {
        super(id, duenyo, nombre, fechaNacimiento, especie);
    }

    public void vacunar(LocalDate fecha) {
        this.estaVacunado = true;
        this.fechaVacunacion = fecha;
    }

    public boolean getEstaVacunado() {
        return estaVacunado;
    }

    @Override
    public String toString() {
        return super.toString()+", esta vacunadx: "+estaVacunado;
    }
    

}
