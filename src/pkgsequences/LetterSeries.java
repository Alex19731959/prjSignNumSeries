package pkgsequences;

public class LetterSeries {

    /**
     * Imprime una serie de letras consecutivas del alfabeto, donde se imprime la letra a hasta llegar a la letra z y repetir ciclicamente.
     * @param n numero de letras a imprimir
     */
    public void g2imprimirLetrasConsecutivas (int n) {
        System.out.println("\nEjercicio SC06. Letras Consecutivas");
        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for (int i = 0; i < n; i++) {
            System.out.print(letras[i % letras.length] + " ");
        }
        System.out.println();
    }

    /**
     * Imprime una serie de letras del alfabeto alternando entre mayusculas y minusculas.
     * Donde se imprime la letra mayuscula en la posicion par y la letra minuscula en la posicion impar, hasta llegar a la letra Z y repetir ciclicamente.
     * @param n imprime el numero de letras a imprimir
    */
    public void g2imprimirAlternaciaAlfabeto(int n){
        String[] letrasMayusculas = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] letrasMinusculas = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        System.out.println("\nEjercicio SC16. Alternancia de Letras");
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(letrasMayusculas[i % (letrasMayusculas.length)] + " ");
            } else {
                System.out.print(letrasMinusculas[i % (letrasMinusculas.length)] + " ");
            }
        }
        System.out.println();
    }

    /**
     * Imprime cada letra minúscula consecutivamente, empezando con dos repeticiones
     * de la letra a y aumentando dos repeticiones por cada letra.
     * @param n cantidad de bloques de letras
     */
    public void g2generarSerieAlfabetoSC08(int n){

       System.out.println("\nEjercicio SC08. Alternancia de Letras del; Alfabeto");
       if ((n - 1) + 'a' <= 'z') { 
        for (int i = 0; i < n; i++) { 
            char letra = (char) ('a' + i);
            int cantidad = (i + 1) * 2;

            for (int j = 0; j < cantidad; j++) { 
                System.out.print(letra);
            }

            if (i < n - 1) { 
                System.out.print(", "); 
            } 
        }
        System.out.println(); 
    } else { 
        System.out.println("Error: El número de términos excede el límite 'z'."); 
    }
    }

    /**
     * Imprime cada letra minúscula consecutivamente, empezando con una repetición
     * de la letra a y aumentando dos repeticiones por cada letra.
     * @param n cantidad de bloques de letras
     */
    public void g2generarSerieAlfabetoSC09 (int n){

        System.out.println("\nEjercicio SC09");
        if ((n - 1) + 'a' <= 'z') {
            for (int pos = 0; pos < n; pos++) {
                char letra = (char) ('a' + pos);
                int cantidad = (pos * 2) + 1;

                for (int j = 0; j < cantidad; j++) {
                    System.out.print(letra);
                }

                if (pos < n - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Error: El número de términos excede el límite 'z'.");
        }

        
    }

    /**
     * Imprime cada letra minúscula consecutivamente, repitiéndola según su posición:
     * a una vez, b dos veces, c tres veces, y así sucesivamente.
     * @param n cantidad de bloques de letras
     */

    public void g2generarSerieAlfabetoSC10(int n) {
        
        System.out.println("\nEjercicio SC10");
        if ((n - 1) + 'a' <= 'z') {
            for (int pos = 0; pos < n; pos++) {
                char letra = (char) ('a' + pos);
                int cantidad = pos + 1;

                for (int j = 0; j < cantidad; j++) {
                    System.out.print(letra);
                }

                if (pos < n - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Error: El número de términos excede el límite 'z'.");
        }
    }



    /**
     * Imprime bloques de vocales repetidas en orden cíclico: a, e, i, o, u,
     * y vuelve a empezar por a después de u.
     * @param n cantidad de bloques de vocales
     */
    
    public void g2generarSerieVocalesSC12 (int n){

        System.out.println("\nEjercicio SC12");
        if (n > 20) {
            System.out.println("Error en SC12: el número de términos no puede ser mayor que 20.");
            return;
        }

        char[] arreglo = {'a', 'e', 'i', 'o', 'u'};

        for (int pos = 0; pos < n; pos++) {
            for (int j = 0; j < pos + 1; j++) {
                System.out.print(arreglo[pos % 5]);
            }

            if (pos < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    /**
     * Imprime bloques crecientes de letras mayúsculas: A, BB, CCC, DDDD,
     * repitiendo el alfabeto si se solicitan más de 26 bloques.
     * @param n cantidad de bloques
     */
    
    public void g2generarSerieAlfabetoSC13 (int n){

        System.out.println("\nEjercicio SC13");
        if (n > 20) {
            System.out.println("Error en SC13: el número de términos no puede ser mayor que 20.");
            return;
        }

        for (int pos = 0; pos < n; pos++) {
            char letra = (char) ('A' + (pos % 26));

            for (int j = 0; j < pos + 1; j++) {
                System.out.print(letra);
            }

            if (pos < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


    }
    

    /**
     * Imprime las letras mayúsculas consecutivas del alfabeto, desde A,
     * hasta completar la cantidad solicitada.
     * @param n cantidad de letras
     */
    
    public void g2generarSerieAlfabetoSC14 (int n){


        System.out.println("\nEjercicio SC14");
        if (n > 20) {
            System.out.println("Error en SC14: el número de términos no puede ser mayor que 20.");
            return;
        }

        for (int i = 0; i < n; i++) {
            char letra = (char) ('A' + (i % 26));
            System.out.print(letra);

            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


    }

}
