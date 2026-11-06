package trabajoIndividual.olalla_alexandra.pkgreinoanimal;

public class Fauna extends ReinoAnimal {
    protected boolean boca;
    protected String piel;

    public Fauna() { this("animal", "fauna"); }
    public Fauna(String nombre, String clasificacion) { super(nombre, clasificacion); }

    public void moverse() { System.out.println(nombre + " se mueve"); }
    @Override public void alimentarse() { System.out.println(nombre + " come otros seres vivos"); }
}
