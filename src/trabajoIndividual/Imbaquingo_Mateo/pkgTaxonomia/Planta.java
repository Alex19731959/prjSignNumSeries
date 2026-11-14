package Taxonomia;

public class Planta extends ReinoVegetal {
    protected String tipoRaiz;
    protected String tipoTallo;
    protected String tipoReproduccion;
    protected double altura;

    public Planta() {
        this("Planta", "Planta", "Terrestre", 1, true,
             "Autótrofa", true, true, "Principal", "Leñoso",
             "Por semillas", 1.0);
    }

    public Planta(String nombre, String clasificacion, String habitat,
                  int edad, boolean estadoVital, String tipoNutricion,
                  boolean necesitaLuz, boolean tieneClorofila,
                  String tipoRaiz, String tipoTallo,
                  String tipoReproduccion, double altura) {
        super(nombre, clasificacion, habitat, edad, estadoVital,
              tipoNutricion, necesitaLuz, tieneClorofila);
        this.tipoRaiz = tipoRaiz;
        this.tipoTallo = tipoTallo;
        this.tipoReproduccion = tipoReproduccion;
        this.altura = altura;
    }

    public void absorberAgua() {
        System.out.println(nombre + " absorbe agua.");
    }

    public void transportarSavia() {
        System.out.println(nombre + " transporta savia.");
    }

    public void producirSemillas() {
        System.out.println(nombre + " produce semillas.");
    }
}
