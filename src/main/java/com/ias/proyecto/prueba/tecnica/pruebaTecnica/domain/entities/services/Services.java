package com.ias.proyecto.prueba.tecnica.pruebaTecnica.domain.entities.services;

import com.ias.proyecto.prueba.tecnica.pruebaTecnica.domain.entities.technician.Technician;
import lombok.Data;

import java.util.Date;

@Data
public class Services {

    private Integer id;
    private String direccion;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaFin;
    private Technician tecnicoAsignado;
}
