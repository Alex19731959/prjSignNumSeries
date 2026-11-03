package pkgfigures;

public class MixedFigures {

    private static final int N_DEFECTO = 10;
    private static final int N_MAX = 18;

    /**
     * Método que genera la matriz que representa el triángulo de Pascal modificado
     * @param n número de filas del triángulo
     * @return matriz que representa el triángulo de Pascal modificado
    */
    public int[][] g2GenerarTrianguloPascalModificado (int n) {
        int [][] matriz = new int[n][n];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 ) {
                    matriz[i][j] = 1;
                }
                else if (j == i) {
                    matriz[i][j] = 2;
                } 
                else {
                    matriz[i][j] = matriz[i - 1][j - 1] + matriz[i - 1][j];
                }
            }
        }
        return matriz;
    }

    /**
     * Método que imprime el triángulo de Pascal modificado a partir de la matriz generada
     * @param matriz
     * @param n
     * @return void
     */
    public void g2ImprimirTrianguloPascalModificado(int[][] matriz, int n) {
        System.out.println();
        System.out.println("*");
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                switch (matriz[i][j]){
                    case 1 -> System.out.print ("+\t");
                    case 2 -> System.out.print ("*\t");
                    default -> System.out.print(matriz[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

    /**
     * Método que ejecuta el triángulo de Pascal modificado, usando los métodos g2GenerarTrianguloPascalModificado y g2ImprimirTrianguloPascalModificado
     * @param n
     * @return void
     */
    public void g2EjecutarTrianguloPascalModificado(int n) {
        System.out.println("\nEjercicio F19. Triángulo de Pascal modificado");
        if (n > N_MAX || n < 1) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        int[][] matriz = g2GenerarTrianguloPascalModificado(n);
        g2ImprimirTrianguloPascalModificado(matriz, n);

    }

}
