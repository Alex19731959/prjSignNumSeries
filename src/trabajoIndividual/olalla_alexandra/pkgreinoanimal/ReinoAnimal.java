package trabajoIndividual.olalla_alexandra.pkgreinoanimal;

public class ReinoAnimal {
    
    protected String nombre;
    protected String clasificacion;
    protected float tamanio;
    protected String colores;

    public ReinoAnimal(String nombre, String clasificacion) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
    }

    public void respirar()      { System.out.println(nombre + " respira"); }
    public void crecer()        { System.out.println(nombre + " crece"); }
    public void reproducirse()  { System.out.println(nombre + " se reproduce"); }
    public void alimentarse()   { System.out.println(nombre + " se alimenta"); }
    public void establecerNombre(String nombre) { this.nombre = nombre; }
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Clasificación: " + clasificacion
                + " | Tamaño: " + tamanio + " | Colores: " + colores);
    }
}
