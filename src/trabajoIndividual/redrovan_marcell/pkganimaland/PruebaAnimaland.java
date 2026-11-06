package trabajoIndividual.redrovan_marcell.pkganimaland;

public class PruebaAnimaland {
    public static void main(String[] args) {

        Cactus cactus = new Cactus("Saguaro", "Desierto", 100, "Suculento", 0, 350, 25.0f);
        cactus.nacer();
        cactus.realizarFotosintesis();
        cactus.almacenarAgua();
        cactus.florecer();

        System.out.println();

        Aguila aguila = new Aguila("Águila Real", "Montaña", 20, "Vuelo", true, true, 2, "Homeotermo", 2.2f, 150);
        aguila.crecer();
        aguila.respirarPulmones();
        aguila.volarAlto();
        aguila.cazarPresa();

        System.out.println();

        Pulpo pulpo = new Pulpo("Pulpo Gigante", "Océano", 5, "Nandador", true, false, false, 8, true);
        pulpo.reproducirse();
        pulpo.mudarPiel();
        pulpo.cambiarColor();
        pulpo.expulsarTinta();
    }
}