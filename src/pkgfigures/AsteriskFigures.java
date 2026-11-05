package pkgfigures;

import java.util.Random;
import java.util.Scanner;

public class AsteriskFigures {

     public static final int N_MAX = 50;
     
    /**
     * Método que imprime la Figura F1 (cuadrado hueco de asteriscos) evaluando posiciones.
     *
     * @param n Tamaño del cuadrado (mayor que 1).
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
     * Método que imprime la Figura F2 (marco cuadrado alternando '*' y '+') evaluando posiciones.
     *
     * @param n Tamaño del marco cuadrado (mayor que 1).
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
     * Método que imprime la Figura F3 (triángulo rectángulo izquierdo) evaluando posiciones.
     *
     * @param n Número de filas del triángulo (mayor que 0).
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
     * Método que imprime la Figura F4 (triángulo rectángulo derecho) evaluando posiciones.
     *
     * @param n Número de filas del triángulo (mayor que 0).
     */
    public void g2imprimirFiguraF4(int n) {
        System.out.println("\nEjercicio F4. Triángulo Rectángulo Derecho");
        if (n < 1 || n > N_MAX) {
            System.out.println("El parámetro n debe estar entre 1 y " + N_MAX + ".");
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= n - 1 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Método que imprime la Figura F5 (pirámide invertida centrada) evaluando posiciones.
     *
     * @param n Número de filas de la pirámide invertida (mayor que 0).
     */
    public void g2imprimirFiguraF5(int n) {
        System.out.println("\nEjercicio F5. Pirámide Invertida Centrada");
        if (n < 1 || n > N_MAX) {
            System.out.println("El parámetro n debe estar entre 1 y " + N_MAX + ".");
            return;
        }
        int columnas = 2 * n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < columnas - i; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Método que imprime la Figura F6 (pirámide centrada) evaluando posiciones.
     *
     * @param n Número de filas de la pirámide (mayor que 0).
     */
    public void g2imprimirFiguraF6(int n) {
        System.out.println("\nEjercicio F6. Pirámide Centrada");
        if (n < 1 || n > N_MAX) {
            System.out.println("El parámetro n debe estar entre 1 y " + N_MAX + ".");
            return;
        }
        for (int i = 0; i < n; i++) {
            int inicio = (n - 1) - i;
            int fin = (n - 1) + i;
            for (int j = 0; j <= fin; j++) {
                if (j >= inicio) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
