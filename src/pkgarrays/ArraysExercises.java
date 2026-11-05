package pkgarrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArraysExercises {
    public static final int N_MAX = 50;
    private static final int TAMANO_FUENTE = 5;
    private static final int DELAY_MS = 120;

    /** Letras A-Z dibujadas en una matriz base de 5x5 (usada por A02). */
    private static final String[][] FUENTE = {
        {" *** ", "*   *", "*****", "*   *", "*   *"}, // A
        {"**** ", "*   *", "**** ", "*   *", "**** "}, // B
        {" ****", "*    ", "*    ", "*    ", " ****"}, // C
        {"**** ", "*   *", "*   *", "*   *", "**** "}, // D
        {"*****", "*    ", "**** ", "*    ", "*****"}, // E
        {"*****", "*    ", "**** ", "*    ", "*    "}, // F
        {" ****", "*    ", "*  **", "*   *", " ****"}, // G
        {"*   *", "*   *", "*****", "*   *", "*   *"}, // H
        {"*****", "  *  ", "  *  ", "  *  ", "*****"}, // I
        {"*****", "   * ", "   * ", "*  * ", " **  "}, // J
        {"*   *", "*  * ", "***  ", "*  * ", "*   *"}, // K
        {"*    ", "*    ", "*    ", "*    ", "*****"}, // L
        {"*   *", "** **", "* * *", "*   *", "*   *"}, // M
        {"*   *", "**  *", "* * *", "*  **", "*   *"}, // N
        {" *** ", "*   *", "*   *", "*   *", " *** "}, // O
        {"*****", "*   *", "*****", "*    ", "*    "}, // P
        {" *** ", "*   *", "* * *", "*  * ", " ** *"}, // Q
        {"*****", "*   *", "*****", "*  * ", "*   *"}, // R
        {"*****", "*    ", "*****", "    *", "*****"}, // S
        {"*****", "  *  ", "  *  ", "  *  ", "  *  "}, // T
        {"*   *", "*   *", "*   *", "*   *", "*****"}, // U
        {"*   *", "*   *", "*   *", " * * ", "  *  "}, // V
        {"*   *", "*   *", "* * *", "** **", "*   *"}, // W
        {"*   *", " * * ", "  *  ", " * * ", "*   *"}, // X
        {"*   *", " * * ", "  *  ", "  *  ", "  *  "}, // Y
        {"*****", "   * ", "  *  ", " *   ", "*****"}, // Z
    };

    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();

    /**
     * A01) Crea un array con cada palabra del nombre y otro con el porcentaje de carga
     * de cada palabra; muestra la barra y las letras alcanzadas.
     *
     * @param n Cantidad de posiciones de cada barra.
     */
    public void g2imprimirArrayCargaNombre(int n) {
        System.out.println("\nEjercicio A01. Porcentaje de Carga por Palabra del Nombre");
        if (!validarTamano(n, 1)) {
            return;
        }

        String[] palabras = pedirPalabras("Ingrese su nombre completo: ", 1);
        int[] porcentajes = new int[palabras.length];
        boolean valido;
        do {
            valido = true;
            System.out.print("Ingrese el porcentaje de carga (" + palabras.length + " valores entre 0 y 100): ");
            String linea = scanner.nextLine().trim();
            String[] valores = linea.isEmpty() ? new String[0] : linea.split("\\s+");
            if (valores.length != palabras.length) {
                valido = false;
            } else {
                for (int i = 0; i < valores.length && valido; i++) {
                    try {
                        porcentajes[i] = Integer.parseInt(valores[i]);
                        valido = porcentajes[i] >= 0 && porcentajes[i] <= 100;
                    } catch (NumberFormatException e) {
                        valido = false;
                    }
                }
            }
            if (!valido) {
                System.out.println("Porcentajes no válidos, inténtelo de nuevo.");
            }
        } while (!valido);

        System.out.println(String.join(" ", palabras));
        System.out.println();
        for (int i = 0; i < palabras.length; i++) {
            int porcentaje = porcentajes[i];
            int llenas = (int) Math.round(porcentaje * n / 100.0);
            if (porcentaje > 0 && llenas == 0) {
                llenas = 1;
            }
            StringBuilder barra = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (j < llenas - 1) {
                    barra.append('=');
                } else if (j == llenas - 1) {
                    barra.append('>');
                } else {
                    barra.append(' ');
                }
            }
            int letras = palabras[i].length() * porcentaje / 100;
            System.out.printf("[%s] %3d%% %s%n", barra, porcentaje, palabras[i].substring(0, letras));
        }
    }

    /**
     * A02) Crea una matriz de tamaño n con las iniciales del nombre y apellido
     * dibujadas con el carácter ingresado.
     *
     * @param n Tamaño de cada letra (mínimo 5).
     */
    public void g2imprimirMatrizIniciales(int n) {
        System.out.println("\nEjercicio A02. Iniciales de Nombre y Apellido");
        if (!validarTamano(n, TAMANO_FUENTE)) {
            return;
        }

        String[] palabras = pedirPalabras("Ingrese su nombre y apellido: ", 2);
        char caracter = pedirCaracter();
        char[] iniciales = {
            Character.toUpperCase(palabras[0].charAt(0)),
            Character.toUpperCase(palabras[palabras.length - 1].charAt(0))
        };
        System.out.println("Iniciales: " + iniciales[0] + iniciales[1]);
        System.out.println();

        int separacion = 3;
        int columnas = iniciales.length * n + (iniciales.length - 1) * separacion;
        char[][] matriz = new char[n][columnas];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = ' ';
            }
        }
        for (int k = 0; k < iniciales.length; k++) {
            String[] patron = patronLetra(iniciales[k]);
            int desplazamiento = k * (n + separacion);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int fila = i * TAMANO_FUENTE / n;
                    int columna = j * TAMANO_FUENTE / n;
                    if (patron[fila].charAt(columna) == '*') {
                        matriz[i][desplazamiento + j] = caracter;
                    }
                }
            }
        }
        imprimirMatriz(matriz, "");
    }

    /**
     * A03) Dibuja un plano de coordenadas positivo y grafica f(x) = 2x
     * usando una letra del nombre en cada punto.
     *
     * @param n No se usa: la altura del plano es la cantidad de letras del nombre.
     */
    public void g2imprimirPlanoCoordenadas(int n) {
        System.out.println("\nEjercicio A03. Plano de Coordenadas Positivo f(x) = 2x");

        String texto;
        do {
            System.out.print("Ingrese su nombre: ");
            texto = scanner.nextLine().replaceAll("\\s+", "");
            if (texto.isEmpty() || texto.length() > N_MAX) {
                System.out.println("Ingrese entre 1 y " + N_MAX + " letras.");
            }
        } while (texto.isEmpty() || texto.length() > N_MAX);

        int alto = texto.length();
        int ancho = 2 * alto + 2;
        int digitos = String.valueOf(alto).length();
        char[][] plano = new char[alto + 1][ancho];
        for (int y = 0; y <= alto; y++) {
            for (int x = 0; x < ancho; x++) {
                plano[y][x] = (y == 0) ? '_' : ' ';
            }
        }
        // Punto (x, y = f(x)): la letra x del nombre va en la fila y = x y en la columna 2x.
        for (int x = 1; x <= alto; x++) {
            int y = x;
            plano[y][2 * x] = texto.charAt(x - 1);
        }

        System.out.println();
        for (int y = alto; y >= 0; y--) {
            System.out.printf("%" + digitos + "d |%s%n", y, new String(plano[y]));
        }
    }

    /**
     * A04) Crea una matriz cuadrada (tamaño = palabra más larga) donde el nombre va en la
     * diagonal principal y el apellido en la diagonal secundaria, formando una X.
     *
     * @param n No se usa: el tamaño depende del nombre y apellido.
     */
    public void g2imprimirMatrizXNombreApellido(int n) {
        System.out.println("\nEjercicio A04. Forma de X con Nombre y Apellido");
        String[] palabras = pedirPalabras("Ingrese su nombre y apellido: ", 2);
        String nombre = palabras[0];
        String apellido = palabras[indiceApellido(palabras)];

        int tamano = Math.max(nombre.length(), apellido.length());
        char[][] matriz = matrizVacia(tamano);
        for (int i = 0; i < nombre.length(); i++) {
            matriz[i][i] = nombre.charAt(i);
        }
        for (int i = 0; i < apellido.length(); i++) {
            int j = tamano - 1 - i;
            matriz[i][j] = (matriz[i][j] == ' ') ? apellido.charAt(i) : '*';
        }
        System.out.println();
        imprimirMatriz(matriz, " ");
    }

    /**
     * A05) Crea una matriz cuadrada del tamaño del nombre más largo y coloca cada letra de
     * los nombres completos en orden aleatorio: nombre en la diagonal principal, apellido en
     * la secundaria y los demás nombres en filas aleatorias. Si dos letras coinciden en una
     * posición se pone '*'. Cada colocación se muestra con un delay.
     *
     * @param n No se usa: el tamaño depende del nombre.
     */
    public void g2imprimirMatrizAleatoriaConDelay(int n) {
        System.out.println("\nEjercicio A05. Posiciones Aleatorias con '*' y Delay");
        String[] palabras = pedirPalabras("Ingrese sus nombres y apellidos completos: ", 2);
        int apellido = indiceApellido(palabras);

        int tamano = 0;
        for (String palabra : palabras) {
            tamano = Math.max(tamano, palabra.length());
        }
        if (tamano > N_MAX) {
            System.out.println("Cada palabra debe tener máximo " + N_MAX + " letras.");
            return;
        }

        // Cada posición es {fila, columna, letra}.
        List<int[]> posiciones = new ArrayList<>();
        for (int i = 0; i < palabras[0].length(); i++) {
            posiciones.add(new int[] {i, i, palabras[0].charAt(i)});
        }
        for (int i = 0; i < palabras[apellido].length(); i++) {
            posiciones.add(new int[] {i, tamano - 1 - i, palabras[apellido].charAt(i)});
        }
        List<Integer> filas = new ArrayList<>();
        for (int i = 0; i < tamano; i++) {
            filas.add(i);
        }
        Collections.shuffle(filas, random);
        int siguienteFila = 0;
        for (int p = 1; p < palabras.length; p++) {
            if (p == apellido) {
                continue;
            }
            String palabra = palabras[p];
            int fila = filas.get(siguienteFila++ % tamano);
            int inicio = random.nextInt(tamano - palabra.length() + 1);
            for (int i = 0; i < palabra.length(); i++) {
                posiciones.add(new int[] {fila, inicio + i, palabra.charAt(i)});
            }
        }
        Collections.shuffle(posiciones, random);

        char[][] matriz = matrizVacia(tamano);
        boolean[][] ocupada = new boolean[tamano][tamano];
        System.out.println();
        imprimirMatriz(matriz, " ");
        for (int[] posicion : posiciones) {
            int fila = posicion[0];
            int columna = posicion[1];
            matriz[fila][columna] = ocupada[fila][columna] ? '*' : (char) posicion[2];
            ocupada[fila][columna] = true;
            try {
                Thread.sleep(DELAY_MS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.print("\u001B[" + tamano + "A"); // Sube el cursor para redibujar la matriz.
            imprimirMatriz(matriz, " ");
        }
    }

    // =========================================================================
    // MÉTODOS AUXILIARES
    // =========================================================================

    private String[] pedirPalabras(String mensaje, int minimo) {
        String[] palabras;
        do {
            System.out.print(mensaje);
            String linea = scanner.nextLine().trim();
            palabras = linea.isEmpty() ? new String[0] : linea.split("\\s+");
            if (palabras.length < minimo) {
                System.out.println("Ingrese al menos " + minimo + " palabra(s).");
            }
        } while (palabras.length < minimo);
        return palabras;
    }

    private char pedirCaracter() {
        String entrada;
        do {
            System.out.print("Ingrese el carácter: ");
            entrada = scanner.nextLine().trim();
            if (entrada.length() != 1) {
                System.out.println("Ingrese un solo carácter.");
            }
        } while (entrada.length() != 1);
        return entrada.charAt(0);
    }

    /** Con 4 o más palabras (2 nombres + 2 apellidos) el apellido es la tercera; si no, la segunda. */
    private int indiceApellido(String[] palabras) {
        return palabras.length >= 4 ? 2 : 1;
    }

    private String[] patronLetra(char letra) {
        if (letra >= 'A' && letra <= 'Z') {
            return FUENTE[letra - 'A'];
        }
        if (letra == 'Ñ') {
            return new String[] {"*****", "     ", "**  *", "* * *", "*  **"};
        }
        return new String[] {"*****", "*   *", "*   *", "*   *", "*****"};
    }

    private char[][] matrizVacia(int tamano) {
        char[][] matriz = new char[tamano][tamano];
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                matriz[i][j] = ' ';
            }
        }
        return matriz;
    }

    private void imprimirMatriz(char[][] matriz, String separador) {
        for (char[] fila : matriz) {
            StringBuilder linea = new StringBuilder();
            for (int j = 0; j < fila.length; j++) {
                linea.append(fila[j]);
                if (j < fila.length - 1) {
                    linea.append(separador);
                }
            }
            System.out.println(linea.toString().replaceAll("\\s+$", ""));
        }
        System.out.flush();
    }

    private boolean validarTamano(int n, int minimo) {
        if (n < minimo || n > N_MAX) {
            System.out.println("El tamaño debe estar entre " + minimo + " y " + N_MAX + ".");
            return false;
        }
        return true;
    }
}
