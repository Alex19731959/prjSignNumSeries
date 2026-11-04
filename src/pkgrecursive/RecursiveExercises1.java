package pkgrecursive;

public class RecursiveExercises1 {

    /**
     * Calcula el factorial de un número ingresado por el usuario de manera recursiva.
     * @param nStr
     * @return
     */
    public int g2factorial(String nStr) {
        System.out.println("\nEjercicio R01. Factorial");
        int n;
        try {
            n = Integer.parseInt(nStr);
        } catch (NumberFormatException e) {
            System.out.println("No se pudo calcular ya que no se ha ingresado un número válido.");
            return -1;
        }
        if (n < 0) {
            System.out.println("No se puede calcular el factorial de un número negativo.");
            return -1;
        } else if (n == 0) {
            return 1;
        } else {
            return n * g2factorial(String.valueOf(n - 1));
        }
    }

    /**
     * Calcula la suma de dos números ingresados por el usuario de manera recursiva.
     * @param aStr
     * @param bStr
     * @return
     */
    public int g2suma(String aStr, String bStr) {
        System.out.println("\nEjercicio R02. Suma");
        int a, b;
        try {
            a = Integer.parseInt(aStr);
            b = Integer.parseInt(bStr);
        } catch (NumberFormatException e) {
            System.out.println("No se pudo calcular ya que no se han ingresado números válidos.");
            return -1;
        }
        return sumaRecursiva(a, b);
    }
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
     * Calcula la multiplicación de dos números ingresados por el usuario de manera recursiva.
     * @param aStr
     * @param bStr
     * @return
     */
    public int g2multiplicacion(String aStr, String bStr) {
        System.out.println("\nEjercicio R03. Multiplicación");
        int a, b;
        try {
            a = Integer.parseInt(aStr);
            b = Integer.parseInt(bStr);
        } catch (NumberFormatException e) {
            System.out.println("No se pudo calcular ya que no se han ingresado números válidos.");
            return -1;
        }
        return multiplicacionRecursiva(a, b);
    }
    private int multiplicacionRecursiva(int a, int b) {
        if (b == 0) {
            return 0;
        } else if (b < 0) {
            return -multiplicacionRecursiva(a, -b);
        } else {
            return a + multiplicacionRecursiva(a, b - 1);
        }
    }
}
