package Taxonomia;

public class Mariposa extends Invertebrado {
    protected double colorAlas;
    protected String etapaVida;

    public Mariposa() {
        this("Mariposa", "Insecto", "Terrestre", 1, true,
             "Heterótrofa", 25.0, false, "Volar", "Terrestre", 2,
             6, true, 1.0, "Adulta");
    }

    public Mariposa(String nombre, String clasificacion, String habitat,
                    int edad, boolean estadoVital, String tipoNutricion,
                    double temperatura, boolean esVertebrado,
                    String tipoDesplazamiento, String ecosistema,
                    int nivelAlimenticio, int cantidadPatas,
                    boolean tieneExoesqueleto, double colorAlas,
                    String etapaVida) {
        super(nombre, clasificacion, habitat, edad, estadoVital,
              tipoNutricion, temperatura, esVertebrado,
              tipoDesplazamiento, ecosistema, nivelAlimenticio,
              cantidadPatas, tieneExoesqueleto);
        this.colorAlas = colorAlas;
        this.etapaVida = etapaVida;
    }

    public void volar() {
        System.out.println(nombre + " está volando.");
    }

    public void polinizar() {
        System.out.println(nombre + " está polinizando.");
    }

    public void realizarMetamorfosis() {
        System.out.println(nombre + " realiza su metamorfosis.");
    }
}
