package trabajoIndividual.olalla_alexandra.pkgreinoanimal;

public class Arania extends Invertebrados  {
    public int numeroPatas = 8;
    private String glandulasSeda;

    public Arania() { this("arácnido"); }
    public Arania(String clasificacion) { super("araña", clasificacion); }

    public void tejerTela() { System.out.println(nombre + " teje su tela con " + numeroPatas + " patas"); }
}