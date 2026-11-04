package pkgautomata;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CompilerExercises {

    private static final Pattern PATTERN = Pattern.compile(
        "^(for|if|else|ifelse|foreach)(\\s*|\\s*\\([^)]*\\)?)?$"
    );
    
    /**
     * Lista de estados del autómata A05
     * State5 : Q0, Q1, Q2, Q3
     */
    public enum State5 {
        Q0,
        Q1,
        Q2,
        Q3
    }

    /**
     * Método que procesa la cadena de texto ingresada por el usuario y determina si es un número decimal válido según el autómata A05
     * @param texto
     * @return true si la cadena es un número decimal válido, false en caso contrario
     */
    public boolean g2ProcesarNumeroDecimal(String texto) {
        State5 estadoActual5 = State5.Q0;

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            switch (estadoActual5) {
                case Q0 -> {
                    switch (letra) {
                        case '.' -> estadoActual5 = State5.Q3;
                        case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> estadoActual5 = State5.Q1;
                        default -> {
                            System.out.println("Caracter no válido: " + letra);
                            return false;
                        }
                    }
                }
                case Q1 -> {
                    switch (letra) {
                        case '.' -> estadoActual5 = State5.Q2;
                        case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> estadoActual5 = State5.Q1;
                        default -> {
                            System.out.println("Caracter no válido: " + letra);
                            return false;
                        }
                    }
                }

                case Q2 -> {
                    switch (letra) {
                        case '.' -> estadoActual5 = State5.Q3;
                        case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> estadoActual5 = State5.Q2;
                        default -> {
                            System.out.println("Caracter no válido: " + letra);
                            return false;
                        }
                    }
                }

                case Q3 -> {
                    switch (letra) {
                        case '.', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> estadoActual5 = State5.Q3;
                        default -> {
                            System.out.println("Caracter no válido: " + letra);
                            return false;
                        }
                    }
                }
            }
        }

        return estadoActual5 == State5.Q2;
    }

    /**
     * Método que solicita al usuario ingresar un número decimal y valida si es aceptado por el autómata A05
     * @return void
     */
    public void g2ValidarDecimal() {
        String textoIngresado;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nEjercicio A05. Compilador para validar números decimales.");
        System.out.print("Ingrese un número decimal: ");
        textoIngresado = sc.nextLine();

        System.out.println("El número " + textoIngresado + " es aceptado por el automata: " + g2ProcesarNumeroDecimal(textoIngresado));
    }

    /**
     * Lista de estados del autómata A06
     * State6 : Q0, Q1, Q2
     */
    public enum State6 {
        Q0, 
        Q1, 
        Q2
    }

    /**
     * Método que clasifica un carácter ingresado por el usuario como letra, número, especial o inválido
     * @param c
     * @return "letra", "numero", "gion_bajo", "dolar" o "invalido" dependiendo del tipo de carácter
     */
    public String g2ClasificarCaracter(char c) {
        if (c == '_') {
            return "guion_bajo";
        } else if (c == '$') {
            return "dolar";
        } else if (Character.isDigit(c)) {
            return "numero";
        } else if (Character.isLetter(c)) {
            return "letra";
        } else {
            return "invalido";
        }
    }

    /**
     * Método que valida si una cadena ingresada por el usuario es una variable válida según el autómata A06
     * @param palabra
     * @return true si la cadena es una variable válida, false en caso contrario
     */
    public boolean g2ValidarVariable(String palabra) {
        State6 estado = State6.Q0;

        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            String tipo = g2ClasificarCaracter(c);
            if (tipo.equals("invalido")) {
                System.out.println("Caracter no válido: " + c);
                return false;
            }
            switch (estado) {
                case Q0 -> {
                    if (tipo.equals("letra") || tipo.equals("dolar")) {
                        estado = State6.Q1;
                    } else {
                        estado = State6.Q2;
                    }
                }

                case Q1 -> {
                    if (tipo.equals("letra") || tipo.equals("numero") || tipo.equals("dolar") || tipo.equals("guion_bajo")) {
                        estado = State6.Q1;
                    } else {
                        estado = State6.Q2;
                    }
                }

                case Q2 -> estado = State6.Q2;
            }

            if (estado == State6.Q2) {
                break;
            }
        }

        return estado == State6.Q1;
    }

    /**
     * Método que solicita al usuario ingresar una variable y valida si es aceptada por el autómata A06
     * @return void
     */
    public void g2EjecutarValidador() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEjercicio A06. Compilador para validar variables.");
        System.out.print("Ingrese el nombre de la variable: ");
        String entrada = scanner.nextLine();

        boolean esValida = g2ValidarVariable(entrada);
        System.out.println("La variable " + entrada + " es válida: " + esValida);
    }

    /**
     * Valida si una cadena de texto pertenece al lenguaje L perteneciente al autómata A07, que reconoce las palabras reservadas "for", "if", "else", "ifelse" y "foreach" con o sin paréntesis.
     * @param entrada Cadena de caracteres a evaluar
     * @return true si cumple con la estructura; false en caso contrario.
     */
    public boolean g2ValidarLenguaje(String entrada) {
        if (entrada == null) {
            return false;
        }
        Matcher matcher = PATTERN.matcher(entrada);
        return matcher.matches();
    }

    /**
     * Método que solicita al usuario ingresar una palabra reservada y valida si es aceptada por el autómata A07
     * @return void
     */
    public void g2EjecutarValidadorLenguaje() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEjercicio A07. Compilador para validar palabras reservadas.");
        System.out.print("Ingrese una palabra reservada: ");
        String entrada = scanner.nextLine();

        boolean esValida = g2ValidarLenguaje(entrada);
        System.out.println("La palabra reservada " + entrada + " es válida: " + esValida);
    }
}
