package pkgfigures;

public class NumericFigures {

    private static final int N_DEFECTO = 10;
    private static final int N_MAX = 18;

    /**
     * Método que imprime un triángulo numérico descendente.
     * @param n Número de filas del triángulo.
     */

    public void g2imprimirNumTriangularDescendiente(int n){
        System.out.println("\nEjercicio F12. Triángulo Numérico Descendente");
        if (n > N_MAX || n < 1) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


    }

    /**
     * Método que imprime un triángulo numérico ascendente.
     * @param n Número de filas del triángulo.
     */

    public void g2imprimirNumTriangularAscendiente(int n) {
        System.out.println("\nEjercicio F13. Triángulo Numérico Ascendente");
        if (n > N_MAX || n < 1) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /**
     * Método que imprime el triángulo de Pascal.
     * @param n Número de filas del triángulo.
     */

    public void g2imprimirTrianguloPascal(int n) {
        System.out.println("\nEjercicio F14. Triángulo de Pascal");
        if (n > N_MAX || n < 1) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("   ");
            }

            int numero = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print("%-6d".formatted(numero));
                numero = numero * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    /**
     * Método que imprime el triángulo de Pascal acostado.
     * @param n Número de filas del triángulo.
     */

    public void g2imprimirTrianguloPascalAcostado(int n) {
        System.out.println("\nEjercicio F15. Triángulo de Pascal Acostado");
        if (n > N_MAX || n < 1) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }

        for (int i = 0; i < n; i++) {

            int numero = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print("%-5d".formatted(numero));
                numero = numero * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }


    /**
     * Método que imprime una X binaria.
     * @param n Número de filas y columnas de la X.
     */

    public void g2imprimirXBinaria(int n) {
        System.out.println("\nEjercicio F17. X Binaria");
        if (n > N_MAX || n < 1) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    if (i % 2 == 0) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                } else if (true){
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Método que imprime el triángulo de Pascal modificado.
     * @param n Número de filas del triángulo.
     */

    public void g2imprimirTrianguloPascalFila2(int n) {
        System.out.println("\nEjercicio F18. Triángulo de Pascal Modificado");
        if (n > N_MAX || n < 1) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }

        for (int i = 0; i < n; i++) {

            int variableTemporal1 = 1; 
            int variableTemporal2 = 0;

            for (int j = 0; j <= i; j++) {
                int numero;
                
                if (i == 0) {
                    numero = 2;
                } else {
                    numero = variableTemporal1 + 2 * variableTemporal2;
                }
                
                System.out.print("%-6d".formatted(numero));
                
                int temp = variableTemporal1;
                
                if (j < i) {
                    variableTemporal1 = variableTemporal1 * (i - 1 - j) / (j + 1);
                } else {
                    variableTemporal1 = 0;
                }
                
                variableTemporal2 = temp;
            }
            System.out.println();
        }

    }

    

}
