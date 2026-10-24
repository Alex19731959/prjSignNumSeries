package pkgsequences;

import java.util.Scanner;

public class OperatorSeries {

    /**
     * Imprime una serie de numeros naturales compuesta unicamente por el caracter "*".
     * Donde se repite el caracter "*" de 1 a n veces, siendo n el numero ingresado por el usuario.
     */
    public void imprimirNumerosEstrellas() {
        int numeroIngresado;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        numeroIngresado = sc.nextInt();
        for (int i = 1; i <= numeroIngresado; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("  ");
        }
        System.out.println();
    }

    
}
