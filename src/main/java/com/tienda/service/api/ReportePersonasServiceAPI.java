/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service.api;

import com.tienda.model.ReportePersonasDTO;
import java.util.Map;

public interface ReportePersonasServiceAPI {
    
   ReportePersonasDTO obtenerReporte(Map<String, Object>params);
}
