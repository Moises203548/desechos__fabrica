package co.edu.udec.desechosfabrica.domain.model;

import co.edu.udec.desechosfabrica.domain.enums.EstadoTraslado;

import java.time.LocalDate;

public class Traslado {

    private final int idTraslado;
    private double cantidadTrasladada;
    private int idDestino;
    private LocalDate fechaInicio;
    private int idEnvase;
    private LocalDate fechaLlegada;
    private int idResiduo;
    private String tipoTraslado;
    private EstadoTraslado estadoTraslado;

    public Traslado(int idTraslado, double cantidadTrasladada, int idDestino, LocalDate fechaInicio, int idEnvase, LocalDate fechaLlegada, int idResiduo, String tipoTraslado, EstadoTraslado estadoTraslado) {

        if (cantidadTrasladada <= 0)
            throw new IllegalArgumentException("La cantidad trasladada debe ser mayor a 0");
        if (fechaInicio == null)
            throw new IllegalArgumentException("La fecha de inicio no puede ser nula");
        if (fechaLlegada == null)
            throw new IllegalArgumentException("La fecha de llegada no puede ser nula");
        if (fechaLlegada.isBefore(fechaInicio))
            throw new IllegalArgumentException("La fecha de llegada no puede ser antes de la fecha de inicio");
        if (tipoTraslado == null || tipoTraslado.isBlank())
            throw new IllegalArgumentException("El tipo de traslado no puede estar vacio");
        if (estadoTraslado == null)
            throw new IllegalArgumentException("El estado del traslado no puede se nulo");

        this.idTraslado = idTraslado;
        this.cantidadTrasladada = cantidadTrasladada;
        this.idDestino = idDestino;
        this.fechaInicio = fechaInicio;
        this.idEnvase = idEnvase;
        this.fechaLlegada = fechaLlegada;
        this.idResiduo = idResiduo;
        this.tipoTraslado = tipoTraslado;
        this.estadoTraslado = estadoTraslado;
    }


    public int getIdTraslado() {
        return idTraslado;
    }
    public double getCantidadTrasladada() {
        return cantidadTrasladada;
    }
    public int getIdDestino() {
        return idDestino;
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public int getIdEnvase() {
        return idEnvase;
    }
    public LocalDate getFechaLlegada() {
        return fechaLlegada;
    }
    public int getIdResiduo() {
        return idResiduo;
    }
    public String getTipoTraslado() {
        return tipoTraslado;
    }
    public EstadoTraslado getEstadoTraslado() {
        return estadoTraslado;
    }
}