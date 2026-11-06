package trabajoIndividual.placenciaIsaac.pkganimalKingdom;

public class PruebaSeresVivos {

    public static void main(String[] args) {
        
        System.out.println("Prueba de la clase SeresVivos:\n");
        System.out.println("Reino Plantae:");
        Girasol girasol = new Girasol("Girasol", "Planta", 1, 10, 5);
        girasol.respirar("Girasol");
        girasol.comer("Girasol");
        girasol.reproducir("Girasol");

        System.out.println("\nReino Animal(Vertebrado):");
        Delfin delfin = new Delfin("Delfín", "Vertebrado", 20, true, true, 200, true);
        delfin.respirar("Delfín");
        delfin.comer("Delfín");
        delfin.reproducir("Delfín");
        delfin.mover("Delfín");

        System.out.println("\nReino Animal(Invertebrado):");
        Pulpo pulpo = new Pulpo("Pulpo", "Invertebrado", 5, true, false);
        pulpo.respirar("Pulpo");
        pulpo.comer("Pulpo");
        pulpo.reproducir("Pulpo");
        pulpo.mover("Pulpo");
    }

}
