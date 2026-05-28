package co.edu.udec.desechosfabrica.domain.factory;

import co.edu.udec.desechosfabrica.domain.enums.TipoResiduo;
import co.edu.udec.desechosfabrica.domain.exceptions.ResiduoException;
import co.edu.udec.desechosfabrica.domain.model.Residuo;
import co.edu.udec.desechosfabrica.domain.valueobjects.PesoKg;

import java.time.LocalDate;

public class ResiduoFactory {
    private static int contadorId = 0;

    public static Residuo crear(TipoResiduo tipoResiduo, boolean peligroso, double pesoKg, LocalDate fechaGeneracion, int idProductor) {

        if (tipoResiduo == null)
            throw new ResiduoException("El tipo de residuo no puede ser nulo");
        if (pesoKg <= 0)
            throw new ResiduoException("El peso debe ser mayor a 0");
        if (fechaGeneracion == null)
            throw new ResiduoException("La fecha no puede ser nula");

        contadorId++;
        PesoKg peso = new PesoKg(pesoKg);

        return new Residuo(contadorId, tipoResiduo, peligroso,peso, fechaGeneracion, idProductor);
    }
}
