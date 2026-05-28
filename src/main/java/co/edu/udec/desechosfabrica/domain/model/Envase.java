package co.edu.udec.desechosfabrica.domain.model;

public class Envase {
    private final int idEnvase;
    private String material;
    private boolean homologado;
    private String tipo;
    private double capacidad;

    public Envase(int idEnvase, String material, boolean homologado,String tipo, double capacidad) {

        if (material == null || material.isBlank())
            throw new IllegalArgumentException("El material del envase no puede estar vacío");
        if (tipo == null || tipo.isBlank())
            throw new IllegalArgumentException("El tipo de envase no puede estar vacío");
        if (capacidad <= 0)
            throw new IllegalArgumentException("La capacidad debe ser mayor a 0");

        this.idEnvase = idEnvase;
        this.material = material;
        this.homologado = homologado;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }
    public int getIdEnvase() {
        return idEnvase;
    }
    public String getMaterial() {
        return material;
    }
    public boolean isHomologado() {
        return homologado;
    }
    public String getTipo() {
        return tipo;
    }
    public double getCapacidad() {
        return capacidad;
    }

    }
