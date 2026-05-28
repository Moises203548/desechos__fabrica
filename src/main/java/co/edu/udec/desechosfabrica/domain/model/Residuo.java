package co.edu.udec.desechosfabrica.domain.model;
import co.edu.udec.desechosfabrica.domain.valueobjects.PesoKg;

import java.time.LocalDate;

public class Residuo {

    private final int idResiduo;
    private String tipoResiduo;
    private boolean peligroso;
    private PesoKg pesoKg;
    private LocalDate fechaGeneracion;
    private int idProductor;

    public Residuo(int idResiduo, String tipoResiduo, boolean peligroso,PesoKg pesoKg, LocalDate fechaGeneracion, int idProductor) {

        if (tipoResiduo == null || tipoResiduo.isBlank())
            throw new IllegalArgumentException("El tipo de residuo no puede estar vacío");
        if (pesoKg == null)
            throw new IllegalArgumentException("El peso no puede ser nulo");
        if (fechaGeneracion == null)
            throw new IllegalArgumentException("La fecha de generación no puede ser nula");

        this.idResiduo = idResiduo;
        this.tipoResiduo = tipoResiduo;
        this.peligroso = peligroso;
        this.pesoKg = pesoKg;
        this.fechaGeneracion = fechaGeneracion;
        this.idProductor = idProductor;
    }


    public int getIdResiduo() {

        return idResiduo;
    }
    public String getTipoResiduo() {

        return tipoResiduo;
    }
    public boolean isPeligroso() {

        return peligroso;
    }
    public PesoKg getPesoKg() {

        return pesoKg;
    }
    public LocalDate getFechaGeneracion() {

        return fechaGeneracion;
    }
    public int getIdProductor() {

        return idProductor;
    }
}