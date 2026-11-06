package trabajoIndividual.redrovan_marcell.pkganimaland;

public class Fauna extends Animaland {
    protected String tipoDesplazamiento;
    protected boolean esCarnivoro;

    public Fauna(String nombre, String habitat, int edadPromedio, String tipoDesplazamiento, boolean esCarnivoro) {
        super(nombre, habitat, edadPromedio);
        this.tipoDesplazamiento = tipoDesplazamiento;
        this.esCarnivoro = esCarnivoro;
    }

    public void cazarOAlimentarse() { System.out.println(nombre + " busca su alimento."); }
    public void comunicarse() { System.out.println(nombre + " emite señales de comunicación."); }
}