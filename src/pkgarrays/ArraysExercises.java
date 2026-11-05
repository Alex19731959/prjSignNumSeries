package pkgarrays;

import java.util.Random;
import java.util.Scanner;

public class ArraysExercises {
    public static final int N_MAX = 50;

    private final Scanner scanner = new Scanner(System.in);

    /**
     * A01) Muestra el porcentaje de carga y las letras alcanzadas de cada palabra.
     *
     * @param n Cantidad de posiciones de cada barra.
     */
    public void g2imprimirArrayCargaNombre(int n) {
        System.out.println("\nEjercicio A01. Porcentaje de Carga por Palabra del Nombre");
        if (!validarTamano(n, 1)) {
            return;
        }

        System.out.print("Ingrese su nombre completo: ");
        String nombreCompleto = scanner.nextLine().trim();
        if (nombreCompleto.isEmpty()) {
            System.out.println("Debe ingresar al menos una palabra.");
            return;
        }

        String[] palabras = nombreCompleto.split("\\s+");
        int[] porcentajes = new int[palabras.length];
        System.out.print("Ingrese el porcentaje de carga para cada palabra: ");
        String lineaPorcentajes = scanner.nextLine().trim();
        String[] valores = lineaPorcentajes.isEmpty() ? new String[0] : lineaPorcentajes.split("\\s+");
        if (valores.length != palabras.length) {
            System.out.println("Ingrese un porcentaje por cada palabra (" + palabras.length + " en total).");
            return;
        }

        for (int i = 0; i < valores.length; i++) {
            try {
                porcentajes[i] = Integer.parseInt(valores[i]);
            } catch (NumberFormatException e) {
                System.out.println("El porcentaje '" + valores[i] + "' no es un número entero.");
                return;
            }
            if (porcentajes[i] < 0 || porcentajes[i] > 100) {
                System.out.println("Los porcentajes deben estar entre 0 y 100.");
                return;
            }
        }

        System.out.println(nombreCompleto);
        for (int i = 0; i < palabras.length; i++) {
            int porcentaje = porcentajes[i];
            int posicionesLlenas = porcentaje * n / 100;
            System.out.print("[");
            for (int j = 0; j < n; j++) {
                if (porcentaje > 0 && j == posicionesLlenas - 1) {
                    System.out.print(">");
                } else if (j < posicionesLlenas - 1 || (porcentaje == 100 && j < posicionesLlenas)) {
                    System.out.print("=");
                } else {
                    System.out.print(" ");
                }
            }
            int letras = palabras[i].length() * porcentaje / 100;
            System.out.println("] " + porcentaje + "% " + palabras[i].substring(0, letras));
        }
    }

    /**
     * A02) Presenta dos iniciales con una matriz de tamaño n y el carácter elegido.
     *
     * @param n Tamaño de la matriz.
     */
    public void g2imprimirMatrizIniciales(int n) {
        System.out.println("\nEjercicio A02. Iniciales de Nombre y Apellido");
        if (!validarTamano(n, 3)) {
            return;
        }

        System.out.print("Ingrese su nombre y apellido: ");
        String nombreCompleto = scanner.nextLine().trim();
        String[] palabras = nombreCompleto.isEmpty() ? new String[0] : nombreCompleto.split("\\s+");
        if (palabras.length < 2) {
            System.out.println("Ingrese al menos su nombre y un apellido.");
            return;
        }

        System.out.print("Ingrese el carácter: ");
        String entradaCaracter = scanner.nextLine();
        if (entradaCaracter.isEmpty()) {
            System.out.println("Debe ingresar un carácter.");
            return;
        }

        char inicialNombre = Character.toUpperCase(palabras[0].charAt(0));
        char inicialApellido = Character.toUpperCase(palabras[palabras.length - 1].charAt(0));
        char caracter = entradaCaracter.charAt(0);
        System.out.println("Iniciales: " + inicialNombre + inicialApellido);
        int mitad = n / 2;

        for (int i = 0; i < n; i++) {
            for (int inicial = 0; inicial < 2; inicial++) {
                for (int j = 0; j < n; j++) {
                    boolean trazo = j == 0 || i == 0 || i == mitad || (i < mitad && j == n - 1);
                    System.out.print(trazo ? caracter : " ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    /**
     * A03) Grafica f(x) = 2x en el primer cuadrante usando las letras ingresadas.
     *
     * @param n Altura máxima del eje Y.
     */
    public void g2imprimirPlanoCoordenadas(int n) {
        System.out.println("\nEjercicio A03. Plano de Coordenadas Positivo f(x) = 2x");
        if (!validarTamano(n, 1)) {
            return;
        }

        System.out.print("Ingrese el nombre o palabra a graficar: ");
        String texto = scanner.nextLine().replaceAll("\\s+", "");
        if (texto.isEmpty()) {
            System.out.println("Debe ingresar una palabra.");
            return;
        }

        for (int y = n; y >= 0; y--) {
            System.out.printf("%2d |", y);
            for (int x = 1; x <= 2 * n; x++) {
                if (y == 0) {
                    System.out.print("_");
                } else if (x == 2 * y) {
                    System.out.print(texto.charAt((y - 1) % texto.length()));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * A04) Dibuja una X usando las letras del nombre y el apellido.
     *
     * @param n Tamaño de la matriz cuadrada.
     */
    public void g2imprimirMatrizXNombreApellido(int n) {
        System.out.println("\nEjercicio A04. Forma de X con Nombre y Apellido");
        if (!validarTamano(n, 2)) {
            return;
        }

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine().trim();
        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine().trim();
        if (nombre.isEmpty() || apellido.isEmpty()) {
            System.out.println("Debe ingresar su nombre y apellido.");
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(nombre.charAt(i % nombre.length()));
                } else if (j == n - 1 - i) {
                    System.out.print(apellido.charAt(i % apellido.length()));
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /**
     * A05) Ubica letras al azar en una matriz; las posiciones repetidas se marcan con '*'.
     *
     * @param n Tamaño de la matriz cuadrada.
     */
    public void g2imprimirMatrizAleatoriaConDelay(int n) {
        System.out.println("\nEjercicio A05. Posiciones Aleatorias con '*' y Delay");
        if (!validarTamano(n, 2)) {
            return;
        }

        System.out.print("Ingrese sus nombres completos: ");
        String letras = scanner.nextLine().replaceAll("\\s+", "");
        if (letras.isEmpty()) {
            System.out.println("Debe ingresar al menos un nombre.");
            return;
        }

        char[][] matriz = new char[n][n];
        Random random = new Random();
        for (int i = 0; i < letras.length(); i++) {
            int fila = random.nextInt(n);
            int columna = random.nextInt(n);
            matriz[fila][columna] = matriz[fila][columna] == '\0' ? letras.charAt(i) : '*';
        }

        for (char[] fila : matriz) {
            for (char celda : fila) {
                System.out.print((celda == '\0' ? ' ' : celda) + " ");
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            System.out.println();
        }
    }

    private boolean validarTamano(int n, int minimo) {
        if (n < minimo || n > N_MAX) {
            System.out.println("El tamaño debe estar entre " + minimo + " y " + N_MAX + ".");
            return false;
        }
        return true;
    }
}
