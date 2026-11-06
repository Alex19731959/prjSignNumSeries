package trabajoIndividual.olalla_alexandra.pkgreinoanimal;

public class Colibri extends Vertebrados {
    public String pico;
    public int alas;

    public Colibri() { this("ave"); }
    public Colibri(String clasificacion) { super("colibrí", clasificacion); }

    public void volar() { System.out.println(nombre + " vuela"); }
}