package pkgsequences;

public class LetterSeries {

    private static final int N_DEFECTO = 15;
    private static final int N_MAX_ALFABETO = 52;
    
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
     * Imprime n letras del alfabeto alternando minúsculas y mayúsculas, de forma cíclica.
     * @param n número de letras (1 a {@value #N_MAX_ALFABETO}); fuera de rango se usa {@value #N_DEFECTO}.
     */
    public void g2imprimirAlternaciaAlfabeto(int n){
        String[] letrasMayusculas = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] letrasMinusculas = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        System.out.println("\nEjercicio SC16. Alternancia de Letras");
        if (n < 1 || n > N_MAX_ALFABETO) {
            System.out.println("El método acepta únicamente un parámetro n entre 1 y " + N_MAX_ALFABETO
                    + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(letrasMayusculas[i % (letrasMayusculas.length)] + " ");
            } else {
                System.out.print(letrasMinusculas[i % (letrasMinusculas.length)] + " ");
            }
        }
        System.out.println();
    }
}
