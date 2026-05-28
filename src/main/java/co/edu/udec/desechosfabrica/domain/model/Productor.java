package co.edu.udec.desechosfabrica.domain.model;

import co.edu.udec.desechosfabrica.domain.valueobjects.CumpleNormas;

public class Productor {
    private final int idProductor;
    private String nombre;
    private String tipoActividad;
    private String direccion;
    private CumpleNormas cumpleNormas;

    public Productor(int idProductor, String nombre, String tipoActividad, String direccion, CumpleNormas cumpleNormas) {

        if (nombre == null || nombre.isBlank())
            throw new IllegalArgumentException("El nombre del productor no puede estar vacio");
        if (tipoActividad == null || tipoActividad.isBlank())
            throw new IllegalArgumentException("El tipo de actividad no puede estar vacio");
        if (direccion == null || direccion.isBlank())
            throw new IllegalArgumentException("La dirección no puede estar vacia");
        if (cumpleNormas == null)
            throw new IllegalArgumentException("El cumplimiento de normas no puede ser nulo");


        this.idProductor = idProductor;
        this.nombre = nombre;
        this.tipoActividad = tipoActividad;
        this.direccion = direccion;
        this.cumpleNormas = cumpleNormas;
    }

    // Getters
    public int getIdProductor() {
        return idProductor;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTipoActividad() {
        return tipoActividad;
    }
    public String getDireccion() {
        return direccion;
    }
    public CumpleNormas getCumpleNormas() {
        return cumpleNormas;
    }
}
