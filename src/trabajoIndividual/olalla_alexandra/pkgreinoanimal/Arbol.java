package trabajoIndividual.olalla_alexandra.pkgreinoanimal;

public class Arbol extends Flora {
    public  String tronco;
    public  String copa;

    public Arbol() { this("planta leñosa"); }
    public Arbol(String clasificacion) { super("árbol", clasificacion); }

    public void darSombra() { System.out.println(nombre + " da sombra"); }

}
