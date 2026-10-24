package pkgsequences;

import java.util.Scanner;

public class NumericSeries {

    /**
     * Imprime una serie de numeros naturales compuesta unicamente por el numero 1.
     * Donde se repite el numero 1 de 1 a n veces, siendo n el numero ingresado por el usuario.
    */
    public void imprimirRepunidades () {
        int numeroIngresado;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        numeroIngresado = sc.nextInt();
        for (int i = 1; i <= numeroIngresado; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("1");
            }
            System.out.print("  ");
        }
        System.out.println();
    }

    /**
     * Imprime los primeros n numeros de la serie de Lucas.
     */
    public void imprimirNumerosLucas(){
        int antecedente1 = 2;
        int antecedente2 = 1;
        int numeroActual;
        int numeroIngresado;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        numeroIngresado = sc.nextInt();
        if (numeroIngresado == 1) {
            System.out.print(antecedente1);
        } 
        if (numeroIngresado == 2) {
            System.out.print(antecedente1 + " " + antecedente2);
        }
        if (numeroIngresado > 2) {
            System.out.print(antecedente1 + " " + antecedente2);
            for (int i = 3; i <= numeroIngresado; i++) {
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
     */
    public void imprimirNumerosCrecientes(){
        int numeroIngresado;
        int numeroActual = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        numeroIngresado = sc.nextInt();
        for (int i = 0; i < numeroIngresado; i++) {
            numeroActual = numeroActual + i;
            System.out.print(numeroActual + " ");
        }
        System.out.println();
    }

    /**
     * Imprime los primeros n numeros de la serie de numeros alternados.
     * Donde los numeros en posiciones impares son elevados al cuadrado y los numeros en posiciones pares son elevados al cubo.
     */
    public void imprimirNumerosAlternados(){
        int numeroIngresado;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        numeroIngresado = sc.nextInt();
        for (int i = 1; i <= numeroIngresado; i++) {
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
