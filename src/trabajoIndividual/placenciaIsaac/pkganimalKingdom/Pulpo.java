package trabajoIndividual.placenciaIsaac.pkganimalKingdom;

public class Pulpo extends Invertebrados {

    public Pulpo(String nombre, String clasificacion, int edadMaxima, Boolean esCarnivoro, Boolean seArrastra) {
        super(nombre, clasificacion, edadMaxima, esCarnivoro, seArrastra);
    }

    @Override 
    public void mover(String nombre) {
        System.out.println(nombre + " está nadando como cualquier pulpo.");
    }

}
