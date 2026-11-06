package trabajoIndividual.olalla_alexandra.pkgreinoanimal;

public class Flor extends Flora {

    public int petalos;
    private String aroma;

    public Flor() { this("orquídea", "angiosperma"); }
    public Flor(String nombre, String clasificacion) { super(nombre, clasificacion); }

    public void florecer() { System.out.println(nombre + " florece"); }
    public void polinizar() { System.out.println(nombre + " es polinizada"); }
}


