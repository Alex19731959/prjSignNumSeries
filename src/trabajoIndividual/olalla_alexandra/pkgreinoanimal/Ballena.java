package trabajoIndividual.olalla_alexandra.pkgreinoanimal;

public class Ballena extends Vertebrados {
    public int aletas;
    public String cola;
    private boolean orificioRespiratorio;
    private boolean pulmones;
    
    public Ballena() { this("ballena asesina", "mamífero"); }
    public Ballena(String nombre, String clasificacion) { super(nombre, clasificacion); }
    
    public void nadar() { System.out.println(nombre + " nada"); }
    @Override public void respirar() { System.out.println(nombre + " respira por el orificio respiratorio"); }
}
