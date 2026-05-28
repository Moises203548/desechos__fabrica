package co.edu.udec.desechosfabrica.domain;

import co.edu.udec.desechosfabrica.domain.valueobjects.PesoKg;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PesoKgTest {

    @Test
    void debeCrearPesoValido() {
        PesoKg peso = new PesoKg(10.5);
        assertThat(peso.valor()).isEqualTo(10.5);
    }

    @Test
    void debeFallarConPesoCero() {
        assertThatThrownBy(() -> new PesoKg(0.0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("El peso debe ser mayor a 0");
    }

    @Test
    void debeFallarConPesoNegativo() {
        assertThatThrownBy(() -> new PesoKg(-5.0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("El peso debe ser mayor a 0");
    }
}