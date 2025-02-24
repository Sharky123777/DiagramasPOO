/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloAJava;

/**
 *
 * @author gameV
 */
public class Documento {
    private String codigo;
    private String descripcion;
    private String tipo;
    private Tarea tarea;
    
    public Documento (){
        
    }

    public Documento(String codigo, String descripcion, String tipo, Tarea tarea) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.tarea = tarea;
    }
    
    
    
    
}
