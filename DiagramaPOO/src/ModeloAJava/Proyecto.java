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
class Proyecto {
    private String nombreClave;
    private String denominacion;
    private Date fechaInicio;
    private Date fechaFin;
    private String estado;
    private Empresa empresa;
    private List<Empleado> listaDeEmpleados;
    private List<Tarea> listaDeTareas;
    private Promotor empleadoPromotor;
    
    public Proyecto (){
        
    }

    public Proyecto(String nombreClave, String denominacion, Date fechaInicio, Date fechaFin, String estado, Empresa empresa, List<Empleado> listaDeEmpleados, List<Tarea> listaDeTareas, Promotor empleadoPromotor) {
        this.nombreClave = nombreClave;
        this.denominacion = denominacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.empresa = empresa;
        this.listaDeEmpleados = listaDeEmpleados;
        this.listaDeTareas = listaDeTareas;
        this.empleadoPromotor = empleadoPromotor;
    }
    
    
}
