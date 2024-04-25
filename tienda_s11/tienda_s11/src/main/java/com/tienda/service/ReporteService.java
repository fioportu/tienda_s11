/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;


import java.io.IOException;
import java.util.Map;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author portu
 */
public interface ReporteService {
    
    public ResponseEntity<Resource>
            generaReporte(String reporte, // El nombre del archivo jasper que esta dentro 
                    Map<String, Object>parametros, // Obtiene los parametros del reporte
                    String tipo)throws IOException; //El tipo de reporte que vamos a descargar en la aplicacion, pdf, excel...
}
