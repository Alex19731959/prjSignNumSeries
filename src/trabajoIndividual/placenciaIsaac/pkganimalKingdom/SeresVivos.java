package trabajoIndividual.placenciaIsaac.pkganimalKingdom;

public class SeresVivos {

    protected String nombre;
    protected String clasificacion;
    protected int edadMaxima;

    public SeresVivos(String nombre, String clasificacion, int edadMaxima) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.edadMaxima = edadMaxima;
    }

    public void respirar(String nombre) {
        System.out.println(nombre + " está respirando como cualquiera de los seres vivos.");
    }

    public void comer(String nombre) {
        System.out.println(nombre + " está comiendo como cualquiera de los seres vivos.");
    }

    public void reproducir(String nombre) {
        System.out.println(nombre + " se ha reproducido como cualquiera de los seres vivos.");
    }

}
