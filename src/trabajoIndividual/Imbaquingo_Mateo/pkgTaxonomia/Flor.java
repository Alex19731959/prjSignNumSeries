package Taxonomia;

public class Flor extends Planta {
    protected String colorFlor;
    protected int cantidadPetalos;
    protected boolean tieneAroma;

    public Flor() {
        this("Flor", "Flor", "Terrestre", 1, true,
             "Autótrofa", true, true, "Principal", "Herbáceo",
             "Por semillas", 0.3, "Amarillo", 5, true);
    }

    public Flor(String nombre, String clasificacion, String habitat,
                int edad, boolean estadoVital, String tipoNutricion,
                boolean necesitaLuz, boolean tieneClorofila,
                String tipoRaiz, String tipoTallo, String tipoReproduccion,
                double altura, String colorFlor, int cantidadPetalos,
                boolean tieneAroma) {
        super(nombre, clasificacion, habitat, edad, estadoVital,
              tipoNutricion, necesitaLuz, tieneClorofila, tipoRaiz,
              tipoTallo, tipoReproduccion, altura);
        this.colorFlor = colorFlor;
        this.cantidadPetalos = cantidadPetalos;
        this.tieneAroma = tieneAroma;
    }

    public void florecer() {
        System.out.println(nombre + " está floreciendo.");
    }

    public void atraerPolinizadores() {
        System.out.println(nombre + " atrae polinizadores.");
    }

    public void producirFrutos() {
        System.out.println(nombre + " produce frutos.");
    }
}
