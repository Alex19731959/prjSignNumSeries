package trabajoIndividual.olalla_alexandra.pkgreinoanimal;

public class Hierba extends Flora {
    private String talloFlexible;

    public Hierba() { this("Manzanilla"); }
    public Hierba(String clasificacion) { super("hierba", clasificacion); }

    public void polinizar() { System.out.println(nombre + " es polinizada por el viento"); }

}