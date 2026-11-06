package trabajoIndividual.redrovan_marcell.pkganimaland;

public class Aguila extends Vertebrados {
    private float envergaduraAlas;
    private int velocidadVuelo;

    public Aguila(String nombre, String habitat, int edadPromedio, String tipoDesplazamiento, boolean esCarnivoro, boolean columnaVertebral, int extremidades, String temperaturaCorporal, float envergaduraAlas, int velocidadVuelo) {
        super(nombre, habitat, edadPromedio, tipoDesplazamiento, esCarnivoro, columnaVertebral, extremidades, temperaturaCorporal);
        this.envergaduraAlas = envergaduraAlas;
        this.velocidadVuelo = velocidadVuelo;
    }

    public void volarAlto() { System.out.println(nombre + " vuela alto con una envergadura de " + envergaduraAlas + "m."); }
    public void cazarPresa() { System.out.println(nombre + " caza picando en vuelo a " + velocidadVuelo + " km/h."); }
}