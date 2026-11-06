package pkgrecursive;

import java.util.Scanner;
public class RecursiveExercises1 {

    /**
     * Calcula el factorial de un número ingresado por el usuario de manera recursiva.
     * @param nStr
     * @return
     */
    private int calcularFactorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }

    /**
     * Pide al usuario ingresar un número y lo valida mediante un try-catch para calcular su factorial.
     * @param nStr    
     * @return
     */
    public void g2factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEjercicio R01. Factorial");
        System.out.print("Ingrese un número para calcular el factorial: ");
        String nStr = scanner.nextLine();

        try {
            int n = Integer.parseInt(nStr);
            if (n < 0) {
                System.out.println("No se puede calcular el factorial de un número negativo.");
            } else {
                int resultado = calcularFactorial(n);
                System.out.println("El factorial de " + n + " es: " + resultado);
            }
        } catch (NumberFormatException e) {
            System.out.println("No se pudo calcular ya que no se ha ingresado un número válido.");
        }
    }

    /**
     * Calcula la suma de dos números ingresados por el usuario de manera recursiva.
     * @param aStr
     * @param bStr
     * @return
     */
    private int sumaRecursiva(int a, int b) {
        if (b == 0) {
            return a;
        } else if (b > 0) {
            return sumaRecursiva(a + 1, b - 1);
        } else {
            return sumaRecursiva(a - 1, b + 1);
        }
    }

    /**
     * Pide al usuario ingresar dos números y los valida mediante un try-catch para calcular su suma.
     * @param aStr
     * @param bStr
     * @return
     */
    public void g2suma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEjercicio R02. Suma recursiva");
        System.out.print("Ingrese el primer número: ");
        String aStr = scanner.nextLine();
        System.out.print("Ingrese el segundo número: ");
        String bStr = scanner.nextLine();

        try {
            int a = Integer.parseInt(aStr);
            int b = Integer.parseInt(bStr);
            int resultado = sumaRecursiva(a, b);
            System.out.println("La suma de " + a + " y " + b + " es: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("No se pudo calcular ya que no se han ingresado números válidos.");
        }
    }

    /**
     * Calcula la multiplicación de dos números ingresados por el usuario de manera recursiva.
     * @param aStr
     * @param bStr
     * @return
     */
    private int multiplicacionRecursiva(int a, int b) {
        if (b == 0) {
            return 0;
        } else if (b < 0) {
            return -multiplicacionRecursiva(a, -b);
        } else {
            return a + multiplicacionRecursiva(a, b - 1);
        }
    }
    
    /**
     * Pide al usuario ingresar dos números y los valida mediante un try-catch para calcular su multiplicación.
     * @param aStr
     * @param bStr
     * @return
     */
    public void g2multiplicacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEjercicio R03. Multiplicación recursiva");
        System.out.print("Ingrese el primer número: ");
        String aStr = scanner.nextLine();
        System.out.print("Ingrese el segundo número: ");
        String bStr = scanner.nextLine();

        try {
            int a = Integer.parseInt(aStr);
            int b = Integer.parseInt(bStr);
            int resultado = multiplicacionRecursiva(a, b);
            System.out.println("La multiplicación de " + a + " y " + b + " es: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("No se pudo calcular ya que no se han ingresado números válidos.");
        }
    }
}
