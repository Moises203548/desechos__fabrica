package co.edu.udec.desechosfabrica.domain.valueobjects;

public record CapacidadEnvase(Double valor) {
    public CapacidadEnvase {
        if (valor <= 0)
            throw new IllegalArgumentException("La capacidad del envase debe ser mayor a 0");
    }
}
