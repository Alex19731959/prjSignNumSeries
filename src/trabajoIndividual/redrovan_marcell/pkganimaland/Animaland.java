package trabajoIndividual.redrovan_marcell.pkganimaland;

public class Animaland {
    protected String nombre;
    protected String habitat;
    protected int edadPromedio;

    public Animaland(String nombre, String habitat, int edadPromedio) {
        this.nombre = nombre;
        this.habitat = habitat;
        this.edadPromedio = edadPromedio;
    }

    public void nacer() { System.out.println(nombre + " ha nacido."); }
    public void crecer() { System.out.println(nombre + " está creciendo."); }
    public void reproducirse() { System.out.println(nombre + " se está reproduciendo."); }
}

