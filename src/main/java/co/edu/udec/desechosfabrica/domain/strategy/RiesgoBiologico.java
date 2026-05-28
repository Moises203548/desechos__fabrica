package co.edu.udec.desechosfabrica.domain.strategy;

public class RiesgoBiologico implements RiesgoStrategy{
    @Override
    public double calcularRiesgo(double pesoKg) {
        return pesoKg * 2.8;
    }
}
