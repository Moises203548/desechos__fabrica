package co.edu.udec.desechosfabrica.domain.model;

import co.edu.udec.desechosfabrica.domain.valueobjects.CapacidadEnvase;

public class Envase {
    private final int idEnvase;
    private String material;
    private boolean homologado;
    private String tipo;
    private CapacidadEnvase capacidad;

    public Envase(int idEnvase, String material, boolean homologado,String tipo, CapacidadEnvase capacidad) {

        if (material == null || material.isBlank())
            throw new IllegalArgumentException("El material del envase no puede estar vacio");
        if (tipo == null || tipo.isBlank())
            throw new IllegalArgumentException("El tipo de envase no puede estar vacio");
        if (capacidad == null)
            throw new IllegalArgumentException("La capacidad no puede ser nula");

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
    public CapacidadEnvase getCapacidad() {
        return capacidad;
    }

    }
