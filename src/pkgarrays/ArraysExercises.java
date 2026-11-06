package pkgarrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArraysExercises {
    public static final int N_MAX = 50;
    private static final int DELAY_MS = 120;

    private static final String[] LETRAS = {
        "TLRM", "TMBLr", "TBL", "TBLr", "TMBL", "TML", "TBLd", "LRM", "TBC", "RBb",
        "Luv", "LB", "LRwu", "LR\\", "TBLR", "TMLc", "TBLRv", "TMLcv", "TMBad", "TC",
        "LRB", "pq", "LRvx", "\\/", "wue", "TB/"
    };

    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();

    /**
     * A01) Pide el nombre completo y un porcentaje de carga por cada palabra.
     * Guarda las palabras y los porcentajes en dos arrays y dibuja una barra
     * de carga por palabra, mostrando las letras que alcanza ese porcentaje.
     *
     * @param n Cantidad de posiciones de cada barra (entre 1 y N_MAX).
     */
    public void g2imprimirArrayCargaNombre(int n) {
        System.out.println("\nEjercicio A01. Porcentaje de Carga por Palabra del Nombre");
        if (!validarTamano(n, 1)) {
            return;
        }

        String[] palabras = pedirPalabras("Ingrese su nombre completo: ", 1);
        int[] porcentajes = pedirPorcentajes(palabras.length);

        System.out.println(String.join(" ", palabras));
        System.out.println();
        for (int i = 0; i < palabras.length; i++) {
            int llenas = (int) Math.round(porcentajes[i] * n / 100.0);
            String barra = "";
            for (int j = 0; j < n; j++) {
                if (j < llenas - 1) {
                    barra += "=";
                } else if (j == llenas - 1) {
                    barra += ">";
                } else {
                    barra += " ";
                }
            }
            int letras = palabras[i].length() * porcentajes[i] / 100;
            System.out.printf("[%s] %3d%% %s%n", barra, porcentajes[i], palabras[i].substring(0, letras));
        }
    }

    /**
     * A02) Pide nombre y apellido y un carácter, y dibuja las dos iniciales
     * en una matriz. Cada letra ocupa un cuadrado de n x n y se forma con
     * segmentos (filas, columnas y diagonales) descritos en LETRAS. Entre los
     * dos cuadrados hay 3 columnas de separación.
     *
     * @param n Tamaño del lado de cada letra (entre 4 y N_MAX).
     */
    public void g2imprimirMatrizIniciales(int n) {
        System.out.println("\nEjercicio A02. Iniciales de Nombre y Apellido");
        if (!validarTamano(n, 4)) {
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
        char[][] matriz = matrizVacia(n, 2 * n + separacion);
        for (int k = 0; k < iniciales.length; k++) {
            int desplazamiento = k * (n + separacion);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (celdaDeLetra(iniciales[k], i, j, n)) {
                        matriz[i][desplazamiento + j] = caracter;
                    }
                }
            }
        }
        imprimirMatriz(matriz, "");
    }

    /**
     * A03) Pide el nombre y dibuja un plano de coordenadas positivo. La letra
     * número k del nombre se coloca en la fila k, a 2 * k columnas del eje,
     * formando la recta f(x) = 2x.
     *
     * @param n No se usa: la altura del plano es la cantidad de letras del nombre.
     */
    public void g2imprimirPlanoCoordenadas(int n) {
        System.out.println("\nEjercicio A03. Plano de Coordenadas Positivo f(x) = 2x");
        String texto = String.join("", pedirPalabras("Ingrese su nombre: ", 1));
        if (texto.length() > N_MAX) {
            System.out.println("Ingrese máximo " + N_MAX + " letras.");
            return;
        }

        int alto = texto.length();
        int digitos = String.valueOf(alto).length();
        System.out.println();
        for (int y = alto; y >= 1; y--) {
            System.out.printf("%" + digitos + "d |", y);
            for (int k = 0; k < 2 * y; k++) {
                System.out.print(" ");
            }
            System.out.println(texto.charAt(y - 1));
        }
        System.out.printf("%" + digitos + "d |", 0);
        for (int k = 0; k < 2 * alto + 2; k++) {
            System.out.print("_");
        }
        System.out.println();
    }

    /**
     * A04) Pide nombre y apellido y forma una X en una matriz cuadrada: el
     * nombre va en la diagonal principal y el apellido en la diagonal
     * secundaria. Si las dos letras coinciden en una celda se pone '*'.
     *
     * @param n No se usa: el tamaño de la matriz es la palabra más larga.
     */
    public void g2imprimirMatrizXNombreApellido(int n) {
        System.out.println("\nEjercicio A04. Forma de X con Nombre y Apellido");
        String[] palabras = pedirPalabras("Ingrese su nombre y apellido: ", 2);
        String nombre = palabras[0];
        String apellido = palabras[indiceApellido(palabras)];

        int tamano = Math.max(nombre.length(), apellido.length());
        char[][] matriz = matrizVacia(tamano, tamano);
        for (int i = 0; i < nombre.length(); i++) {
            matriz[i][i] = nombre.charAt(i);
        }
        for (int i = 0; i < apellido.length(); i++) {
            int j = tamano - 1 - i;
            if (matriz[i][j] == ' ') {
                matriz[i][j] = apellido.charAt(i);
            } else {
                matriz[i][j] = '*';
            }
        }
        System.out.println();
        imprimirMatriz(matriz, " ");
    }

    /**
     * A05) Pide los nombres y apellidos completos y crea una matriz cuadrada
     * del tamaño de la palabra más larga. El nombre va en la diagonal
     * principal, el apellido en la secundaria y las demás palabras en una
     * fila al azar. Las letras se colocan en orden aleatorio y, si dos caen
     * en la misma celda, se pone '*'. Después de cada letra se espera un
     * delay y se redibuja la matriz subiendo el cursor con el código ANSI
     * "ESC[nA".
     *
     * @param n No se usa: el tamaño de la matriz es la palabra más larga.
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

        List<int[]> posiciones = new ArrayList<>();
        for (int i = 0; i < palabras[0].length(); i++) {
            posiciones.add(new int[] {i, i, palabras[0].charAt(i)});
        }
        for (int i = 0; i < palabras[apellido].length(); i++) {
            posiciones.add(new int[] {i, tamano - 1 - i, palabras[apellido].charAt(i)});
        }
        for (int p = 1; p < palabras.length; p++) {
            if (p != apellido) {
                int fila = random.nextInt(tamano);
                int inicio = random.nextInt(tamano - palabras[p].length() + 1);
                for (int i = 0; i < palabras[p].length(); i++) {
                    posiciones.add(new int[] {fila, inicio + i, palabras[p].charAt(i)});
                }
            }
        }
        Collections.shuffle(posiciones, random);

        char[][] matriz = matrizVacia(tamano, tamano);
        System.out.println();
        imprimirMatriz(matriz, " ");
        for (int[] posicion : posiciones) {
            int fila = posicion[0];
            int columna = posicion[1];
            if (matriz[fila][columna] == ' ') {
                matriz[fila][columna] = (char) posicion[2];
            } else {
                matriz[fila][columna] = '*';
            }
            System.out.print("\u001B[" + tamano + "A");
            imprimirMatriz(matriz, " ");
            try {
                Thread.sleep(DELAY_MS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    /**
     * Pide una línea de texto y la separa en palabras. Repite la pregunta
     * hasta recibir la cantidad mínima de palabras.
     *
     * @param mensaje Texto que se muestra al pedir los datos.
     * @param minimo Cantidad mínima de palabras que se aceptan.
     * @return Arreglo con las palabras ingresadas.
     */
    private String[] pedirPalabras(String mensaje, int minimo) {
        String[] palabras;
        do {
            System.out.print(mensaje);
            String linea = scanner.nextLine().trim();
            if (linea.isEmpty()) {
                palabras = new String[0];
            } else {
                palabras = linea.split("\\s+");
            }
            if (palabras.length < minimo) {
                System.out.println("Ingrese al menos " + minimo + " palabra(s).");
            }
        } while (palabras.length < minimo);
        return palabras;
    }

    /**
     * Pide un porcentaje (entero entre 0 y 100) por cada palabra, todos en
     * la misma línea separados por espacios. Repite la pregunta si algún
     * dato no es válido.
     *
     * @param cantidad Cantidad de porcentajes que se esperan.
     * @return Arreglo con los porcentajes ingresados.
     */
    private int[] pedirPorcentajes(int cantidad) {
        int[] porcentajes = new int[cantidad];
        boolean valido;
        do {
            valido = true;
            System.out.print("Ingrese el porcentaje de carga (" + cantidad + " valores entre 0 y 100): ");
            String[] valores = scanner.nextLine().trim().split("\\s+");
            if (valores.length != cantidad) {
                valido = false;
            }
            for (int i = 0; i < cantidad && valido; i++) {
                try {
                    porcentajes[i] = Integer.parseInt(valores[i]);
                    valido = porcentajes[i] >= 0 && porcentajes[i] <= 100;
                } catch (NumberFormatException e) {
                    valido = false;
                }
            }
            if (!valido) {
                System.out.println("Porcentajes no válidos, inténtelo de nuevo.");
            }
        } while (!valido);
        return porcentajes;
    }

    /**
     * Pide un único carácter. Repite la pregunta hasta que se ingrese
     * exactamente uno.
     *
     * @return El carácter ingresado.
     */
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

    /**
     * Indica qué posición del arreglo es el apellido: con 4 o más palabras
     * (2 nombres y 2 apellidos) es la tercera; en otro caso, la segunda.
     *
     * @param palabras Palabras del nombre completo.
     * @return Posición del apellido dentro del arreglo.
     */
    private int indiceApellido(String[] palabras) {
        if (palabras.length >= 4) {
            return 2;
        }
        return 1;
    }

    /**
     * Crea una matriz de caracteres llena de espacios en blanco.
     *
     * @param filas Cantidad de filas.
     * @param columnas Cantidad de columnas.
     * @return Matriz de filas x columnas con espacios.
     */
    private char[][] matrizVacia(int filas, int columnas) {
        char[][] matriz = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = ' ';
            }
        }
        return matriz;
    }

    /**
     * Imprime una matriz de caracteres, una fila por línea.
     *
     * @param matriz Matriz que se va a imprimir.
     * @param separador Texto que se pone entre un carácter y el siguiente.
     */
    private void imprimirMatriz(char[][] matriz, String separador) {
        for (int i = 0; i < matriz.length; i++) {
            String linea = "";
            for (int j = 0; j < matriz[i].length; j++) {
                linea += matriz[i][j];
                if (j < matriz[i].length - 1) {
                    linea += separador;
                }
            }
            System.out.println(linea);
        }
    }

    /**
     * Indica si una celda de la letra debe dibujarse. La celda se dibuja si
     * cumple alguno de los segmentos que forman esa letra en LETRAS. Si el
     * carácter no es una letra de A a Z se dibuja un cuadro (TBLR).
     *
     * @param letra Letra en mayúscula que se quiere dibujar.
     * @param i Fila de la celda dentro del cuadrado.
     * @param j Columna de la celda dentro del cuadrado.
     * @param n Tamaño del lado del cuadrado.
     * @return true si la celda forma parte de la letra.
     */
    private boolean celdaDeLetra(char letra, int i, int j, int n) {
        String segmentos = "TBLR";
        if (letra >= 'A' && letra <= 'Z') {
            segmentos = LETRAS[letra - 'A'];
        }
        for (int k = 0; k < segmentos.length(); k++) {
            if (celdaDeSegmento(segmentos.charAt(k), i, j, n)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Indica si una celda pertenece a un segmento. Segmentos: T fila de
     * arriba, M fila del medio, B fila de abajo, L columna izquierda, R
     * columna derecha, C columna del medio, a/b mitad superior/inferior de la
     * columna izquierda, c/d mitad superior/inferior de la columna derecha,
     * r columna derecha sin las esquinas, e mitad inferior de la columna del
     * medio, \ y / diagonales completas, w/v mitad superior/inferior de \,
     * u/x mitad superior/inferior de /, p y q diagonales que bajan al centro.
     *
     * @param segmento Código del segmento.
     * @param i Fila de la celda dentro del cuadrado.
     * @param j Columna de la celda dentro del cuadrado.
     * @param n Tamaño del lado del cuadrado.
     * @return true si la celda está en el segmento.
     */
    private boolean celdaDeSegmento(char segmento, int i, int j, int n) {
        int mitad = n / 2;
        return switch (segmento) {
            case 'T' -> i == 0;
            case 'M' -> i == mitad;
            case 'B' -> i == n - 1;
            case 'L' -> j == 0;
            case 'R' -> j == n - 1;
            case 'C' -> j == mitad;
            case 'a' -> j == 0 && i <= mitad;
            case 'b' -> j == 0 && i >= mitad;
            case 'c' -> j == n - 1 && i <= mitad;
            case 'd' -> j == n - 1 && i >= mitad;
            case 'r' -> j == n - 1 && i > 0 && i < n - 1;
            case 'e' -> j == mitad && i >= mitad;
            case '\\' -> i == j;
            case '/' -> i + j == n - 1;
            case 'w' -> i == j && i <= mitad;
            case 'u' -> i + j == n - 1 && i <= mitad;
            case 'v' -> i == j && i >= mitad;
            case 'x' -> i + j == n - 1 && i >= mitad;
            case 'p' -> j == i * mitad / (n - 1);
            case 'q' -> j == n - 1 - i * mitad / (n - 1);
            default -> false;
        };
    }

    /**
     * Comprueba que n esté dentro del rango permitido e informa si no lo está.
     *
     * @param n Valor que se quiere validar.
     * @param minimo Valor mínimo permitido.
     * @return true si n está entre minimo y N_MAX; false en caso contrario.
     */
    private boolean validarTamano(int n, int minimo) {
        if (n < minimo || n > N_MAX) {
            System.out.println("El tamaño debe estar entre " + minimo + " y " + N_MAX + ".");
            return false;
        }
        return true;
    }
}
