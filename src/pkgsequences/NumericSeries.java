package pkgsequences;
import java.util.Scanner;

public class NumericSeries {

    /**
     * Imprime una serie de numeros naturales compuesta unicamente por el numero 1, 
     * en la cual el primer numero es 1, el segundo es 11, el tercero es 111 y asi sucesivamente hasta llegar al numero ingresado por el usuario.
    */
    public void imprimeRepunidades () {
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
    
}
