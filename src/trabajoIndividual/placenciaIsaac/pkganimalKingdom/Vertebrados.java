package trabajoIndividual.placenciaIsaac.pkganimalKingdom;

public class Vertebrados extends ReinoAnimal {

    protected Boolean Huesos;
    protected Integer numeroHuesos;

    public Vertebrados(String nombre, String clasificacion, int edadMaxima, Boolean esCarnivoro, Boolean Huesos, Integer numeroHuesos) {
        super(nombre, clasificacion, edadMaxima, esCarnivoro);
        this.Huesos = Huesos;
        this.numeroHuesos = numeroHuesos;
    }

    @Override 
    public void mover(String nombre) {
        System.out.println(nombre + " está nadando como cualquier vertebrado acuático.");
    }

}
