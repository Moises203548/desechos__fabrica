package co.edu.udec.desechosfabrica.domain.model;

public class Constituyente {
    private final int idConstituyente;
    private String nombre;
    private String formulaQuimica;
    private String clasePeligro;

    public Constituyente(int idConstituyente, String nombre,String formulaQuimica, String clasePeligro) {

        if (nombre == null || nombre.isBlank())
            throw new IllegalArgumentException("El nombre del constituyente no puede estar vacio");
        if (formulaQuimica == null || formulaQuimica.isBlank())
            throw new IllegalArgumentException("La fórmula química no puede estar vacia");
        if (clasePeligro == null || clasePeligro.isBlank())
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
    public String getFormulaQuimica() {
        return formulaQuimica;
    }
    public String getClasePeligro() {
        return clasePeligro;
    }
}
