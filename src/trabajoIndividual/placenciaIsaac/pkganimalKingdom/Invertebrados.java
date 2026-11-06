package trabajoIndividual.placenciaIsaac.pkganimalKingdom;

public class Invertebrados extends ReinoAnimal {

    protected Boolean seArrastra;

    public Invertebrados(String nombre, String clasificacion, int edadMaxima, Boolean esCarnivoro, Boolean seArrastra) {
        super(nombre, clasificacion, edadMaxima, esCarnivoro);
        this.seArrastra = seArrastra;
    }

    @Override 
    public void mover(String nombre) {
        System.out.println(nombre + " está arrastrándose como cualquier invertebrado.");
    }

}
