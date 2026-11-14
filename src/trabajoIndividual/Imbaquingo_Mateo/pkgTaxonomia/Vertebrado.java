package Taxonomia;

public class Vertebrado extends Fauna {
    protected String tipoEsqueleto;
    protected int cantidadVertebras;
    protected String tipoRespiracion;
    protected boolean temperaturaCorporalVariable;

    public Vertebrado() {
        this("Vertebrado", "Vertebrado", "Natural", 1, true,
             "Heterótrofa", 36.5, true, "Caminar", "Terrestre", 2,
             "Interno", 33, "Pulmonar", false);
    }

    public Vertebrado(String nombre, String clasificacion, String habitat,
                      int edad, boolean estadoVital, String tipoNutricion,
                      double temperatura, boolean esVertebrado,
                      String tipoDesplazamiento, String ecosistema,
                      int nivelAlimenticio, String tipoEsqueleto,
                      int cantidadVertebras, String tipoRespiracion,
                      boolean temperaturaCorporalVariable) {
        super(nombre, clasificacion, habitat, edad, estadoVital,
              tipoNutricion, temperatura, esVertebrado,
              tipoDesplazamiento, ecosistema, nivelAlimenticio);
        this.tipoEsqueleto = tipoEsqueleto;
        this.cantidadVertebras = cantidadVertebras;
        this.tipoRespiracion = tipoRespiracion;
        this.temperaturaCorporalVariable = temperaturaCorporalVariable;
    }

    public void desarrollarEsqueleto() {
        System.out.println(nombre + " desarrolla su esqueleto.");
    }

    public void protegerOrganos() {
        System.out.println(nombre + " protege sus órganos.");
    }

    public void regularTemperatura() {
        System.out.println(nombre + " regula su temperatura corporal.");
    }
}