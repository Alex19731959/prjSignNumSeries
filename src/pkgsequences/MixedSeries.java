package pkgsequences;

public class MixedSeries {
    
    /**
     * Imprime una serie de letras y signos alternados, donde se alterna entre una letra del alfabeto y un signo.
     * La serie se repite hasta llegar al numero ingresado por el usuario.
     * @param n 
     */
    
    public void g2imprimirLetrasSignosAlternados(int n) {
        System.out.println("\nEjercicio SC07. Letras y Signos Alternados");
        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] signos = {"+", "-"};
        int indiceSigno = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(letras[i % letras.length] + " ");
            } else {
                System.out.print(signos[indiceSigno % signos.length] + " ");
                indiceSigno++;
            }
        }
        System.out.println();
    }
}
