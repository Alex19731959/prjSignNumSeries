package trabajoIndividual.redrovan_marcell.pkganimaland;

public class Flora extends Animaland {
    protected String tipoTallo;
    protected int cantidadHojas;

    public Flora(String nombre, String habitat, int edadPromedio, String tipoTallo, int cantidadHojas) {
        super(nombre, habitat, edadPromedio);
        this.tipoTallo = tipoTallo;
        this.cantidadHojas = cantidadHojas;
    }

    public void realizarFotosintesis() { System.out.println(nombre + " realiza fotosíntesis."); }
    public void absorberAgua() { System.out.println(nombre + " absorbe agua por las raíces."); }
}
