package co.edu.udec.desechosfabrica.domain.model;

public class Transportista {
    private final int idTransportista;
    private String nombre;
    private String ciudad;

    public Transportista(int idTransportista, String nombre, String ciudad) {

        if (nombre == null || nombre.isBlank())
            throw new IllegalArgumentException("El nombre del transportista no puede estar vacio");
        if (ciudad == null || ciudad.isBlank())
            throw new IllegalArgumentException("La ciudad no puede estar vacia");

        this.idTransportista = idTransportista;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
    public int getIdTransportista() {
        return idTransportista;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCiudad() {
        return ciudad;
    }
}
