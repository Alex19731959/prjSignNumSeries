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
     * Imprime una serie de signos agrupados, donde se imprime el signo "+" en grupos de 1 a n.
     * La serie se repite hasta llegar al numero ingresado por el usuario.
     * @param n
     */
    public void g2imprimirGruposSignos1 (int n) {
        System.out.println("\nEjercicio SC02. Grupos de Signos");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("+"); 
            }
            System.out.print(" ");
        }
        System.out.println();
    }

    /**
     * Imprime una serie de signos agrupados, basados en la serie de Fibonacci, donde se imprime el signo "+" en grupos de 2 y 1, luego 3 y 2, luego 5 y 3, y asi sucesivamente.
     * La serie se repite hasta llegar al numero ingresado por el usuario.
     * @param n
     */
    public void g2imprimirGruposSignos2 (int n) {
        System.out.println("\nEjercicio SC03. Grupos de Signos");
        int a = 2;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print("+");
            }
            if (i < n) {
                System.out.print(" ");
            }
            int temp = a;
            a += b;
            b = temp;
        }
        System.out.println();
    }

    /**
     * Imprime una serie de operadores matematicos ciclicos, donde se alterna entre los operadores "+", "-", "*" y "/".
     * La serie se repite hasta llegar al numero ingresado por el usuario.
     * @param n 
     */
    public void g2imprimirOperadoresCiclicos (int n) {
        System.out.println("\nEjercicio SC04. Operadores Ciclicos");
        String[] operadores = {"+", "-", "*", "/",};
        for (int i = 0; i < n; i++) {
            System.out.print(operadores[i % operadores.length] + " ");
        }
        System.out.println();
    }

    /**
     * Imprime una serie de operadores matematicos ciclicos, donde se alterna entre los operadores "\", "|", "/", "-" y "|".
     * La serie se repite hasta llegar al numero ingresado por el usuario.
     * @param n 
     */
    public void g2imprimirIndicadorDireccionalCiclo (int n) {
        System.out.println("\nEjercicio SC05. Indicador Direccional Ciclo");
        String[] operadores = {"\\", "|", "/", "-", "|"};
        for (int i = 0; i < n; i++) {
            System.out.print(operadores[i % operadores.length] + " ");
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
