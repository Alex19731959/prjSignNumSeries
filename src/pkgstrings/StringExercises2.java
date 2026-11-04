package pkgstrings;

import java.util.Scanner;
public class StringExercises2 {

    /**
     * Invierte las vocales de una frase ingresada por el usuario y las convierte a mayúsculas.
     * @param frase
     */
    public void g2invertirVocalesMayusculas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEjercicio C05. Invertir vocales y convertir a mayúsculas");
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        try {
            Integer.parseInt(frase);
            System.out.println("No se pudo procesar ya que se han ingresado un numero en lugar de una frase.");
            return;
        } catch (NumberFormatException e) {

        }
        StringBuilder resultado = new StringBuilder();
        for (int i = frase.length() - 1; i >= 0; i--) {
            char c = frase.charAt(i);
            char cLower = Character.toLowerCase(c);
            if (cLower == 'a' || cLower == 'e' || cLower == 'i' || cLower == 'o' || cLower == 'u') {
                resultado.append(Character.toUpperCase(c));
            } else {
                resultado.append(Character.toLowerCase(c));
            }
        }
        System.out.println("La frase con las vocales invertidas y en mayúsculas es: " + resultado.toString());
    }

    /**
     * Invierte las letras alternadas de una frase ingresada por el usuario, convirtiendo las vocales a minúsculas y las consonantes a mayúsculas.
     * @param frase
     */
    public void g2invertirLetrasAlternadas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEjercicio C06. Invertir letras alternadas");
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        try {
            Integer.parseInt(frase);
            System.out.println("No se pudo procesar ya que se han ingresado un numero en lugar de una frase.");
            return;
        } catch (NumberFormatException e) {

        }
        StringBuilder resultado = new StringBuilder();
        for (int i = frase.length() - 1; i >= 0; i--) {
            char c = frase.charAt(i);
            char cLower = Character.toLowerCase(c);
            if (cLower == 'a' || cLower == 'e' || cLower == 'i' || cLower == 'o' || cLower == 'u') {
                resultado.append(Character.toLowerCase(c));
            } else {
                resultado.append(Character.toUpperCase(c));
            }
        }
        System.out.println("La frase con las letras alternadas invertidas es: " + resultado.toString());
    }

    /**
     * Convierte una frase ingresada por el usuario a mayúsculas, eliminando la letra 'J'.
     * @param frase
     */
    public void g2mayusculasSinJ() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEjercicio C07. Convertir a mayúsculas sin la letra 'J'");
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        
        try {
            Integer.parseInt(frase);
            System.out.println("No se pudo procesar ya que se han ingresado un numero en lugar de una frase.");
            return;
        } catch (NumberFormatException e) {

        }
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.toLowerCase(c) != 'j') {
                resultado.append(Character.toUpperCase(c));
            }
        }
        System.out.println("La frase convertida a mayúsculas sin la letra 'J' es: " + resultado.toString());
    }

    /**
     * Verifica si una palabra ingresada por el usuario es un anagrama de otra palabra original.
     * @param respuestaUsuario
     * @param palabraOriginal
     */
    public void g2anagrama() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEjercicio C08. Anagrama");
        System.out.print("Ingrese la primera frase: ");
        String respuestaUsuario = scanner.nextLine();
        System.out.print("Ingrese la segunda frase para verificar si es un anagrama: ");
        String palabraOriginal = scanner.nextLine();

        try {
            Integer.parseInt(respuestaUsuario);
            System.out.println("No se pudo procesar ya que se han ingresado un numero en lugar de una frase.");
            return;
        } catch (NumberFormatException e) {

        }
        try {
            Integer.parseInt(palabraOriginal);
            System.out.println("No se pudo procesar ya que se han ingresado un numero en lugar de una frase.");
            return;
        } catch (NumberFormatException e) {

        }
        String respuestaUsuarioLower = respuestaUsuario.toLowerCase();
        String palabraOriginalLower = palabraOriginal.toLowerCase();

        if (respuestaUsuarioLower.length() != palabraOriginalLower.length()) {
            System.out.println("La palabra ingresada no es un anagrama de la palabra original.");
            return;
        }

        char[] respuestaUsuarioArray = respuestaUsuarioLower.toCharArray();
        char[] palabraOriginalArray = palabraOriginalLower.toCharArray();

        java.util.Arrays.sort(respuestaUsuarioArray);
        java.util.Arrays.sort(palabraOriginalArray);

        if (java.util.Arrays.equals(respuestaUsuarioArray, palabraOriginalArray)) {
            System.out.println("La palabra ingresada es un anagrama de la palabra original.");
        } else {
            System.out.println("La palabra ingresada no es un anagrama de la palabra original.");
        }
    }

    /**
     * Alterna las mayúsculas y minúsculas de una frase ingresada por el usuario.
     * @param frase
     */
    public void g2alternarMayusculasMinusculas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEjercicio C09. Alternar mayúsculas y minúsculas");
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        
        try {
            Integer.parseInt(frase);
            System.out.println("No se pudo procesar ya que se han ingresado un numero en lugar de una frase.");
            return;
        } catch (NumberFormatException e) {

        }
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (i % 2 == 0) {
                resultado.append(Character.toUpperCase(c));
            } else {
                resultado.append(Character.toLowerCase(c));
            }
        }
        System.out.println("La frase con alternancia de mayúsculas y minúsculas es: " + resultado.toString());
    }
}
