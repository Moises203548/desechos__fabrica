package co.edu.udec.desechosfabrica.domain;
import co.edu.udec.desechosfabrica.domain.enums.TipoResiduo;
import co.edu.udec.desechosfabrica.domain.exceptions.ResiduoException;
import co.edu.udec.desechosfabrica.domain.model.Residuo;
import co.edu.udec.desechosfabrica.domain.valueobjects.PesoKg;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import java.time.LocalDate;

    class ResiduoTest {

        @Test
        void debeCrearResiduoValido() {

            PesoKg peso = new PesoKg(10.5);

            Residuo residuo = new Residuo(1, TipoResiduo.QUIMICO,true, peso, LocalDate.now(), 1);
            assertThat(residuo.getTipoResiduo()).isEqualTo(TipoResiduo.QUIMICO);
            assertThat(residuo.getPesoKg()).isEqualTo(peso);
            assertThat(residuo.isPeligroso()).isTrue();
        }

        @Test
        void debeFallarConPesoNulo() {
            assertThatThrownBy(() -> new Residuo(1, TipoResiduo.QUIMICO,
                    true, null, LocalDate.now(), 1))
                    .isInstanceOf(ResiduoException.class)
                    .hasMessageContaining("El peso no puede ser nulo");
        }

        @Test
        void debeFallarConTipoResiduoNulo() {
            PesoKg peso = new PesoKg(10.5);
            assertThatThrownBy(() -> new Residuo(1, null,
                    true, peso, LocalDate.now(), 1))
                    .isInstanceOf(ResiduoException.class)
                    .hasMessageContaining("El tipo de residuo no puede ser nulo");
        }
    }

