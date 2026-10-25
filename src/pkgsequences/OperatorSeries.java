package pkgsequences;

import java.util.Scanner;

public class OperatorSeries {

    public void imprimirSignosAlternados() {
        int numeroIngresado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio SC01. Signos Alternados");
        System.out.print("Ingrese un número: ");
        numeroIngresado = sc.nextInt();
        for (int i = 1; i <= numeroIngresado; i++) {
            if (i % 2 == 0) {
                System.out.print("- ");
            } else {
                System.out.print("+ ");
            }
        }
        System.out.println();
    }

    /**
     * Imprime una serie de numeros naturales compuesta unicamente por el caracter "*".
     * Donde se repite el caracter "*" de 1 a n veces, siendo n el numero ingresado por el usuario.
     */
    public void imprimirNumerosEstrellas() {
        int numeroIngresado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio SC15. Números Estrellas");
        System.out.print("Ingrese un número: ");
        numeroIngresado = sc.nextInt();
        for (int i = 1; i <= numeroIngresado; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("  ");
        }
        System.out.println();
    }

    /**
     * Imprime una serie de operadores matematicos alternando entre ellos.
     * La serie de operadores es: +, -, *, /, % y se repite ciclicamente hasta llegar al numero ingresado por el usuario.
     */
    public void imprimirAlternanciaOperadores() {
        int numeroIngresado;
        String[] operadores = {"+", "-", "*", "/ ", "% "};
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio SC17. Alternancia de Operadores");
        System.out.print("Ingrese un número: ");
        numeroIngresado = sc.nextInt();
        for (int i = 0; i < numeroIngresado; i++) {
            System.out.print(operadores[i % operadores.length] + " ");
        }
        System.out.println();
    }
    
}
