package Taxonomia;

public class Invertebrado extends Fauna {
    protected int cantidadPatas;
    protected boolean tieneExoesqueleto;

    public Invertebrado() {
        this("Invertebrado", "Invertebrado", "Natural", 1, true,
             "Heterótrofa", 25.0, false, "Caminar", "Terrestre",
             2, 6, true);
    }

    public Invertebrado(String nombre, String clasificacion, String habitat,
                        int edad, boolean estadoVital, String tipoNutricion,
                        double temperatura, boolean esVertebrado,
                        String tipoDesplazamiento, String ecosistema,
                        int nivelAlimenticio, int cantidadPatas,
                        boolean tieneExoesqueleto) {
        super(nombre, clasificacion, habitat, edad, estadoVital,
              tipoNutricion, temperatura, esVertebrado,
              tipoDesplazamiento, ecosistema, nivelAlimenticio);
        this.cantidadPatas = cantidadPatas;
        this.tieneExoesqueleto = tieneExoesqueleto;
    }

    public void protegerCuerpo() {
        System.out.println(nombre + " protege su cuerpo.");
    }

    public void cambiarExoesqueleto() {
        System.out.println(nombre + " cambia su exoesqueleto.");
    }
}
