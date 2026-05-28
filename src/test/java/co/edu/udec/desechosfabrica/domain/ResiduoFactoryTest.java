package co.edu.udec.desechosfabrica.domain;

import co.edu.udec.desechosfabrica.domain.enums.TipoResiduo;
import co.edu.udec.desechosfabrica.domain.exceptions.ResiduoException;
import co.edu.udec.desechosfabrica.domain.factory.ResiduoFactory;
import co.edu.udec.desechosfabrica.domain.model.Residuo;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import java.time.LocalDate;

class ResiduoFactoryTest {

    @Test
    void debeCrearResiduoConFactory() {
        Residuo residuo = ResiduoFactory.crear(TipoResiduo.QUIMICO, true, 10.5, LocalDate.now(), 1);
        assertThat(residuo).isNotNull();
        assertThat(residuo.getTipoResiduo()).isEqualTo(TipoResiduo.QUIMICO);
        assertThat(residuo.isPeligroso()).isTrue();
    }

    @Test
    void debeFallarConPesoInvalidoEnFactory() {
        assertThatThrownBy(() -> ResiduoFactory.crear(
                TipoResiduo.QUIMICO, true,
                -1, LocalDate.now(), 1))
                .isInstanceOf(ResiduoException.class)
                .hasMessageContaining("El peso debe ser mayor a 0");
    }

    @Test
    void debeFallarConTipoNuloEnFactory() {
        assertThatThrownBy(() -> ResiduoFactory.crear(
                null, true,
                10.5, LocalDate.now(), 1))
                .isInstanceOf(ResiduoException.class)
                .hasMessageContaining("El tipo de residuo no puede ser nulo");
    }
}
