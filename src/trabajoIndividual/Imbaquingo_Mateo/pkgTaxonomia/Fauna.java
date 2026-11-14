package Taxonomia;

public class Fauna extends ReinoAnimal {
    protected String tipoDesplazamiento;
    protected String ecosistema;
    protected int nivelAlimenticio;

    public Fauna() {
        this("Animal", "Fauna", "Natural", 1, true,
             "Heterótrofa", 36.5, false, "Variable",
             "Terrestre", 2);
    }

    public Fauna(String nombre, String clasificacion, String habitat,
                 int edad, boolean estadoVital, String tipoNutricion,
                 double temperatura, boolean esVertebrado,
                 String tipoDesplazamiento, String ecosistema,
                 int nivelAlimenticio) {
        super(nombre, clasificacion, habitat, edad, estadoVital,
              tipoNutricion, temperatura, esVertebrado);
        this.tipoDesplazamiento = tipoDesplazamiento;
        this.ecosistema = ecosistema;
        this.nivelAlimenticio = nivelAlimenticio;
    }

    public void desplazarse() {
        System.out.println(nombre + " se está desplazando.");
    }

    public void buscarRefugio() {
        System.out.println(nombre + " está buscando refugio.");
    }

    public void interactuarEcosistema() {
        System.out.println(nombre + " interactúa con su ecosistema.");
    }
}

