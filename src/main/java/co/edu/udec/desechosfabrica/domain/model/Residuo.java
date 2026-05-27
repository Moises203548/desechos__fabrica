package co.edu.udec.desechosfabrica.domain.model;
import java.time.LocalDate;

public class Residuo {

    private final int idResiduo;
    private String tipoResiduo;
    private boolean peligroso;
    private double pesoKg;
    private LocalDate fechaGeneracion;
    private int idProductor;

    public Residuo(int idResiduo, String tipoResiduo, boolean peligroso,
                   double pesoKg, LocalDate fechaGeneracion, int idProductor) {

        if (tipoResiduo == null || tipoResiduo.isBlank())
            throw new IllegalArgumentException("El tipo de residuo no puede estar vacío");
        if (pesoKg <= 0)
            throw new IllegalArgumentException("El peso debe ser mayor a 0");
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
    public double getPesoKg() {
        return pesoKg;
    }
    public LocalDate getFechaGeneracion() {
        return fechaGeneracion;
    }
    public int getIdProductor() {
        return idProductor;
    }
}