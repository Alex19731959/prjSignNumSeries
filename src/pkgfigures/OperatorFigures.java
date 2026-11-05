package pkgfigures;

public class OperatorFigures {

    private static final int N_DEFECTO = 10;
    private static final int N_MAX = 18;

    /**
     * Método que imprime una escalera descendente.
     * @param n Número de escalones de la escalera.
     */

    public void g2imprimirEscaleraDescendente(int n) {
        System.out.println("\nEjercicio F07. Escalera Descendente");
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
     * Método que imprime una escalera ascendente.
     * @param n Número de escalones de la escalera.
     */

    public void g2imprimirEscaleraAscendente(int n) {
        System.out.println("\nEjercicio F08. Escalera Ascendente");
        if (n > N_MAX || n < 1) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }
        
        for (int i = 0 ; i < n ; i++){
            System.out.print("   ");
        } 
        System.out.println("__");
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n - i - 1 ; j++){
                System.out.print("   ");
            }
            System.out.println("__|  ");
        }
    }


    /**
     * Método que imprime una escalera ascendente y descendente.
     * @param n Número de escalones de la escalera.
     */

    public void g2imprimirEscaleraAscendenteDescendente(int n) {
        System.out.println("\nEjercicio F09. Escalera Ascendente y Descendente");
        if (n > N_MAX || n < 1) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }

        for (int i = 0 ; i < n ; i++){
            System.out.print("   ");
        } 
        System.out.println("__");
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n - i - 1 ; j++){
                System.out.print("   ");
            }
            System.out.print("__|");
            System.out.print("  ");
            
            for (int j = 1 ; j <= i ; j++){
                System.out.print("      ");
            }
            
            System.out.print("|__");
            System.out.println();
        }

    }

    /**
     * Método que imprime una escalera de signos descendente.
     * @param n Número de escalones de la escalera.
     */

    public void g2imprimirEscaleraSignosDescendente(int n) {
        System.out.println("\nEjercicio F10. Escalera de Signos Descendente");
        if (n > N_MAX || n < 1) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }

        System.out.println("_+_");
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < i ; j++){
                System.out.print("    ");
            }
            if (i % 2 == 0) {
                System.out.println("  |_-_");
            } else {
                System.out.println("  |_+_");
            }
        }

    }

    /**
     * Método que imprime escaleras descendentes iterativas.
     * @param n Número de escalones de la escalera.
     */

    public void g2imprimirEscalerasDescendentesIterativas(int n) {
        System.out.println("\nEjercicio F11. Escaleras Descendentes Iterativas");
        if (n > N_MAX || n < 1) {
            System.out.println("El método acepta un parámetro n entre 1 y " + N_MAX + ". Por defecto, se elige n = " + N_DEFECTO);
            n = N_DEFECTO;
        }

        int numEspacios = 0;
        for (int i = 1 ; i <= n ; i++){
            for (int j = 0 ; j < numEspacios ; j++){
                System.out.print(" ");
            }
            System.out.print("|");
            
            for (int j = 0 ; j < i ; j++){
                System.out.print("_");
            }
            System.out.println();
            numEspacios = numEspacios + 1 + i;
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
