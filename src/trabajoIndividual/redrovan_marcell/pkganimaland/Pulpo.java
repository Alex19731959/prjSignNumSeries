package trabajoIndividual.redrovan_marcell.pkganimaland;

public class Pulpo extends Invertebrados {
    private int numeroTentaculos;
    private boolean capacidadTinta;

    public Pulpo(String nombre, String habitat, int edadPromedio, String tipoDesplazamiento, boolean esCarnivoro, boolean exoesqueleto, boolean presenciaAntenas, int numeroTentaculos, boolean capacidadTinta) {
        super(nombre, habitat, edadPromedio, tipoDesplazamiento, esCarnivoro, exoesqueleto, presenciaAntenas);
        this.numeroTentaculos = numeroTentaculos;
        this.capacidadTinta = capacidadTinta;
    }

    public void expulsarTinta() { 
        System.out.println(nombre + " expulsa tinta defensiva (Capacidad: " + capacidadTinta + ")."); 
    }
    
    public void cambiarColor() { 
        System.out.println(nombre + " cambia de color para camuflarse usando sus " + numeroTentaculos + " tentáculos."); 
    }
}