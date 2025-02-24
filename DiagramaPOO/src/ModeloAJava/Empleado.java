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
public class Empleado {


    protected String dni;
    protected String nombre;
    protected String apellidos;
    protected String direccion;
    protected String telefono;
    protected String email;
    protected String fechaContrato;
    protected Empresa empresa;
    protected List<Tarea> listaDeTareas;
    
    public Empleado (){
    
    }
    
        public Empleado(String dni, String nombre, String apellidos, String direccion, String telefono, String email, String fechaContrato, Empresa empresa, List<Tarea> listaDeTareas) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.fechaContrato = fechaContrato;
        this.empresa = empresa;
        this.listaDeTareas = listaDeTareas;
        
    }
}