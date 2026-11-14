package Taxonomia;

public class ReinoVegetal extends SerVivo {
    protected String tipoNutricion;
    protected boolean necesitaLuz;
    protected boolean tieneClorofila;

    public ReinoVegetal() {
        this("Sin nombre", "Reino vegetal", "Sin hábitat", 0, true,
             "Autótrofa", true, true);
    }

    public ReinoVegetal(String nombre, String clasificacion, String habitat,
                        int edad, boolean estadoVital, String tipoNutricion,
                        boolean necesitaLuz, boolean tieneClorofila) {
        super(nombre, clasificacion, habitat, edad, estadoVital);
        this.tipoNutricion = tipoNutricion;
        this.necesitaLuz = necesitaLuz;
        this.tieneClorofila = tieneClorofila;
    }

    public void realizarFotosintesis() {
        System.out.println(nombre + " realiza la fotosíntesis.");
    }

    public void absorberNutrientes() {
        System.out.println(nombre + " absorbe nutrientes.");
    }
}