package co.edu.udec.desechosfabrica.domain.valueobjects;

public record ClasePeligro(String valor) {
    public ClasePeligro {
        if (valor == null || valor.isBlank())
            throw new IllegalArgumentException("La clase de peligro no puede estar vacia");
        if (valor.length() > 80)
            throw new IllegalArgumentException("La clase de peligro es demasiado larga");
    }
}
