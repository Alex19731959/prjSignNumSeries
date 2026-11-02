package pkgfigures;

public class MixedFigures {

    private static final int N_DEFECTO = 10;
    private static final int N_MAX = 18;

    /**
     * Imprime un triángulo de Pascal modificado, donde los 1 se reemplazan por + y los 2 por *
     * @param n desde 1 a {@value #N_MAX}; fuera de rango se usa {@value #N_DEFECTO}
     */
    public void g2imprimirTrianguloPascalModificado (int n) {
        System.out.println("\nEjercicio F19. Triángulo de Pascal modificado");
        if (n > N_MAX || n < 1) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
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

}
