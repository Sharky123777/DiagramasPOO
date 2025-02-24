/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloAJava;

import java.util.*;

/**
 *
 * @author gameV
 */
public class ManoDeObra {
    private Empleado trabajador;
    private Proyecto proyecto;
    private Date fechaInicio;
    private Date fechaFin;
    private String descripcion;
    
    public ManoDeObra (){
        
    }

    public ManoDeObra(Empleado trabajador, Proyecto proyecto, Date fechaInicio, Date fechaFin, String descripcion) {
        this.trabajador = trabajador;
        this.proyecto = proyecto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
    }
    
    
}
