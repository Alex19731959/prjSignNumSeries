package pkgsequences;

public class NumericSeries {
    
    /**
     * Imprime la serie de fibonacci hasta n términos
     * @param n
     */
    public void g2ImprimirFibonacci (int n){
        System.out.println("\nEjercicio SN01. Fibonacci");
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
     * @param n
     */
    public void g2ImprimirImparesAlternados(int n){
        System.out.println("\nEjercicio SN02. Impares alternados con cero");
        for(int i=1; i<=n; i++){
            System.out.print(i%2==0?"0 ":i + " ");
        }
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
     * Imprime una serie de numeros naturales compuesta unicamente por el numero 1.
     * Donde se repite el numero 1 de 1 a n veces, siendo n el numero ingresado por el usuario.
     * @param n numero de repeticiones del numero 1 en la serie.
    */
    public void g2imprimirRepunidades (int n) {
        System.out.println("\nEjercicio SN16. Repunidades");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("1");
            }
            System.out.print("  ");
        }
        System.out.println();
    }

    /**
     * Imprime los primeros n numeros de la serie de Lucas.
     * @param n 
     */
    public void g2imprimirNumerosLucas(int n){
        int antecedente1 = 2;
        int antecedente2 = 1;
        int numeroActual;
        System.out.println("\nEjercicio SN17. Números de Lucas");
        if (n == 1) {
            System.out.print(antecedente1);
        } 
        if (n== 2) {
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
     * Imprime los primeros n numeros de la serie de numeros crecientes.
     * Donde el primer termino es 1, y cada termino siguiente es la suma del termino anterior y su posicion en la serie.
     * @param n
     */
    public void g2imprimirNumerosCrecientes(int n){
        int numeroActual = 1;
        System.out.println("\nEjercicio SN18. Números Crecientes");
        for (int i = 0; i < n; i++) {
            numeroActual = numeroActual + i;
            System.out.print(numeroActual + " ");
        }
        System.out.println();
    }

    /**
     * Imprime los primeros n numeros de la serie de numeros alternados.
     * Donde los numeros en posiciones impares son elevados al cuadrado y los numeros en posiciones pares son elevados al cubo.
     * @param n 
     */
    public void g2imprimirNumerosAlternados(int n){
        System.out.println("\nEjercicio SN19. Números Alternados");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                double resultado = Math.pow(i, 3);
                System.out.print((int)resultado + " ");
            } else {
                double resultado = Math.pow(i, 2);
                System.out.print((int)resultado + " ");
            }
        }
        System.out.println();
    }
    
    

}
