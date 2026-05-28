package co.edu.udec.desechosfabrica.domain.strategy;

public class RiesgoRadioactivo implements RiesgoStrategy {
    @Override
    public double calcularRiesgo(double pesoKg) {
        return pesoKg * 7.5;
    }

}
