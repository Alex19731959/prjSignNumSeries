package trabajoIndividual.placenciaIsaac.pkganimalKingdom;

public class Girasol extends PlantasConFlor {

    protected String color;

    public Girasol(String nombre, String clasificacion, int edadMaxima, Integer numeroHojas, Integer numeroFlores) {
        super(nombre, clasificacion, edadMaxima, numeroHojas, numeroFlores);
        this.color = "amarillo";
    }

    @Override
    public void crecerFlores(String nombre) {
        System.out.println(nombre + " está creciendo flores amarillas como un girasol.");
    }

}
