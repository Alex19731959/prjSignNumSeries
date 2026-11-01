package pkgsequences;

public class NumericSeries2 {

    private static final int N_DEFECTO = 15;

    private static final int N_MAX_REPUNIDADES = 30;
    private static final int N_MAX_LUCAS = 45;
    private static final int N_MAX_CRECIENTES = 100;
    private static final int N_MAX_ALTERNADOS = 100;
    private static final int N_MAX_SERIENUMERICA = 100;

    /**
     * Imprime los primeros n numeros de la serie de potencias de 3.
     * Donde el primer termino es 1, y cada termino siguiente es el triple del termino anterior.
     * @param n desde 1 a {@value #N_MAX_SERIENUMERICA}; fuera de rango se usa {@value #N_DEFECTO}
     */
    public void g2imprimirPotencias3(int n) {
        System.out.println("\nEjercicio SN10. Potencias de 3");
        if (n > N_MAX_SERIENUMERICA || n < 0) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX_SERIENUMERICA
                    + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print((int) Math.pow(3, i) + " ");
        }
        System.out.println();
    }

    /**  
     * Imprime los primeros n numeros de la serie de numeros oblongos.
     * Donde el primer termino es 2, y cada termino siguiente es el producto del termino anterior y su posicion en la serie.
     * @param n desde 1 a {@value #N_MAX_SERIENUMERICA}; fuera de rango se usa {@value #N_DEFECTO}    
     */
    public void g2imprimirNumOblongos(int n) {
        System.out.println("\nEjercicio SN11. Números oblongos");
        if (n > N_MAX_SERIENUMERICA || n < 0) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX_SERIENUMERICA
                    + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(i * (i + 1) + " ");
        }
        System.out.println();
    }

    /**
     * Imprime los primeros n numeros de la serie de numeros triangulares.
     * @param n desde 1 a {@value #N_MAX_SERIENUMERICA}; fuera de rango se usa {@value #N_DEFECTO}
     */
    public void g2imprimirNumTriangulares(int n){
        System.out.println("\nEjercicio SN12. Triangulares");
        if (n > N_MAX_SERIENUMERICA || n < 0) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX_SERIENUMERICA
                    + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        int temporal = 0;
        for (int i = 1; i <= n; i++) {
            temporal = temporal + i;
            System.out.print(temporal + " ");
        }
        System.out.println();
    }

    /**  
     * Imprime los primeros n numeros de la serie de factoriales.
     * Donde el primer termino es 1, y cada termino siguiente es el producto del
     * termino anterior y su posicion en la serie.
     * @param n desde 1 a {@value #N_MAX_SERIENUMERICA}; fuera de rango se usa {@value #N_DEFECTO}
     */
    public void g2impimirFactoriales(int n){
        System.out.println("\nEjercicio SN13. Factoriales");
        if (n > N_MAX_SERIENUMERICA || n < 0) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX_SERIENUMERICA
                    + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        int temporal = 1;
        for (int i = 1; i <= n; i++) {
            temporal = temporal * i;
            System.out.print(temporal + " ");
        }
        System.out.println();
    }

    /**
     * Imprime los primeros n numeros de la serie de signos alternos.
     * Donde los numeros en posiciones impares son positivos y los numeros en posiciones pares son negativos.
     * @param n desde 1 a {@value #N_MAX_SERIENUMERICA}; fuera de rango se usa {@value #N_DEFECTO}
     */
    public void g2imprimirSignosAlternos(int n) {
        System.out.println("\nEjercicio SN14. Signos alternos");
        if (n > N_MAX_SERIENUMERICA || n < 0) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX_SERIENUMERICA
                    + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(-i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    /**
     * Imprime los primeros n numeros de la serie de cuadrados desplazados.
     * @param n desde 1 a {@value #N_MAX_SERIENUMERICA}; fuera de rango se usa {@value #N_DEFECTO}
     */
    public void g2imprimirCuadradosDesplazados(int n) {
        System.out.println("\nEjercicio SN15. Cuadrados desplazados");
        if (n > N_MAX_SERIENUMERICA || n < 0) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX_SERIENUMERICA
                    + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        int resultado = 0;
        for (int i = 0; i < n; i++) {
            resultado = 2 * i * i;
            System.out.print(resultado + " ");
        }
        System.out.println();
    }

    /**
     * Imprime las primeras n repunidades (1, 11, 111, ...).
     * @param n número de términos (1 a {@value #N_MAX_REPUNIDADES}); fuera de rango se usa {@value #N_DEFECTO}.
     */
    public void g2imprimirRepunidades(int n) {
        System.out.println("\nEjercicio SN16. Repunidades");
        if (n > N_MAX_REPUNIDADES || n <= 0) {
            System.out.println("El método acepta únicamente un parámetro n entre 1 y " + N_MAX_REPUNIDADES
                    + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("1");
                }
                System.out.print("  ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("1");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    /**
     * Imprime los primeros n números de Lucas (2, 1, 3, 4, 7, ...).
     * @param n número de términos (1 a {@value #N_MAX_LUCAS}); fuera de rango se usa {@value #N_DEFECTO}.
     */
    public void g2imprimirNumerosLucas(int n) {
        int antecedente1 = 2;
        int antecedente2 = 1;
        int numeroActual;
        System.out.println("\nEjercicio SN17. Números de Lucas");
        if (n < 1 || n > N_MAX_LUCAS) {
            System.out.println("El método acepta únicamente un parámetro n entre 1 y " + N_MAX_LUCAS
                    + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        if (n == 1) {
            System.out.print(antecedente1);
        }
        if (n == 2) {
            System.out.print(antecedente1 + " " + antecedente2);
        }
        if (n > 2) {
            System.out.print(antecedente1 + " " + antecedente2);
            for (int i = 3; i <= n; i++) {
                numeroActual = antecedente1 + antecedente2;
                System.out.print(" " + numeroActual);
                antecedente1 = antecedente2;
                antecedente2 = numeroActual;
            }
        }
        System.out.println();
    }

    /**
     * Imprime los primeros n números crecientes (1, 2, 4, 7, 11, ...).
     * @param n número de términos (1 a {@value #N_MAX_CRECIENTES}); fuera de rango se usa {@value #N_DEFECTO}.
     */
    public void g2imprimirNumerosCrecientes(int n) {
        int numeroActual = 1;
        System.out.println("\nEjercicio SN18. Números Crecientes");
        if (n < 1 || n > N_MAX_CRECIENTES) {
            System.out.println("El método acepta únicamente un parámetro n entre 1 y " + N_MAX_CRECIENTES
                    + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        for (int i = 0; i < n; i++) {
            numeroActual = numeroActual + i;
            System.out.print(numeroActual + " ");
        }
        System.out.println();
    }

    /**
     * Imprime los primeros n números alternados (posición impar al cuadrado, par al cubo).
     * @param n número de términos (1 a {@value #N_MAX_ALTERNADOS}); fuera de rango se usa {@value #N_DEFECTO}.
     */
    public void g2imprimirNumerosAlternados(int n) {
        System.out.println("\nEjercicio SN19. Números Alternados");
        if (n < 1 || n > N_MAX_ALTERNADOS) {
            System.out.println("El método acepta únicamente un parámetro n entre 1 y " + N_MAX_ALTERNADOS
                    + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                double resultado = Math.pow(i, 3);
                System.out.print((int) resultado + " ");
            } else {
                double resultado = Math.pow(i, 2);
                System.out.print((int) resultado + " ");
            }
        }
        System.out.println();
    }

}
