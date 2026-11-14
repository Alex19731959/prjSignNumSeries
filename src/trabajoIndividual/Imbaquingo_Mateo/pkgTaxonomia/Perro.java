package Taxonomia;

public class Perro extends Vertebrado {
    protected String raza;
    protected String colorPelaje;

    public Perro() {
        this("Perro", "Mamífero", "Terrestre", 3, true,
             "Heterótrofa", 38.5, true, "Caminar", "Terrestre", 3,
             "Interno", 33, "Pulmonar", false, "Mestiza", "Marrón");
    }

    public Perro(String nombre, String clasificacion, String habitat,
                 int edad, boolean estadoVital, String tipoNutricion,
                 double temperatura, boolean esVertebrado,
                 String tipoDesplazamiento, String ecosistema,
                 int nivelAlimenticio, String tipoEsqueleto,
                 int cantidadVertebras, String tipoRespiracion,
                 boolean temperaturaCorporalVariable,
                 String raza, String colorPelaje) {
        super(nombre, clasificacion, habitat, edad, estadoVital,
              tipoNutricion, temperatura, esVertebrado,
              tipoDesplazamiento, ecosistema, nivelAlimenticio,
              tipoEsqueleto, cantidadVertebras, tipoRespiracion,
              temperaturaCorporalVariable);
        this.raza = raza;
        this.colorPelaje = colorPelaje;
    }

    public void ladrar() {
        System.out.println(nombre + " está ladrando.");
    }

    public void jugar() {
        System.out.println(nombre + " está jugando.");
    }
}
