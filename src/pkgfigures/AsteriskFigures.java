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

    // =========================================================================
    // SERIE A: USO GENERAL SOLICITANDO DATOS POR CONSOLA
    // =========================================================================

    /**
     * A01) Solicita el nombre completo y el porcentaje de carga de cada palabra,
     * imprimiendo la barra de progreso y las letras correspondientes.
     *
     * @param n Tamaño de la barra de carga (mayor que 0).
     */
    public void g2imprimirArrayCargaNombre(int n) {
        System.out.println("\nEjercicio A01. Porcentaje de Carga por Palabra del Nombre");
        if (n < 1 || n > N_MAX) {
            System.out.println("El parámetro n debe estar entre 1 y " + N_MAX + ".");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre completo: ");
        String nombreCompleto = scanner.nextLine().trim();
        if (nombreCompleto.isEmpty()) {
            return;
        }
        String[] palabras = nombreCompleto.split("\\s+");

        int[] porcentajes = new int[palabras.length];
        System.out.print("Ingrese el porcentaje de carga para cada palabra: ");
        for (int i = 0; i < palabras.length; i++) {
            porcentajes[i] = scanner.nextInt();
        }

        System.out.println(nombreCompleto);
        for (int i = 0; i < palabras.length; i++) {
            int pct = porcentajes[i];
            int llenos = (pct * n) / 100;

            System.out.print("[");
            for (int j = 0; j < n; j++) {
                if (j < llenos - 1) {
                    System.out.print("=");
                } else if (j == llenos - 1) {
                    System.out.print(">");
                } else {
                    System.out.print(" ");
                }
            }
            int letras = (palabras[i].length() * pct) / 100;
            System.out.println("] " + pct + "% " + palabras[i].substring(0, letras));
        }
    }

    /**
     * A02) Solicita el carácter por consola e imprime las iniciales de tamaño n
     * evaluando directamente las posiciones (i, j).
     *
     * @param n Tamaño de las iniciales (mayor o igual a 3).
     */
    public void g2imprimirMatrizIniciales(int n) {
        System.out.println("\nEjercicio A02. Iniciales de Nombre y Apellido");
        if (n < 3 || n > N_MAX) {
            System.out.println("El parámetro n debe estar entre 3 y " + N_MAX + ".");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese caracter : ");
        char c = scanner.next().charAt(0);

        int mitad = n / 2;
        for (int i = 0; i < n; i++) {
            for (int letra = 0; letra < 2; letra++) {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || i == 0 || i == mitad || (i < mitad && j == n - 1)) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    /**
     * A03) Solicita una palabra o nombre por consola, dibuja un plano de coordenadas
     * positivo de altura n y grafica f(x) = 2x usando sus letras.
     *
     * @param n Altura del eje Y en el plano de coordenadas (mayor que 0).
     */
    public void g2imprimirPlanoCoordenadas(int n) {
        System.out.println("\nEjercicio A03. Plano de Coordenadas Positivo f(x) = 2x");
        if (n < 1 || n > N_MAX) {
            System.out.println("El parámetro n debe estar entre 1 y " + N_MAX + ".");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre o palabra a graficar: ");
        String texto = scanner.nextLine().trim();
        if (texto.isEmpty()) {
            return;
        }

        for (int i = n; i >= 0; i--) {
            System.out.print(i + " |");
            for (int j = 1; j <= 2 * n; j++) {
                if (i == 0) {
                    System.out.print("_");
                } else if (j == 2 * i) {
                    char letra = texto.charAt((i - 1) % texto.length());
                    System.out.print(letra);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * A04) Solicita el nombre y apellido por consola e imprime una X de tamaño n
     * evaluando las diagonales (i == j) y (j == n - 1 - i).
     *
     * @param n Tamaño de la X (mayor que 1).
     */
    public void g2imprimirMatrizXNombreApellido(int n) {
        System.out.println("\nEjercicio A04. Forma de X con Nombre y Apellido");
        if (n < 2 || n > N_MAX) {
            System.out.println("El parámetro n debe estar entre 2 y " + N_MAX + ".");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine().trim();
        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine().trim();
        if (nombre.isEmpty() || apellido.isEmpty()) {
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(nombre.charAt(i % nombre.length()) + " ");
                } else if (j == n - 1 - i) {
                    System.out.print(apellido.charAt(i % apellido.length()) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /**
     * A05) Solicita el nombre completo por consola e imprime una cuadrícula de tamaño n x n
     * colocando sus letras de forma aleatoria, poniendo '*' en colisiones y usando un delay.
     *
     * @param n Tamaño de la cuadrícula (mayor que 1).
     */
    public void g2imprimirMatrizAleatoriaConDelay(int n) {
        System.out.println("\nEjercicio A05. Posiciones Aleatorias con '*' y Delay");
        if (n < 2 || n > N_MAX) {
            System.out.println("El parámetro n debe estar entre 2 y " + N_MAX + ".");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese sus nombres completos: ");
        String letras = scanner.nextLine().replace(" ", "");
        if (letras.isEmpty()) {
            return;
        }

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int r = random.nextInt(3);
                if (r == 0) {
                    char c = letras.charAt(random.nextInt(letras.length()));
                    System.out.print(c + " ");
                } else if (r == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println();
        }
    }
}
