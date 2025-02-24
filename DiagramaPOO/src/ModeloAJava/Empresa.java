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
public class Empresa {
    private String nit;
    private String nombre;
    private String tipo;
    private String web;
    private int telefono;
    private String email;
    private String direccion;
    private List<Empleado> listaDeEmpleados;
    private List<Proyecto> listaDeProyectos;
    
    public Empresa (){
        
    }

    public Empresa(String nit, String nombre, String tipo, String web, int telefono, String email, String direccion, List<Empleado> listaDeEmpleados, List<Proyecto> listaDeProyectos) {
        this.nit = nit;
        this.nombre = nombre;
        this.tipo = tipo;
        this.web = web;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.listaDeEmpleados = listaDeEmpleados;
        this.listaDeProyectos = listaDeProyectos;
    }
    
    
}
