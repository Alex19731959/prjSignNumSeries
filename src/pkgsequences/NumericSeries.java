package pkgsequences;

public class NumericSeries {

    /**
     * Imprime una serie de numeros naturales compuesta unicamente por el numero 1.
     * Donde se repite el numero 1 de 1 a n veces, siendo n el numero ingresado por el usuario.
     * @param n 
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
