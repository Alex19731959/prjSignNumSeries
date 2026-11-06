package trabajoIndividual.olalla_alexandra.pkgreinoanimal;

public class Hierba extends Flora {
    private String talloFlexible;

    public Hierba() { this("Mata"); }
    public Hierba(String clasificacion) { super("hierba", clasificacion); }

    @Override public void crecer() { System.out.println(nombre + " crece"); }

}