package pkgsequences;

public class NumericSeries1 {
    
    private static final int N_DEFECTO = 15;

    private static final int N_MAX_FIBONACCI = 45;
    private static final int N_MAX_SERIENUMERICA = 100;

    /**
     * Imprime la serie de fibonacci hasta n términos
     * @param n desde 1 a {@value #N_MAX_FIBONACCI}; fuera de rango se usa {@value #N_DEFECTO}
     */
    public void g2ImprimirFibonacci (int n){
        System.out.println("\nEjercicio SN01. Fibonacci");
        if (n > N_MAX_FIBONACCI || n < 1) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX_FIBONACCI
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
     * @param n desde 1 a {@value #N_MAX_SERIENUMERICA}; fuera de rango se usa {@value #N_DEFECTO}
     */
    public void g2ImprimirImparesAlternados(int n){
        System.out.println("\nEjercicio SN02. Impares alternados con cero");
        if (n > N_MAX_SERIENUMERICA || n < 1) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX_SERIENUMERICA
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
     * @param n desde 1 a {@value #N_MAX_FIBONACCI}; fuera de rango se usa {@value #N_DEFECTO}
     */
    public void g2ImprimirFibonacciSobreImpares(int n){
        System.out.println("\nEjercicio SN03. Fibonacci sobre impares");
        if (n > N_MAX_FIBONACCI || n < 1) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX_FIBONACCI
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
     * @param n desde 1 a {@value #N_MAX_FIBONACCI}; fuera de rango se usa {@value #N_DEFECTO}
     */
    public void g2ImprimirFibonacciSobrePares(int n){
        System.out.println("\nEjercicio SN04. Fibonacci sobre Pares");
        if (n > N_MAX_FIBONACCI || n < 1) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX_FIBONACCI
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
     * @param n desde 1 a {@value #N_MAX_SERIENUMERICA}; fuera de rango se usa {@value #N_DEFECTO}
     */
    public void g2ImprimirNumerosPrimos(int n){
        System.out.println("\nEjercicio SN05. Números primos");
        if (n > N_MAX_SERIENUMERICA || n < 1) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX_SERIENUMERICA
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
     * @param n desde 1 a {@value #N_MAX_SERIENUMERICA}; fuera de rango se usa {@value #N_DEFECTO}
     */
    public void g2ImprimirCuadradosPerfectos(int n){
        System.out.println("\nEjercicio SN06. Cuadrados perfectos");
        if (n > N_MAX_SERIENUMERICA || n < 1) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX_SERIENUMERICA
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
     * @param n desde 1 a {@value #N_MAX_SERIENUMERICA}; fuera de rango se usa {@value #N_DEFECTO}
     */
    public void g2ImprimirProgresionAritmetica1(int n){
        System.out.println("\nEjercicio SN07. Progresión Aritmética");
        if (n > N_MAX_SERIENUMERICA || n < 1) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX_SERIENUMERICA
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
     * @param n desde 1 a {@value #N_MAX_SERIENUMERICA}; fuera de rango se usa {@value #N_DEFECTO}
     */
    public void g2imprimirProgresion(int n) {
        System.out.println("\nEjercicio SN08. Progresión aritmética");
        if (n > N_MAX_SERIENUMERICA || n < 1) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX_SERIENUMERICA
                    + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(3 + 5 * i + " ");
        }
        System.out.println();
    }

    /**
     * Imprime los primeros n numeros de la serie de potencias de 2.
     * Donde el primer termino es 1, y cada termino siguiente es el doble del termino anterior.
     * @param n desde 1 a {@value #N_MAX_SERIENUMERICA}; fuera de rango se usa {@value #N_DEFECTO}
     */
    public void g2imprimirPotencias2(int n) {
        System.out.println("\nEjercicio SN09. Potencias de 2");
        if (n > N_MAX_SERIENUMERICA || n < 1) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX_SERIENUMERICA
                    + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print((int) Math.pow(2, i) + " ");
        }
        System.out.println();
    }

}
