package Taxonomia;

public class SerVivo {
    protected String nombre;
    protected String clasificacion;
    protected String habitat;
    protected int edad;
    protected boolean estadoVital;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getEdad() {
        if (edad >= 0) {
            return edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
            return 0;
        }
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    public boolean isEstadoVital() {
        return estadoVital;
    }

    public void setEstadoVital(boolean estadoVital) {
        this.estadoVital = estadoVital;
    }

    public SerVivo(String nombre, String clasificacion, String habitat,
                   int edad, boolean estadoVital) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.habitat = habitat;
        this.edad = edad;
        this.estadoVital = estadoVital;
    }



    public void crecer() {
        System.out.println(getNombre() + " está creciendo.");
    }

    public void respirar() {
        System.out.println(getNombre() + " está respirando.");
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Clasificación: " + getClasificacion());
        System.out.println("Hábitat: " + getHabitat());
        System.out.println("Edad: " + getEdad());
        System.out.println("Estado vital: " + (isEstadoVital() ? "Vivo" : "Sin vida"));
    }

    
}
