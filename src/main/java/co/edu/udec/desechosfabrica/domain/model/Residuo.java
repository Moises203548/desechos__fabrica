package co.edu.udec.desechosfabrica.domain.model;
import co.edu.udec.desechosfabrica.domain.enums.TipoResiduo;
import co.edu.udec.desechosfabrica.domain.exceptions.ResiduoException;
import co.edu.udec.desechosfabrica.domain.valueobjects.PesoKg;

import java.time.LocalDate;

public class Residuo {

    private final int idResiduo;
    private TipoResiduo tipoResiduo;
    private boolean peligroso;
    private PesoKg pesoKg;
    private LocalDate fechaGeneracion;
    private int idProductor;

    public Residuo(int idResiduo, TipoResiduo tipoResiduo, boolean peligroso,PesoKg pesoKg, LocalDate fechaGeneracion, int idProductor) {

        if (tipoResiduo == null)
            throw new ResiduoException("El tipo de residuo no puede ser nulo");
        if (pesoKg == null)
            throw new ResiduoException("El peso no puede ser nulo");
        if (fechaGeneracion == null)
            throw new ResiduoException("La fecha de generación no puede ser nula");

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
    public TipoResiduo getTipoResiduo() {

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