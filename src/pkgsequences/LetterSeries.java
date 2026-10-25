package pkgsequences;

public class LetterSeries {

    /**
     * Imprime una serie de letras consecutivas del alfabeto, donde se imprime la letra a hasta llegar a la letra z y repetir ciclicamente.
     * @param n 
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
     * @param n 
    */
    public void g2imprimirAlternaciaAlfabeto(int n){
        String[] letrasMayusculas = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] letrasMinusculas = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        System.out.println("\nEjercicio SC16. Alternancia de Letras");
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(letrasMayusculas[i % (letrasMinusculas.length)] + " ");
            } else {
                System.out.print(letrasMinusculas[i % (letrasMayusculas.length)] + " ");
            }
        }
        System.out.println();
    }



}
