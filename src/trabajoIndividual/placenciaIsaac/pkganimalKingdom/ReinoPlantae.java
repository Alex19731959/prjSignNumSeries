package trabajoIndividual.placenciaIsaac.pkganimalKingdom;

public class ReinoPlantae extends SeresVivos {

    protected Integer numeroHojas;

    public ReinoPlantae(String nombre, String clasificacion, int edadMaxima, Integer numeroHojas) {
        super(nombre, clasificacion, edadMaxima);
        this.numeroHojas = numeroHojas;
    }

    public void hacerFotosintesis(String nombre) {
        System.out.println(nombre + " está realizando la fotosíntesis como cualquier planta.");
    }
    @Override 
    public void comer(String nombre) {
        System.out.println(nombre + " está absorbiendo nutrientes del suelo como cualquier planta.");
    }

}
