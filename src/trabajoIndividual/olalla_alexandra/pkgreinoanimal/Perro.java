package trabajoIndividual.olalla_alexandra.pkgreinoanimal;

public class Perro extends Vertebrados{
    public  String raza;
    public String pelaje;

    public Perro() { this("mamífero"); }
    public Perro(String clasificacion) { super("perro", clasificacion); }

    public void ladrar()  { System.out.println(nombre + " ladra: ¡guau!"); }
    public void olfatear() { System.out.println(nombre + " olfatea"); }
}

