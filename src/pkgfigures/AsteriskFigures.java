package pkgfigures;

public class AsteriskFigures {

    public static final int N_MAX = 50;

    /**
     * F1) Imprime un cuadrado hueco de asteriscos: solo se dibujan la primera
     * y la última fila, y la primera y la última columna.
     *
     * @param n Tamaño del lado del cuadrado (entre 2 y N_MAX).
     */
    public void g2imprimirFiguraF1(int n) {
        System.out.println("\nEjercicio F1. Cuadrado Hueco de Asteriscos");
        if (n < 2 || n > N_MAX) {
            System.out.println("El parámetro n debe estar entre 2 y " + N_MAX + ".");
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /**
     * F2) Imprime un marco cuadrado hueco que alterna '*' y '+': si la suma
     * de la fila y la columna es par se imprime '*', si es impar se imprime '+'.
     *
     * @param n Tamaño del lado del marco (entre 2 y N_MAX).
     */
    public void g2imprimirFiguraF2(int n) {
        System.out.println("\nEjercicio F2. Marco Cuadrado Alternando '*' y '+'");
        if (n < 2 || n > N_MAX) {
            System.out.println("El parámetro n debe estar entre 2 y " + N_MAX + ".");
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    if ((i + j) % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("+ ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /**
     * F3) Imprime un triángulo rectángulo pegado a la izquierda: la fila i
     * tiene i + 1 asteriscos.
     *
     * @param n Cantidad de filas del triángulo (entre 1 y N_MAX).
     */
    public void g2imprimirFiguraF3(int n) {
        System.out.println("\nEjercicio F3. Triángulo Rectángulo Izquierdo");
        if (n < 1 || n > N_MAX) {
            System.out.println("El parámetro n debe estar entre 1 y " + N_MAX + ".");
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * F4) Imprime un triángulo rectángulo pegado a la derecha: en cada fila
     * primero se imprimen los espacios (n - 1 - i) y luego i + 1 asteriscos.
     *
     * @param n Cantidad de filas del triángulo (entre 1 y N_MAX).
     */
    public void g2imprimirFiguraF4(int n) {
        System.out.println("\nEjercicio F4. Triángulo Rectángulo Derecho");
        if (n < 1 || n > N_MAX) {
            System.out.println("El parámetro n debe estar entre 1 y " + N_MAX + ".");
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * F5) Imprime una pirámide invertida centrada: en cada fila primero se
     * imprimen i espacios y luego 2 * (n - i) - 1 asteriscos.
     *
     * @param n Cantidad de filas de la pirámide (entre 1 y N_MAX).
     */
    public void g2imprimirFiguraF5(int n) {
        System.out.println("\nEjercicio F5. Pirámide Invertida Centrada");
        if (n < 1 || n > N_MAX) {
            System.out.println("El parámetro n debe estar entre 1 y " + N_MAX + ".");
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * F6) Imprime una pirámide centrada: en cada fila primero se imprimen
     * n - 1 - i espacios y luego 2 * i + 1 asteriscos.
     *
     * @param n Cantidad de filas de la pirámide (entre 1 y N_MAX).
     */
    public void g2imprimirFiguraF6(int n) {
        System.out.println("\nEjercicio F6. Pirámide Centrada");
        if (n < 1 || n > N_MAX) {
            System.out.println("El parámetro n debe estar entre 1 y " + N_MAX + ".");
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
