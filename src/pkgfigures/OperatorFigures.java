package pkgfigures;

public class OperatorFigures {

    private static final int N_DEFECTO = 10;
    private static final int N_MAX = 18;


    public void g2imprimirEscaleraDescendente(int n) {
        System.out.println("\nEjercicio F15. Escalera Descendente");
        if (n > N_MAX || n < 1) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        System.out.println("__");
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < i ; j++){
                System.out.print("   ");
            }
            System.out.println("  |__");
        }
    }


        /**
     * Método que imprime una X de signos.
     * @param n Número de filas y columnas de la X.
     */

    public void g2imprimirXdeSignos(int n) {
        System.out.println("\nEjercicio F16. X de Signos");
        if (n > N_MAX || n < 1) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    if (i % 2 == 0) {
                        System.out.print("+ ");
                    } else {
                        System.out.print("- ");
                    }
                } else if (true){
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


}
