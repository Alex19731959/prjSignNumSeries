package trabajoIndividual.placenciaIsaac.pkganimalKingdom;

public class ReinoAnimal extends SeresVivos {

    protected Boolean esCarnivoro;

    public ReinoAnimal(String nombre, String clasificacion, int edadMaxima, Boolean esCarnivoro) {
        super(nombre, clasificacion, edadMaxima);
        this.esCarnivoro = esCarnivoro;
    }

    public void mover(String nombre) {
        System.out.println(nombre + " se puede mover como cualquier animal.");
    }

    @Override 
    public void comer(String nombre) {
        System.out.println(nombre + " está comiendo como cualquier animal.");
    }


}
