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
class PlanDeTrabajo {
    private Tarea tarea;
    private Empleado trabajador;
    private Date fechaInicio;
    private Date fechaFin;
    private String descripcion;
    
    public PlanDeTrabajo (){
        
    }

    public PlanDeTrabajo(Tarea tarea, Empleado trabajador, Date fechaInicio, Date fechaFin, String descripcion) {
        this.tarea = tarea;
        this.trabajador = trabajador;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
    }
    
    
}
