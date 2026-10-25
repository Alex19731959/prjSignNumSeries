package pkgsequences;

public class OperatorSeries {

    /**
     * Imprime una serie de signos alternados, donde se alterna entre el signo "+" y el signo "-".
     * La serie se repite hasta llegar al numero ingresado por el usuario.
     * @param n 
     */
    public void g2imprimirSignosAlternados(int n) {
        System.out.println("\nEjercicio SC01. Signos Alternados");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print("- ");
            } else {
                System.out.print("+ ");
            }
        }
        System.out.println();
    }

    /**
     * Imprime una serie de numeros naturales compuesta unicamente por el caracter "*".
     * Donde se repite el caracter "*" de 1 a n veces, siendo n el numero ingresado por el usuario.
     * @param n 
     */
    public void g2imprimirNumerosEstrellas(int n) {
        System.out.println("\nEjercicio SC15. Números Estrellas");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("  ");
        }
        System.out.println();
    }

    /**
     * Imprime una serie de operadores matematicos alternando entre ellos.
     * La serie de operadores es: +, -, *, /, % y se repite ciclicamente hasta llegar al numero ingresado por el usuario.
     * @param n 
     */
    public void g2imprimirAlternanciaOperadores(int n) {
        String[] operadores = {"+", "-", "*", "/ ", "% "};
        System.out.println("\nEjercicio SC17. Alternancia de Operadores");
        for (int i = 0; i < n; i++) {
            System.out.print(operadores[i % operadores.length] + " ");
        }
        System.out.println();
    }
    
}
