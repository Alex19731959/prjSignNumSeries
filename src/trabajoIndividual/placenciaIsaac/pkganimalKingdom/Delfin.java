package trabajoIndividual.placenciaIsaac.pkganimalKingdom;

public class Delfin extends Vertebrados {


    public Delfin(String nombre, String clasificacion, int edadMaxima, Boolean esCarnivoro, Boolean Huesos, Integer numeroHuesos, Boolean esMamifero) {
        super(nombre, clasificacion, edadMaxima, esCarnivoro, Huesos, numeroHuesos);
    }

    @Override 
    public void mover(String nombre) {
        System.out.println(nombre + " está nadando como cualquier delfín.");
    }

}
