package pkgsequences;

import java.util.Scanner;

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
     * Imprime una serie donde recorre el alfatebeto y repite cada letra consecutivamente, donde la cantidad de repeticiones es igual a la posición de la letra en el alfabeto multiplicada por 2.
     * El limite de la serie es la letra z, si se ingresa un número mayor al de 'z' en la tabla ascii se mostrará un mensaje de error.
     * @param n imprime el numero de letras a imprimir
    */
    public void g2generarSerieAlfabetoSC08(int n){

       System.out.println("\nEjercicio SC08. Alternancia de Letras del; Alfabeto");
       Scanner scanner = new Scanner(System.in); 
       System.out.print("Ingresar cuántos términos desea mostrar: "); 
       int nTerminos = scanner.nextInt(); 

       if ((nTerminos - 1) + 'a' <= 'z') { 
        for (int i = 0; i < nTerminos; i++) { 
            char letra = (char) ('a' + i);
            int cantidad = (i + 1) * 2;

            for (int j = 0; j < cantidad; j++) { 
                System.out.print(letra);
            }

            if (i < nTerminos - 1) { 
                System.out.print(", "); 
            } 
        }
        System.out.println(); 
    } else { 
        System.out.println("Error: El número de términos excede el límite 'z'."); 
    }
    }

    /**
     * Imprime una serie donde recorre el alfabeto y repite cada letra consecutivamente, donde la cantidad de repeticiones es igual a la (posición de la letra en el alfabeto multiplicada por 2)-1, esto para generar todos los numeros impares.
     * El limite de la serie es la letra z, si se ingresa un número mayor al de 'z' en la tabla ascii se mostrará un mensaje de error.
     * @param n imprime el numero de letras a imprimir
    */
    public void g2generarSerieAlfabetoSC09 (int n){

        System.out.println("\nEjercicio SC09");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar cuántos términos desea mostrar: ");
        int nTerminos = scanner.nextInt();

        if ((nTerminos - 1) + 'a' <= 'z') {
            for (int pos = 0; pos < nTerminos; pos++) {
                char letra = (char) ('a' + pos);
                int cantidad = (pos * 2) + 1;

                for (int j = 0; j < cantidad; j++) {
                    System.out.print(letra);
                }

                if (pos < nTerminos - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Error: El número de términos excede el límite 'z'.");
        }

        
    }

    /**
     * Imprime una serie donde recorre el alfabeto y repite cada letra consecutivamente, donde la cantidad de repeticiones es igual a la posición de la letra.
     * El limite de la serie es la letra z, si se ingresa un número mayor al de 'z' en la tabla ascii se mostrará un mensaje de error.
     * @param n imprime el numero de letras a imprimir
    */

    public void g2generarSerieAlfabetoSC10(int n) {
        
        System.out.println("\nEjercicio SC10");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar cuántos términos desea mostrar: ");
        int nTerminos = scanner.nextInt();

        if ((nTerminos - 1) + 'a' <= 'z') {
            for (int pos = 0; pos < nTerminos; pos++) {
                char letra = (char) ('a' + pos);
                int cantidad = (pos * 2) + 1;

                for (int j = 0; j < cantidad; j++) {
                    System.out.print(letra);
                }

                if (pos < nTerminos - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Error: El número de términos excede el límite 'z'.");
        }
    }



    /**
     * Imprime una serie de vocales consecutivas, donde se imprime la letra a hasta llegar a la letra u y repetir ciclicamente.
     * Utilizamos un arreglo donde tenemos todas las vocales y utilizamos la funcion mod para que cuando se llegue a la letra u, vuelva a la letra a y asi sucesivamente.
     * @param n numero de letras a imprimir
     */
    
    public void g2generarSerieVocalesSC12 (int n){

        System.out.println("\nEjercicio SC12");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar cuántos términos desea mostrar: ");
        int nTerminos = scanner.nextInt();

        char[] arreglo = {'a', 'e', 'i', 'o', 'u'};

        for (int pos = 0; pos < nTerminos; pos++) {
            for (int j = 0; j < pos + 1; j++) {
                System.out.print(arreglo[pos % 5]);
            }

            if (pos < nTerminos - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    /**
     * Imprime una serie de letras consecutivas del alfabeto, donde se imprime la letra A hasta llegar a la letra Z y repetir ciclicamente. El numero de letras por posicion es igual a la posicion de la letra en el alfabeto.
     * Utilizamos la funcion mod para que cuando se llegue a la letra Z, vuelva a la letra A y asi sucesivamente.
     * @param n numero de elementos de la serie
     */
    
    public void g2generarSerieAlfabetoSC13 (int n){

        System.out.println("\nEjercicio SC13");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar cuántos términos desea mostrar: ");
        int nTerminos = scanner.nextInt();

        for (int pos = 0; pos < nTerminos; pos++) {
            char letra = (char) ('A' + (pos % 26));

            for (int j = 0; j < pos + 1; j++) {
                System.out.print(letra);
            }

            if (pos < nTerminos - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


    }
    

    /**
     * Imprime una serie de letras consecutivas del alfabeto, donde se imprime la letra A hasta llegar a la letra Z y repetir ciclicamente. El numero de letras por posicion es igual a la posicion de la letra en el alfabeto.
     * Utilizamos la funcion mod para que cuando se llegue a la letra Z, vuelva a la letra A y asi sucesivamente.
     * @param n numero de elementos de la serie
     */
    
    public void g2generarSerieAlfabetoSC14 (int n){


        System.out.println("\nEjercicio SC14");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar cuántos términos desea mostrar: ");
        int nTerminos = scanner.nextInt();

        for (int i = 0; i < nTerminos; i++) {
            char letra = (char) ('A' + (i % 26));
            System.out.print(letra);

            if (i < nTerminos - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


    }

}


