package trabajoIndividual.placenciaIsaac.pkganimalKingdom;

public class PlantasConFlor extends ReinoPlantae {

    protected Integer numeroFlores;

    public PlantasConFlor(String nombre, String clasificacion, int edadMaxima, Integer numeroHojas, Integer numeroFlores) {
        super(nombre, clasificacion, edadMaxima, numeroHojas);
        this.numeroFlores = numeroFlores   ;
    }

    public void polinizar(String nombre) {
        System.out.println(nombre + " está siendo polinizada por insectos o el viento.");
    }

    public void crecerFlores(String nombre) {
        System.out.println(nombre + " está creciendo flores como cualquier planta con flor.");
    }

}
