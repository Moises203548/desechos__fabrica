package co.edu.udec.desechosfabrica.domain.valueobjects;

public record FormulaQuimica(String valor) {
    public FormulaQuimica{
        if (valor == null || valor.isBlank())
            throw new IllegalArgumentException("La formula química no puede estar vacia");
        if (valor.length() > 100)
            throw new IllegalArgumentException("La formula química es demasiado larga");
    }
    }


