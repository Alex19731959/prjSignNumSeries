package pkgsequences;

public class LetterSeries {

    /**
     * Imprime una serie de letras del alfabeto alternando entre mayusculas y minusculas.
     * Donde se imprime la letra mayuscula en la posicion par y la letra minuscula en la posicion impar, hasta llegar a la letra Z y repetir ciclicamente.
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
