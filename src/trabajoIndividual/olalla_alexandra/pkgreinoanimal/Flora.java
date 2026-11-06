package trabajoIndividual.olalla_alexandra.pkgreinoanimal;

public class Flora extends ReinoAnimal {
    protected String raices;
    protected int hojas;

    public Flora() { this("planta", "vegetal"); }
    public Flora(String nombre, String clasificacion) { super(nombre, clasificacion); }

    public void fotosintesis() { System.out.println(nombre + " hace fotosíntesis"); }
    @Override public void crecer()       { System.out.println(nombre + " crece hacia la luz"); }
    @Override public void alimentarse()  { System.out.println(nombre + " se alimenta de luz, agua y minerales"); }
}