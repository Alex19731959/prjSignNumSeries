package pkgstrings;

public class StringExercises1 {

    /**
     * Cuenta la cantidad de vocales en una frase ingresada por el usuario.
     * @param frase
     */
    public void g2contarVocales(String frase) {
        System.out.println("\nEjercicio C01. Contar vocales");
        try {
            Integer.parseInt(frase);
            System.out.println("No se pudo procesar ya que se han ingresado un numero en lugar de una frase.");
            return;
        } catch (NumberFormatException e) {

        }
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = Character.toLowerCase(frase.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        System.out.println("La frase ingresada tiene " + contador + " vocales.");
    }

    /**
     * Cuenta la cantidad de letras en una frase ingresada por el usuario.
     * @param frase
     */
    public void g2contarLetras(String frase) {
        System.out.println("\nEjercicio C02. Contar letras");
        try {
            Integer.parseInt(frase);
            System.out.println("No se pudo procesar ya que se han ingresado un numero en lugar de una frase.");
            return;
        } catch (NumberFormatException e) {

        }
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isLetter(c)) {
                contador++;
            }
        }
        System.out.println("La frase ingresada tiene " + contador + " letras.");
    }

    /**
     * Elimina todas las ocurrencias de una vocal específica en una frase ingresada por el usuario.
     * @param frase
     * @param vocalStr
     */
    public void g2eliminarVocales(String frase, String vocalStr) {
        System.out.println("\nEjercicio C03. Eliminar vocales");
        try {
            Integer.parseInt(frase);
            System.out.println("No se pudo procesar ya que se han ingresado un numero en lugar de una frase.");
            return;
        } catch (NumberFormatException e) {

        }
        if (vocalStr == null || vocalStr.isEmpty()) return;
        char vocal = Character.toLowerCase(vocalStr.charAt(0));

        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char c = Character.toLowerCase(frase.charAt(i));
            if (c != vocal) {
                resultado.append(frase.charAt(i));
            }
        }
        System.out.println("La frase ingresada sin la vocal '" + vocal + "' es: " + resultado.toString());
    }

    /**
     * Elimina todas las ocurrencias de una letra específica en una frase ingresada por el usuario.
     * @param frase
     * @param letraStr
     */
    public void g2eliminarLetras(String frase, String letraStr) {
        System.out.println("\nEjercicio C04. Eliminar letras");
        try {
            Integer.parseInt(frase);
            System.out.println("No se pudo procesar ya que se han ingresado un numero en lugar de una frase.");
            return;
        } catch (NumberFormatException e) {

        }
        if (letraStr == null || letraStr.isEmpty()) return;
        char letra = Character.toLowerCase(letraStr.charAt(0));

        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char c = Character.toLowerCase(frase.charAt(i));
            if (c != letra) {
                resultado.append(frase.charAt(i));
            }
        }
        System.out.println("La frase ingresada sin la letra '" + letra + "' es: " + resultado.toString());
    }
}
