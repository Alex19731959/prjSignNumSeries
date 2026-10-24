package pkgsequences;
import java.util.Scanner;

public class NumericSeries {

    /**
     * Imprime una serie de numeros naturales compuesta unicamente por el numero 1, 
     * en la cual el primer numero es 1, el segundo es 11, el tercero es 111 y asi sucesivamente hasta llegar al numero ingresado por el usuario.
    */
    public void repunidades () {
        int numeroIngresado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numeroIngresado = sc.nextInt();
        for (int i = 1; i <= numeroIngresado; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("1");
            }
            System.out.print("  ");
        }
        System.out.println();
    }
}
