package co.edu.udec.desechosfabrica.domain.valueobjects;

public record PesoKg(Double valor) {
    public PesoKg {
        if (valor <= 0)
            throw new IllegalArgumentException("El peso debe ser mayor a 0");
    }
}
