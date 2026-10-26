package pkgsequences;

public class NumericSeries {
    
    private static final int N_DEFECTO = 15;

    private static final int N_MAX_REPUNIDADES = 30;
    private static final int N_MAX_LUCAS = 45;
    private static final int N_MAX_CRECIENTES = 100;
    private static final int N_MAX_ALTERNADOS = 100;
    private static final int N_MAX_FIBONACCI = 47;
    private static final int N_MAX_LIMITESERIE = 100;

    /**
     * Imprime la serie de fibonacci hasta n términos
     * @param n número de términos de (1 a {@value #N_MAX_FIBONACCI}); fuera de rango se usa {@value #N_DEFECTO}.
     */
    public void g2ImprimirFibonacci (int n){
        System.out.println("\nEjercicio SN01. Fibonacci");
        if (n < 1 || n > N_MAX_FIBONACCI) {
            System.out.println("El método acepta únicamente un parámetro n entre 1 y " + N_MAX_FIBONACCI
                    + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        int a=0, b=1, fibonacci;
        for(int i=0; i<n; i++)
            {
                if(i==0)fibonacci=a;
                else if(i==1)fibonacci=b;
                else{
                    fibonacci = a+b;
                    a=b;
                    b=fibonacci;
                }
                System.out.print(fibonacci + " ");
            }
        System.out.println(); 
    }

    /**
     * Imprime los números impares alternados con 0
     * @param n número de términos de (1 a {@value #N_MAX_LIMITESERIE}); fuera de rango se usa {@value #N_DEFECTO}.
     */
    public void g2ImprimirImparesAlternados(int n){
        System.out.println("\nEjercicio SN02. Impares alternados con cero");
        if (n < 1 || n > N_MAX_LIMITESERIE) {
            System.out.println("El método acepta únicamente un parámetro n entre 1 y " + N_MAX_LIMITESERIE
                    + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        for(int i=1; i<=n; i++){
            System.out.print(i%2==0?"0 ":i + " ");
        }
        System.out.println();
    }

    /**
     * Imprime los primeros n números de secuencia de Fibonacci sobre números impares
     * @param n número de términos de (1 a {@value #N_MAX_FIBONACCI}); fuera de rango se usa {@value #N_DEFECTO}.
     */
    public void g2ImprimirFibonacciSobreImpares(int n){
        System.out.println("\nEjercicio SN03. Fibonacci sobre impares");
        if (n < 1 || n > N_MAX_FIBONACCI) {
            System.out.println("El método acepta únicamente un parámetro n entre 1 y " + N_MAX_FIBONACCI
                    + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        int a=0, b=1, fibonacci, impar;
        for (int i=1; i<=n; i++){
            if(i==1) fibonacci=0;
            else if(i==2) fibonacci=1;
            else{
                fibonacci = a+b;
                a=b;
                b=fibonacci;
            }
            impar = (i*2)-1;
            System.out.print(fibonacci + "/" + impar + " ");
        }
        System.out.println();
    }

    /**
     * Imprime los primeros n números de secuencia de Fibonacci sobre números impares
     * @param n número de términos de (1 a {@value #N_MAX_FIBONACCI}); fuera de rango se usa {@value #N_DEFECTO}.
     */
    public void g2ImprimirFibonacciSobrePares(int n){
        System.out.println("\nEjercicio SN04. Fibonacci sobre Pares");
        if (n < 1 || n > N_MAX_FIBONACCI) {
            System.out.println("El método acepta únicamente un parámetro n entre 1 y " + N_MAX_FIBONACCI
                    + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        int a=0, b=1, fibonacci, par;
        for (int i=1; i<=n; i++){
            if(i==1) fibonacci=0;
            else if(i==2) fibonacci=1;
            else{
                fibonacci = a+b;
                a=b;
                b=fibonacci;
            }
            par = i*2;
            System.out.print(fibonacci + "/" + par + " ");
        }
        System.out.println();
    }

    /**
     * Imprime los primeros n números primos
     * @param n número de términos de (1 a {@value #N_MAX_LIMITESERIE}); fuera de rango se usa {@value #N_DEFECTO}.
     */
    public void g2ImprimirNumerosPrimos(int n){
        System.out.println("\nEjercicio SN05. Números primos");
        if (n < 1 || n > N_MAX_LIMITESERIE) {
            System.out.println("El método acepta únicamente un parámetro n entre 1 y " + N_MAX_LIMITESERIE
                    + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        int esPrimo, contadorPrimos=0, num=2; 
        while(contadorPrimos < n){
            esPrimo=1;
            for(int i=2; i*i<=num; i++){
                if(num%i==0)
                {
                    esPrimo=0;
                    break;
                }
            }
            if(esPrimo==1){
                System.out.print(num + " ");
                contadorPrimos++;
            }
            num++;
        }
        System.out.println();
    }
    
    /**
     * Imprime los primeros n números que son cuadrados perfectos
     * @param n número de términos de (1 a {@value #N_MAX_LIMITESERIE}); fuera de rango se usa {@value #N_DEFECTO}.
     */
    public void g2ImprimirCuadradosPerfectos(int n){
        System.out.println("\nEjercicio SN06. Cuadrados perfectos");
        if (n < 1 || n > N_MAX_LIMITESERIE) {
            System.out.println("El método acepta únicamente un parámetro n entre 1 y " + N_MAX_LIMITESERIE
                    + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        for(int i=1; i<=n; i++)
        {
            System.out.print(i*i + " ");
        }
        System.out.println();
    }

    /**
     * Imprime la progresion aritmética +3 desde 1
     * @param n número de términos de (1 a {@value #N_MAX_LIMITESERIE}); fuera de rango se usa {@value #N_DEFECTO}.
     */
    public void g2ImprimirProgresionAritmetica1(int n){
        System.out.println("\nEjercicio SN07. Progresión Aritmética");
        if (n < 1 || n > N_MAX_LIMITESERIE) {
            System.out.println("El método acepta únicamente un parámetro n entre 1 y " + N_MAX_LIMITESERIE
                    + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        int num=1, i=1;
        do{
            System.out.print(num + " ");
            num+=3;
            i++;
        }while(i<=n);
        System.out.println();
    }

    /**
     * Imprime los primeros n numeros de la serie de progresion aritmetica.
     * Donde el primer termino es 3, y cada termino siguiente es la suma del termino anterior y 5.
     * @param n numero de terminos de la serie a imprimir.
     */
    public void g2imprimirProgresion(int n) {
        System.out.println("\nEjercicio SN08. Progresión aritmética");
        for (int i = 0; i < n; i++) {
            System.out.print(3 + 5 * i + " ");
        }
        System.out.println();
    }

    /**
     * Imprime los primeros n numeros de la serie de potencias de 2.
     * Donde el primer termino es 1, y cada termino siguiente es el doble del termino anterior.
     * @param n numero de terminos de la serie a imprimir.
     */
    public void g2imprimirPotencias2(int n) {
        System.out.println("\nEjercicio SN09. Potencias de 2");
        for (int i = 1; i <= n; i++) {
            System.out.print( (int) Math.pow(2, i) + " ");
        }
        System.out.println();
    }

    /**
     * Imprime los primeros n numeros de la serie de potencias de 3.
     * Donde el primer termino es 1, y cada termino siguiente es el triple del termino anterior.
     * @param n numero de terminos de la serie a imprimir.
     */

    public void g2imprimirPotencias3(int n) {
        System.out.println("\nEjercicio SN10. Potencias de 3");
        for (int i = 1; i <= n; i++) {
            System.out.print( (int) Math.pow(3, i) + " ");
        }
        System.out.println();
    }

    /**  
    * Imprime los primeros n numeros de la serie de numeros oblongos.
    * Donde el primer termino es 2, y cada termino siguiente es el producto del termino anterior y su posicion en la serie.
    * @param n numero de terminos de la serie a imprimir.    
    */

    public void g2imprimirNumOblongos(int n) {
        System.out.println("\nEjercicio SN11. Números oblongos");
        for (int i = 1; i <= n; i++) {
            System.out.print(i * (i + 1) + " ");
        }
        System.out.println();
    }

    /**
     * Imprime los primeros n numeros de la serie de numeros triangulares.
     * @param n numero de terminos de la serie a imprimir.
     */
    public void g2imprimirNumTriangulares(int n){
        System.out.println("\nEjercicio SN12. Triangulares");
        int temporal = 0;
        for (int i = 1; i <= n; i++) {
            temporal = temporal + i;
            System.out.print(temporal + " ");
        }
        System.out.println();
    }

    /*  
    * Imprime los primeros n numeros de la serie de factoriales.
    * Donde el primer termino es 1, y cada termino siguiente es el producto del
    * termino anterior y su posicion en la serie.
    * @param n numero de terminos de la serie a imprimir.
    */
    public void g2impimirFactoriales(int n){
        System.out.println("\nEjercicio SN13. Factoriales");
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
     * @param n numero de terminos de la serie a imprimir.
     */
    public void g2imprimirSignosAlternos(int n) {
        System.out.println("\nEjercicio SN14. Signos alternos");
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
     * @param n numero de terminos de la serie a imprimir.
     */
    public void g2imprimirCuadradosDesplazados(int n) {
        System.out.println("\nEjercicio SN15. Cuadrados desplazados");
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
