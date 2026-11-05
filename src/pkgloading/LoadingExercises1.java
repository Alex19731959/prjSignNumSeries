package pkgloading;

import java.util.Scanner;
import java.util.Random;

public class LoadingExercises1 {
    
    private static final int LONGITUD = 20;
    private static final int MAX_REPETICIONES = 1;
    private static final String VERDE = "\u001B[32m";
    private static final String RESET = "\u001B[0m";
    
    /**
     * Método que imprime un indicador de carga desde 0 a 100% usando los signos \|/-|
     * para simular un movimiento rotacional.
     */
    public void g2imprimirIndicadorCarga() {
        System.out.println("\nEjercicio L01. Indicador de Carga Rotacional (0% a 100%)");
        char[] signos = {'\\', '|', '/', '-'};
        for (int porcentaje = 0; porcentaje <= 100; porcentaje++) {
            char signo = (porcentaje == 100) ? '/' : signos[porcentaje % signos.length];
            System.out.printf("\r%c %3d%%", signo, porcentaje);
            System.out.flush();
            try {
                Thread.sleep(60);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
        System.out.println();
    }


    /**
     * Pide al usuario un carácter para la animación de carga y valida que sea un solo carácter no vacío
     * @return el carácter ingresado por el usuario
     * @param scanner
     * @throws InterruptedException
     */
    private static char pedirCaracter(Scanner scanner) throws InterruptedException {
        String caracter;
        boolean valido;
        do {
            System.out.print("Ingrese un carácter para la carga: ");
            caracter = scanner.nextLine();
            valido = true;
            if (caracter.length() != 1  || Character.isWhitespace(caracter.charAt(0))) {
                valido = false;
            }
            if (!valido) {
                System.out.println("Carácter no válido, inténtalo de nuevo.");
            }
        } while (!valido);

        return caracter.charAt(0);
    }
    /**
     * Pide al usuario su nombre completo y valida que contenga un nombre y al menos un apellido, y que solo contenga letras y espacios
     * @param scanner
     * @return el nombre completo ingresado por el usuario  
     */
    private static String pedirNombreCompleto(Scanner scanner) {
        String nombreCompleto;
        boolean valido;
        do {
            System.out.print("Ingrese su nombre y apellidos: ");
            nombreCompleto = scanner.nextLine();
            valido = true;
            int palabras = 0;
            for (int i = 0; i < nombreCompleto.length(); i++) {
                char c = nombreCompleto.charAt(i);
                if (Character.isLetter(c)) {
                    if (i == 0 || nombreCompleto.charAt(i - 1) == ' ') {
                        palabras++;
                    }
                } else if (c != ' ') {
                    valido = false;
                }
            }
            if(palabras < 2){
                valido = false;
            }
            if (!valido) {
                System.out.println("Nombre no válido. Use solo letras y escriba al menos nombre y apellido.");
            }
        } while (!valido);

        return nombreCompleto;
    }


    /**
     * Pedir un caracter para simular la carga y la longuitud de la barra es de 20 caracteres, y se repite 3 veces
     * @throws InterruptedException 
     */
    public void g2ImprimirBarradeCarga () throws InterruptedException {
        System.out.println("\nEjercicio LN02. Animación de barra de carga");
        var scanner = new Scanner(System.in);
        char caracter = pedirCaracter(scanner);
        
        for (int repeticiones = 1; repeticiones <= MAX_REPETICIONES; repeticiones++) {
            for (int i = 0; i <= LONGITUD; i++) {
                int porcentaje = (i * 5);
                String barra = "";
                for (int j = 0; j < i; j++) {
                    barra += caracter;
                }
                for (int j = 1; j <= (LONGITUD-i); j++) {
                    barra += ' ';
                }
                System.out.printf("\r[%s] %3d%%", barra, porcentaje);
                Thread.sleep(200);
            }
        }
        System.out.println(); 
    }   

    /**
     * Pedir un caracter que se desplaza de izquierda a derecha un una barra de longuitud de 20 caracteres, y se repite 3 veces
     * @param caracter el caracter que se va a imprimir
     * @throws InterruptedException 
     */
    public void g2DesplazarCaracter () throws InterruptedException {
        System.out.println("\nEjercicio LN03. Desplazamiento de caracter");
        var scanner = new Scanner(System.in);
        char caracter = pedirCaracter(scanner);
        for (int repeticiones = 1; repeticiones <= MAX_REPETICIONES; repeticiones++) {
            for (int i = 0; i <= LONGITUD; i++) {
                int porcentaje = (i * 5);
                String barra = "";
                for (int j = 1; j <= i-1; j++) {
                    barra += ' ';
                }
                if (i > 0) {
                    barra += caracter;
                }
                for (int j = 1; j <= (LONGITUD-i); j++) {
                    barra += ' ';
                }
                System.out.printf("\r[%s] %3d%%", barra, porcentaje);
                Thread.sleep(200);
            }
        }
        System.out.println(); 
    }  

    /**
     * //Waiting que inicia en 0 a 100%, usa los signos o0o para simular un movimiento de ida y vuelta en el mismo puesto (o0o 100%)
     * @throws InterruptedException
     */
    public void g2AnimarWaiting() throws InterruptedException {
        System.out.println("\nEjercicio LN04. Animación de waiting");
        for (int i=0; i<=100; i++){
            int frame = i % 4;
            switch (frame) {
                case 0 -> System.out.print("0oo");
                case 1 -> System.out.print("o0o");
                case 2 -> System.out.print("oo0");
                case 3 -> System.out.print("o0o");
            }
            System.out.print(" " + i + "%\r");
            Thread.sleep(75);
        }
        System.out.println();
    }

    /**
     * Crear una barra de 20 caracteres, simular la animacion de la barra avanzando cambiando la punta entre > - (=-, ==>, ===-, ====>, etc) y se repite 3 veces
     * @throws InterruptedException
     */
    public void g2AnimarBarra() throws InterruptedException {
        System.out.println("\nEjercicio LN05. Animación de barra con punta");
        for (int repeticiones = 1; repeticiones <= MAX_REPETICIONES; repeticiones++) {
            for (int i = 0; i <= LONGITUD; i++) {
                int porcentaje = (i * 5);
                String barra = "";
                for (int j = 1; j <= i-1; j++) {
                    barra += '=';
                }
                if(i>0){
                    barra += (i%2 == 0) ? '>' : '-';
                }
                for (int j = 1; j <= (LONGITUD-i); j++) {
                    barra += ' ';
                }
                System.out.printf("\r[%s] %3d%%", barra, porcentaje);
                Thread.sleep(200);
            }
        }
        System.out.println(); 
    }

    /**Crear una barra es de 20 caracteres, la barra <=> se desplaza de izquierda a derecha solamente, y se repite 3 veces
     * @throws InterruptedException
     */
    public void g2AnimarBarraDesplazable() throws InterruptedException {
        System.out.println("\nEjercicio LN06. Animación de barra desplazable");
        for (int repeticiones = 1; repeticiones <= MAX_REPETICIONES; repeticiones++) {
            for (int i = 0; i <= 17; i++) {
                int porcentaje = (i*100)/17;
                String barra = "";
                for (int j = 1; j <= i; j++) {
                    barra += ' ';
                }
                barra += "<=>";
                for (int j = 1; j <= (17-i); j++) {
                    barra += ' ';
                }
                System.out.printf("\r[%s] %3d%%", barra, porcentaje);
                Thread.sleep(200);
            }
        }
        System.out.println();
    }

    /**
     * Crear una barra de 20 caracteres, la barra avanza cambiando la punta con movimiento rotacional con los signos "\", "|", "/",  "-" y se repite 3 veces
     * @throws InterruptedException
     */
    public void g2AnimarBarraRotacional() throws InterruptedException {
        System.out.println("\nEjercicio LN07. Animación de barra con punta rotacional");
        for (int repeticiones = 1; repeticiones <= MAX_REPETICIONES; repeticiones++) {
            for (int i = 0; i <= LONGITUD; i++) {
                int porcentaje = (i * 5), frame = i % 4;
                String barra = "";
                for (int j = 1; j <= i-1; j++) {
                    barra += '=';
                }
                if(i>0){
                    barra += switch (frame) {
                        case 0 -> '\\';
                        case 1 -> '|';
                        case 2 -> '/';
                        default -> '-';
                    };
                }
                for (int j = 1; j <= (LONGITUD-i); j++) {
                    barra += ' ';
                }
                System.out.printf("\r[%s] %3d%%", barra, porcentaje);
                Thread.sleep(200);
            }
        }
        System.out.println(); 
    }

    /**
     * Pedir nombre y apellidos y realizar una animacion de carga mostrando letra a letra hasta el 100%
     * @throws InterruptedException
     */
    public void g2AnimarCargaNombre() throws InterruptedException {
        System.out.println("\nEjercicio LN08. Animación de carga con nombre y apellidos");
        var scanner = new Scanner(System.in);
        String nombreCompleto = pedirNombreCompleto(scanner);
        int longitudNombre = nombreCompleto.length();

        for (int i = 0; i <= longitudNombre; i++) {
            String barra = nombreCompleto.substring(0, i);
            int porcentaje = (i * 100) / longitudNombre;
            for (int j = 1; j <= (longitudNombre - i); j++) {
                barra += ' ';
            }
            System.out.printf("\r[%s] %3d%%", barra, porcentaje);
            Thread.sleep(200);
        }
        System.out.println();
    }

    /**
     * Pedir y mostrar el nombre completo, mostrando solo una letra en la misma linea del 0 al 100%
     * @throws InterruptedException
     */
    public void g2AnimarCargaNombrePorLetra() throws InterruptedException {
        System.out.println("\nEjercicio LN09. Animación de carga con nombre y apellidos letra por letra");
        var scanner = new Scanner(System.in);
        String nombreCompleto = pedirNombreCompleto(scanner);
        int longitudNombre = nombreCompleto.length();
        for (int i = 0; i <= longitudNombre; i++) {
            int porcentaje = (i * 100) / longitudNombre;
            String barra = "";
            for(int j=1; j<=(i-1); j++){
                barra+=' ';
            }
            if(i>0){
                barra += nombreCompleto.charAt(i-1);
            }
            for (int j = 1; j <= (longitudNombre - i); j++) {
                barra += ' ';
            }
            System.out.printf("\r[%s] %3d%%", barra, porcentaje);
            Thread.sleep(200);
        }
        System.out.println();
    }

    /**
     * Generar un número random entre 10 y 100 para simular una carga de un archivo en kb. Ponerle color a la barra de carga y detener la carga al completar el valor.
     * @throws InterruptedException
     */
    public void g2AnimarCargaArchivo() throws InterruptedException {
        System.out.println("\nEjercicio LN10. Animación de carga de archivo");
        var random = new Random();
        float total = 10 + random.nextFloat() * (90);
        System.out.println("Downloading ArchivoYarl-win_amd64.whl (" + (int)total + " kB)");

        for (int i = 0; i <= LONGITUD; i++) {
            float progreso = (i * total) / LONGITUD;
            String barra = "";
            for (int j = 1; j <= i; j++) {
                barra += "-";
            }
            for (int j = 1; j <= LONGITUD - i; j++) {
                barra += " ";
            }

            System.out.printf("\r%s%s%s %.2f / %.2f kB", VERDE, barra, RESET, progreso, total);
            Thread.sleep(200);
        }
        System.out.println();
    }
}
