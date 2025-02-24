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
class Version {
    private Date fecha;
    private String descripcion;
    private String archivo;
    private List<Version> listaDeVersiones;
    private Documento documento;
    
    public Version (){
        
    }

    public Version(Date fecha, String descripcion, String archivo, List<Version> listaDeVersiones, Documento documento) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.archivo = archivo;
        this.listaDeVersiones = listaDeVersiones;
        this.documento = documento;
    }
    
    
    
    
}

