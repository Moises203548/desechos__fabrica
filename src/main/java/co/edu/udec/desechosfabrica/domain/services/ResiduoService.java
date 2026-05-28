package co.edu.udec.desechosfabrica.domain.services;


import co.edu.udec.desechosfabrica.domain.exceptions.ResiduoException;
import co.edu.udec.desechosfabrica.domain.model.Destino;
import co.edu.udec.desechosfabrica.domain.model.Residuo;
import co.edu.udec.desechosfabrica.domain.model.Transportista;

public class ResiduoService {
    public boolean validarTraslado(Residuo residuo, Transportista transportista, Destino destino) {

        if (residuo == null)
            throw new ResiduoException("El residuo no puede ser nulo");
        if (transportista == null)
            throw new ResiduoException("El transportista no puede ser nulo");
        if (destino == null)
            throw new ResiduoException("El destino no puede ser nulo");

        return true;
    }
}
