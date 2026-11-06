package trabajoIndividual.olalla_alexandra.pkgreinoanimal;

public class PruebaReinoAnimal  {
    public static void main(String[] args) {

        Hierba hierba = new Hierba();
        hierba.crecer();

        Flor flor = new Flor();
        flor.crecer();

        Arbol arbol = new Arbol();
        arbol.crecer();

        Perro perro = new Perro();
        perro.ladrar();

        Ballena ballena = new Ballena();
        ballena.nadar();
        

        Colibri colibri = new Colibri();
        colibri.volar();

        Arania arania = new Arania();
        arania.tejerTela();

    }
}