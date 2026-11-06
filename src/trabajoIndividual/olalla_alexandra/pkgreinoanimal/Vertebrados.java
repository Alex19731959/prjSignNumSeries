package trabajoIndividual.olalla_alexandra.pkgreinoanimal;

public class Vertebrados extends Fauna {
    protected boolean craneo;
    protected boolean columnaVertebral;
    protected int ojos;

    public Vertebrados() { this("animal", "vertebrado"); }
    public Vertebrados(String nombre, String clasificacion) { super(nombre, clasificacion); }

    @Override public void moverse() { System.out.println(nombre + " se mueve usando su esqueleto y músculos"); }
}