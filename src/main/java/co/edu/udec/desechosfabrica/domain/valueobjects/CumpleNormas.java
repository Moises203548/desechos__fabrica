package co.edu.udec.desechosfabrica.domain.valueobjects;

public record CumpleNormas(Double valor) {
        public CumpleNormas {
            if (valor < 0)
                throw new IllegalArgumentException("El cumplimiento de normas no puede ser negativo");
            if (valor > 100)
                throw new IllegalArgumentException("El cumplimiento de normas no puede ser mayor a 100");
        }
}
