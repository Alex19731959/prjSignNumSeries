package trabajoIndividual.redrovan_marcell.pkganimaland;

public class Vertebrados extends Fauna {
    protected boolean columnaVertebral;
    protected int extremidades;
    protected String temperaturaCorporal;

    public Vertebrados(String nombre, String habitat, int edadPromedio, String tipoDesplazamiento, boolean esCarnivoro, boolean columnaVertebral, int extremidades, String temperaturaCorporal) {
        super(nombre, habitat, edadPromedio, tipoDesplazamiento, esCarnivoro);
        this.columnaVertebral = columnaVertebral;
        this.extremidades = extremidades;
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public void respirarPulmones() { System.out.println(nombre + " respira a través de pulmones."); }
}