package pkgfigures;

public class NumericFigures {

    private static final int N_DEFECTO = 10;
    private static final int N_MAX = 18;


    public void g2imprimirNumTriangularDescendiente(int n){
        System.out.println("\nEjercicio F12. Triángulo Numérico Descendente");
        if (n > N_MAX || n < 1) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


    }

}
