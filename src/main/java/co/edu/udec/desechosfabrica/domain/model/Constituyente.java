package co.edu.udec.desechosfabrica.domain.model;

import co.edu.udec.desechosfabrica.domain.valueobjects.ClasePeligro;
import co.edu.udec.desechosfabrica.domain.valueobjects.FormulaQuimica;

public class Constituyente {
    private final int idConstituyente;
    private String nombre;
    private FormulaQuimica formulaQuimica;
    private ClasePeligro clasePeligro;

    public Constituyente(int idConstituyente, String nombre,FormulaQuimica formulaQuimica, ClasePeligro clasePeligro) {

        if (nombre == null || nombre.isBlank())
            throw new IllegalArgumentException("El nombre del constituyente no puede estar vacio");
        if (formulaQuimica == null)
            throw new IllegalArgumentException("La fórmula química no puede estar vacia");
        if (clasePeligro == null)
            throw new IllegalArgumentException("La clase de peligro no puede estar vacia");

        this.idConstituyente = idConstituyente;
        this.nombre = nombre;
        this.formulaQuimica = formulaQuimica;
        this.clasePeligro = clasePeligro;
    }
    public int getIdConstituyente() {
        return idConstituyente;
    }
    public String getNombre() {
        return nombre;
    }
    public FormulaQuimica getFormulaQuimica() {

        return formulaQuimica;
    }
    public ClasePeligro getClasePeligro() {

        return clasePeligro;
    }
}
