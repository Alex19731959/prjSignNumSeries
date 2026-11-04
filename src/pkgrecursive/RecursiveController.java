package pkgrecursive;

import java.util.Scanner;
public class RecursiveController {
    
    public void showRecursiveExercises1() {

        RecursiveExercises1 recursiveExercises1 = new RecursiveExercises1();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para calcular la recursividad: ");
        String n = scanner.nextLine();

        recursiveExercises1.g2factorial(n);

        System.out.print("ingrese el segundo numero para calcular la suma recursiva");
        String n2 = scanner.nextLine();
        recursiveExercises1.g2suma(n, n2);

        System.out.print("Ingrese el segundo numero para calcular la multiplicación recursiva: ");
        String n3 = scanner.nextLine();
        recursiveExercises1.g2multiplicacion(n, n3);
    }
}
