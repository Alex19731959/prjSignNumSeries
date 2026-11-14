package Taxonomia;

public class ReinoAnimal extends SerVivo {
    protected String tipoNutricion;
    protected double temperatura;
    protected boolean esVertebrado;

    public ReinoAnimal() {
        this("Sin nombre", "Reino animal", "Sin hábitat", 0, true,
             "Heterótrofa", 36.5, false);
    }

    public ReinoAnimal(String nombre, String clasificacion, String habitat,
                       int edad, boolean estadoVital, String tipoNutricion,
                       double temperatura, boolean esVertebrado) {
        super(nombre, clasificacion, habitat, edad, estadoVital);
        this.tipoNutricion = tipoNutricion;
        this.temperatura = temperatura;
        this.esVertebrado = esVertebrado;
    }

    public void alimentarse() {
        System.out.println(nombre + " se está alimentando.");
    }

    public void buscarAlimento() {
        System.out.println(nombre + " está buscando alimento.");
    }
}

