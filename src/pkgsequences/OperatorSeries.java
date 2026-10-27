package pkgsequences;

import java.util.Scanner;

public class OperatorSeries {

    private static final int N_DEFECTO = 15;
    private static final int N_MAX_ESTRELLAS = 30;
    private static final int N_MAX_OPERADORES = 50;

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
     * La serie se repite hasta llegar al numero ingresado por el usuario, ademas se aplico una restriccion para que si el numero ingresado es mayor a 10, la serie se repita en bloques para mantener la legibilidad y evitar el desbordamiento de la consola.
     * @param n
     */
    public void g2imprimirGruposSignos2 (int n) {
        System.out.println("\nEjercicio SC03. Grupos de Signos");
        if (n > 10) {
            System.out.println("Ya que el numero ingresado es mayor a 10, la serie se repetira en bloques para mantener la legibilidad y evitar el desbordamiento de la consola.");
        }
        int a = 2;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print("+");
            }
            if (i % 10 == 0) {
                System.out.println();
                if (i < n) {
                    a = 2;
                    b = 1;
                    continue;
                }
            } else if (i < n) {
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
     * Imprime una serie de estrellas, de 1 a n asteriscos por término.
     * @param n número de términos (1 a {@value #N_MAX_ESTRELLAS}); fuera de rango se usa {@value #N_DEFECTO}.
     */
    public void g2imprimirNumerosEstrellas(int n) {
        System.out.println("\nEjercicio SC15. Números Estrellas");
        if (n < 1 || n > N_MAX_ESTRELLAS) {
            System.out.println("El método acepta únicamente un parámetro n entre 1 y " + N_MAX_ESTRELLAS
                    + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("  ");
        }
        System.out.println();
    }

    /**
     * Imprime n operadores matemáticos (+, -, *, /, %) repetidos cíclicamente.
     * @param n número de operadores (1 a {@value #N_MAX_OPERADORES}); fuera de rango se usa {@value #N_DEFECTO}.
     */
    public void g2imprimirAlternanciaOperadores(int n) {
        String[] operadores = {"+", "-", "*", "/ ", "% "};
        System.out.println("\nEjercicio SC17. Alternancia de Operadores");
        if (n < 1 || n > N_MAX_OPERADORES) {
            System.out.println("El método acepta únicamente un parámetro n entre 1 y " + N_MAX_OPERADORES
                    + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(operadores[i % operadores.length] + " ");
        }
        System.out.println();
    }
    
    /**
     * Imprime bloques del símbolo elegido por el usuario, aumentando de dos
     * en dos la cantidad de símbolos de cada bloque.
     * @param n cantidad de bloques
     */
    public void g2ImprimirSerieParNumerosSC11(int n){

        System.out.println("\nEjercicio SC11. Grupos de #");
        if (n < 1) {
            System.out.println("No se pudo ejecutar, ya que debe tener al menos 1 término.");
            return;
        }
        if (n > 20) {
            System.out.println("Error en SC11: el número de términos no puede ser mayor que 20.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Solicitar el símbolo para la serie: ");
        char simbolo = scanner.next().charAt(0);

        for (int pos = 0; pos < n; pos++) {
            int cantidad = (pos + 1) * 2;

            for (int j = 0; j < cantidad; j++) {
                System.out.print(simbolo);
            }

            if (pos < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();



    }
}
