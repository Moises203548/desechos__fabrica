package co.edu.udec.desechosfabrica.domain.strategy;

public class RiesgoQuimico  implements  RiesgoStrategy{
    @Override
    public double calcularRiesgo(double pesoKg) {
        return pesoKg * 3.5;
    }
}
