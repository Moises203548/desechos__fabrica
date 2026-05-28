package co.edu.udec.desechosfabrica.domain.model;

public class Destino {

    private final int idDestino;
    private String nombre;
    private String tipoDestino;
    private String ciudad;

    public Destino(int idDestino, String nombre, String tipoDestino, String ciudad) {

        if (nombre == null || nombre.isBlank())
            throw new IllegalArgumentException("El nombre del destino no puede estar vacio");
        if (tipoDestino == null || tipoDestino.isBlank())
            throw new IllegalArgumentException("El tipo de destino no puede estar vacio");
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
    public String getTipoDestino() {
        return tipoDestino;
    }
    public String getCiudad() {
        return ciudad;
    }
}

