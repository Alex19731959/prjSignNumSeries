package pkgloading;

import java.util.Random;

public class LoadingExercises2 {

    private static final int NIVELES_MAX_SENAL = 50;
    private static final int MAX_LARGO_SENAL = 10;

    private static final String RESET = "\u001B[0m";
    private static final String ROJO = "\u001B[31m";
    private static final String VERDE = "\u001B[32m";
    private static final String AMARILLO = "\u001B[33m";
    private static final String AZUL = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    private static final String CIAN = "\u001B[36m";
    public static final String[] LISTA_COLORES = {ROJO, VERDE, AMARILLO, AZUL, MAGENTA, CIAN};

    private static final int MAX_LARGO_BARRAS = 60;
    private static final int MAX_ANCHO_BARRAS = 8;

    private static final int MAX_REPETICIONES_ANIMACION = 5;

    /**
     * Genera un arreglo de números aleatorios entre 0 y 10, que representan los niveles de la señal.
     * @return matriz Un arreglo de enteros con los niveles de la señal.
     */
    public int[] g2GenerarNumerosAleatoriosSenal(){
        int[] matriz = new int[NIVELES_MAX_SENAL];
        Random random = new Random();
        
        for (int i = 0; i < NIVELES_MAX_SENAL; i++){
            matriz[i] = random.nextInt(11);
        }

        for (int i = 0; i < NIVELES_MAX_SENAL; i++){
            System.out.print(matriz[i] + " ");
        }
        System.out.println();
        
        return matriz;
    }

    /**
     * Genera una representación visual de la señal utilizando caracteres y colores.
     * @param matriz Un arreglo de enteros con los niveles de la señal.
     */
    public void g2GenerarSenal(int[] matriz){
        int numeroEspacios;
        System.out.println();
        for (int i = 0; i < NIVELES_MAX_SENAL; i++){
            numeroEspacios = MAX_LARGO_SENAL - matriz[i];
            
            String colorActual = LISTA_COLORES[i % LISTA_COLORES.length];

            System.out.print(" ".repeat(numeroEspacios));
            System.out.print(colorActual + "-".repeat(matriz[i]) + RESET);
            System.out.print(CIAN + "|" + RESET);
            System.out.print(colorActual + "-".repeat(matriz[i]) + RESET);
            
            System.out.println();
        }
    }

    /**
     * Llama a los métodos g2GenerarNumerosAleatoriosSenal y g2GenerarSenal para generar e imprimir la señal simetrizada con colores.
     */
    public void g2ImprimirSenal() {
        System.out.println("\nEjercicio L11. Señal simetrizada con colores");
        LoadingExercises2 obj = new LoadingExercises2();
        int[] numeros = obj.g2GenerarNumerosAleatoriosSenal();
        obj.g2GenerarSenal(numeros);
    }
    
    /**
     * Genera un arreglo de números aleatorios entre 0 y 8, que representan la longitud de las barras sonoras.
     * @return matriz Un arreglo de enteros con la longitud de las barras sonoras.
     */
    public int[] g2GenerarNumerosAleatoriosBarras(){
        int[] matriz = new int[MAX_LARGO_BARRAS];
        Random random = new Random();
        
        for (int i = 0; i < MAX_LARGO_BARRAS; i++){
            matriz[i] = random.nextInt(9);
        }

        for (int i = 0; i < MAX_LARGO_BARRAS; i++){
            System.out.print(matriz[i] + " ");
        }
        System.out.println();
        
        return matriz;
    }

    /**
     * Genera una representación visual de barras sonoras utilizando caracteres "=".
     * @param matriz Un arreglo de enteros con la longitud de las barras sonoras.
     */
    public void g2GenerarBarras(int[] matriz){
        System.out.println();
        for (int i = MAX_ANCHO_BARRAS; i >= 1; i--) {
            for (int j = 0; j < MAX_LARGO_BARRAS; j++){
                if (matriz[j] >= i){
                System.out.print("= ");
                }
                else{
                System.out.print("  ");
                }
            }
        System.out.println();
        }
    }
    
    /**
     * Llama a los métodos g2GenerarNumerosAleatoriosBarras y g2GenerarBarras para generar e imprimir las barras sonoras de longitud aleatoria.
     */
    public void g2ImprimirBarras() {
        System.out.println("\nEjercicio L12. Barras sonoras de longitud aleatoria");
        LoadingExercises2 obj = new LoadingExercises2();
        int[] numeros = obj.g2GenerarNumerosAleatoriosBarras();
        obj.g2GenerarBarras(numeros);
    }

    /**
     * Mueve la figura en la consola, agregando espacios a la izquierda según el valor de "espacios".
     * @param figura
     * @param espacios
     */
    private void g2MovimientoFigura(String figura, int espacios) {
        System.out.print("\033[3;1H");

        String padding = " ".repeat(espacios);
        String[] lineas = figura.split("\n");
        
        for (String linea : lineas) {
            System.out.print("\033[K" + padding + linea + "\n");
        }
        System.out.flush();
    }

    /**
     * Genera una animación de la figura en movimiento, desplazándola hacia la derecha y luego hacia la izquierda.
     * @throws InterruptedException
     */
    public void g2AnimacionFigura() throws InterruptedException {
        String figura = """
                   \\|||/
                   (> <)        
                ooO-(_)-Ooo""";

        int maxEspacios = 25;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println();
        System.out.println("Ejercicio L13. Animación de figura en movimiento\n");
        for (int repeticiones = 0; repeticiones < MAX_REPETICIONES_ANIMACION; repeticiones++) {
            for (int i = 0; i <= maxEspacios; i++) {
                g2MovimientoFigura(figura, i);
                Thread.sleep(100);
            }
            
            for (int i = maxEspacios; i >= 0; i--) {
                g2MovimientoFigura(figura, i);
                Thread.sleep(100);
            }
        }
        
        System.out.println();
    }
}


