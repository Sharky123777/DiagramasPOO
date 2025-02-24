package ModeloAJava;

import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gameV
 */

class Tarea {
    private String descripcion;
    private String tipo;
    private Date fechaInicioEstimado;
    private Date fechaInicioReal;
    private int duracionEstimada;
    private int duracionReal;
    private List<Documento> listaDeDocumentos;
    
    public Tarea (){
        
    }

    public Tarea(String descripcion, String tipo, Date fechaInicioEstimado, Date fechaInicioReal, int duracionEstimada, int duracionReal, List<Documento> listaDeDocumentos) {
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.fechaInicioEstimado = fechaInicioEstimado;
        this.fechaInicioReal = fechaInicioReal;
        this.duracionEstimada = duracionEstimada;
        this.duracionReal = duracionReal;
        this.listaDeDocumentos = listaDeDocumentos;
    }
    
    
}
