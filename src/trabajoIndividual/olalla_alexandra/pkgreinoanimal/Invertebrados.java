package trabajoIndividual.olalla_alexandra.pkgreinoanimal;

public class Invertebrados extends Fauna {
    protected String tipoDeSoporte;

    public Invertebrados() { this("animal", "invertebrado"); }
    public Invertebrados(String nombre, String clasificacion) { super(nombre, clasificacion); }

    @Override public void moverse() { System.out.println(nombre + " se mueve sin columna vertebral"); }
}