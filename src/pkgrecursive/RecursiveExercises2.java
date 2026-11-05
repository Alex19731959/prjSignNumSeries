package pkgrecursive;

import java.util.Scanner;

public class RecursiveExercises2 {
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
     * Crear un metodo recursivo para obtener la conteoRegresivoHasta(n) hasta 0, donde n es un numero entero positivo.
     * @param n el numero desde el cual se desea contar regresivamente
     */
    public int conteoRegresivo(int n) {
        if (n == 0) {
            return 0;
        } else {
            int resultado = conteoRegresivo(n - 1);
            System.out.println(n);
            return resultado;
        }
    }

    public void g2CalcularPotencia() {
        System.out.println("\nEjercicio R04. Potencia");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        int base = scanner.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();
        int resultado = potencia(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es: " + resultado);
    }

    public void g2ConteoProgresivoHasta() {
        System.out.println("\nEjercicio R05. Conteo progresivo hasta n");
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Ingrese un número entero positivo: ");
            n = scanner.nextInt();
        } while (n <= 0);
        System.out.println("Conteo progresivo hasta " + n + ":");
        conteoProgresivoHasta(n);
    }

    public void g2ConteoRegresivoHasta() {
        System.out.println("\nEjercicio R06. Conteo regresivo hasta 0");
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.print("Ingrese un número entero positivo: ");
            n = scanner.nextInt();
        }
        while (n <= 0);
        System.out.println("Conteo regresivo desde " + n + " hasta 0:");
        conteoRegresivo(n);
    }
}
