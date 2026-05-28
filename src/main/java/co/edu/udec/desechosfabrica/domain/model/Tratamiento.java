package co.edu.udec.desechosfabrica.domain.model;
import java.time.LocalDate;

public class Tratamiento {
    private final int idTratamiento;
    private String tipoTratamiento;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String resultado;
    private int idResiduo;

    public Tratamiento(int idTratamiento, String tipoTratamiento, LocalDate fechaInicio, LocalDate fechaFin, String resultado, int idResiduo) {
        if (tipoTratamiento == null || tipoTratamiento.isBlank())
            throw new IllegalArgumentException("El tipo de tratamiento no puede estar vacio");
        if (fechaInicio == null)
            throw new IllegalArgumentException("La fecha de inicio no puede ser nula");
        if (fechaFin == null)
            throw new IllegalArgumentException("La fecha de fin no puede ser nula");
        if (fechaFin.isBefore(fechaInicio))
            throw new IllegalArgumentException("La fecha de fin no puede ser antes de la fecha de inicio");
        if (resultado == null || resultado.isBlank())
            throw new IllegalArgumentException("El resultado no puede estar vacio");

        this.idTratamiento = idTratamiento;
        this.tipoTratamiento = tipoTratamiento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.resultado = resultado;
        this.idResiduo = idResiduo;
    }
    public int getIdTratamiento() {
        return idTratamiento;
    }
    public String getTipoTratamiento() {
        return tipoTratamiento;
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public LocalDate getFechaFin() {
        return fechaFin;
    }
    public String getResultado() {
        return resultado;
    }
    public int getIdResiduo() {
        return idResiduo;
    }
}
