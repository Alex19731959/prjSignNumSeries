package pkgrecursive;

import java.util.Scanner;

public class RecursiveExercises2 {
    /**
     * Método para leer un número entero y validar la entrada.
     * @return el número entero ingresado por el usuario
     */
    private int leerEntero() {
    while (true) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        else {
            System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
            scanner.next(); // Limpiar el buffer de entrada
        }
    }
}
    
    /**
     * Crear un metodo recursivo para obtener la potencia (a,b) = a^b, donde a es la base y b es el exponente.
     * @param base la base
     * @param exponente el exponente
     * @return la potencia de la base elevada al exponente
     */
    public int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }

    /**
     * Crear un metodo recursivo para obtwnwe la conteoProgresivoHasta(n), imprimir el avance de 1 hasta n, donde n es un numero entero positivo.
     * @param n el numero hasta el cual se desea contar
     */
    public int conteoProgresivoHasta(int n) {
        if (n == 0) {
            return 0;
        } else {
            int resultado = conteoProgresivoHasta(n - 1);
            System.out.println(resultado + 1);
            return resultado + 1;
        }
    }

    /**
     * Crear un metodo recursivo para obtener la conteoRegresivoHasta(n) desde n hasta 0, donde n es un numero entero positivo.
     * @param n el numero desde el cual se desea contar regresivamente
     */
    public int conteoRegresivo(int n) {
        if (n == 0) {
            System.out.println(0);
            return 0;
        } else {
            System.out.println(n);
            return conteoRegresivo(n - 1);
        }
    }

    /**
     * Llama al método potencia para realizar el ejercicio recursivo de potencia.
     */
    public void g2CalcularPotencia() {
        System.out.println("\nEjercicio R04. Potencia");
        System.out.print("Ingrese la base: ");
        int base = leerEntero();
        System.out.print("Ingrese el exponente: ");
        int exponente = leerEntero();
        boolean exponenteEsNegativo = false;
        if (exponente < 0) {
            exponente = -exponente;
            exponenteEsNegativo = true;
            if (base == 0) {
                System.out.println("La base no puede ser cero cuando el exponente es negativo.");
                return;
            }
        }
        if (base == 0 && exponente == 0) {
            System.out.println("La base y el exponente no pueden ser ambos cero.");
            return;
        }
        int resultado = potencia(base, exponente);
        System.out.println(base + " elevado a la " + (exponenteEsNegativo? "-" + exponente : exponente) + " es: " + (exponenteEsNegativo? "1/" + resultado : resultado));
    }

    /**
     * Llama al método conteoProgresivoHasta para realizar el ejercicio recursivo de conteo progresivo.
     */
    public void g2ConteoProgresivoHasta() {
        System.out.println("\nEjercicio R05. Conteo progresivo hasta n");
        System.out.print("Ingrese un número entero positivo: ");
        int n = leerEntero();
        if (n < 0) {
            System.out.println("El número ingresado es negativo. Se tomará su valor absoluto.");
            n = -n;
        }
        System.out.println("Conteo progresivo hasta " + n + ":");
        conteoProgresivoHasta(n);
    }

    /**
     * Llama al método conteoRegresivo para realizar el ejercicio recursivo de conteo regresivo.
     */
    public void g2ConteoRegresivoHasta() {
        System.out.println("\nEjercicio R06. Conteo regresivo hasta 0");
        System.out.print("Ingrese un número entero positivo: ");
        int n = leerEntero();
        if (n < 0) {
            System.out.println("El número ingresado es negativo. Se tomará su valor absoluto.");
            n = -n;
        }
        System.out.println("Conteo regresivo desde " + n + " hasta 0:");
        conteoRegresivo(n);
    }
}
