package trabajoIndividual.redrovan_marcell.pkganimaland;

public class Invertebrados extends Fauna {
    protected boolean exoesqueleto;
    protected boolean presenciaAntenas;

    public Invertebrados(String nombre, String habitat, int edadPromedio, String tipoDesplazamiento, boolean esCarnivoro, boolean exoesqueleto, boolean presenciaAntenas) {
        super(nombre, habitat, edadPromedio, tipoDesplazamiento, esCarnivoro);
        this.exoesqueleto = exoesqueleto;
        this.presenciaAntenas = presenciaAntenas;
    }

    public void mudarPiel() { System.out.println(nombre + " está mudando su cubierta."); }
}