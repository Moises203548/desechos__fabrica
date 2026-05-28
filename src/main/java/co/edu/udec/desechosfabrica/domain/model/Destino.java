package co.edu.udec.desechosfabrica.domain.model;

import co.edu.udec.desechosfabrica.domain.enums.TipoDestino;
import co.edu.udec.desechosfabrica.domain.enums.TipoResiduo;

public class Destino {

    private final int idDestino;
    private String nombre;
    private TipoDestino tipoDestino;
    private String ciudad;

    public Destino(int idDestino, String nombre, TipoDestino tipoDestino, String ciudad) {

        if (nombre == null || nombre.isBlank())
            throw new IllegalArgumentException("El nombre del destino no puede estar vacio");
        if (tipoDestino == null)
            throw new IllegalArgumentException("El tipo de destino no puede ser nulo");
        if (ciudad == null || ciudad.isBlank())
            throw new IllegalArgumentException("La ciudad no puede estar vacia");

        this.idDestino = idDestino;
        this.nombre = nombre;
        this.tipoDestino = tipoDestino;
        this.ciudad = ciudad;
    }
    public int getIdDestino() {
        return idDestino;
    }
    public String getNombre() {
        return nombre;
    }
    public TipoDestino getTipoDestino() {
        return tipoDestino;
    }
    public String getCiudad() {
        return ciudad;
    }
}

