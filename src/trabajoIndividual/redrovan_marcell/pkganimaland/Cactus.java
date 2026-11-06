package trabajoIndividual.redrovan_marcell.pkganimaland;

public class Cactus extends Flora {
    private int espinas;
    private float almacenamientoAgua;

    public Cactus(String nombre, String habitat, int edadPromedio, String tipoTallo, int cantidadHojas, int espinas, float almacenamientoAgua) {
        super(nombre, habitat, edadPromedio, tipoTallo, cantidadHojas);
        this.espinas = espinas;
        this.almacenamientoAgua = almacenamientoAgua;
    }

    public void almacenarAgua() { 
        System.out.println(nombre + " almacena " + almacenamientoAgua + " litros de agua."); 
    }

    public void florecer() { 
        System.out.println(nombre + " ha florecido con éxito entre sus " + espinas + " espinas."); 
    }
}