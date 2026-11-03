package pkgautomata;

import java.util.Scanner;

public class AutomataExercises1 {

    /**
     * Lista de estados del autómata A01
     * State1: Q0, Q1, Q2, Q3
     */
    public enum State1 {
        Q0, 
        Q1,
        Q2,
        Q3
    }

    /**
     * Método que procesa la cadena de texto ingresada por el usuario y determina si es aceptada por el autómata A01
     * @param texto Cadena de texto ingresada por el usuario
     * @return true si la cadena es aceptada, false en caso contrario
     */
    public boolean g2ProcesarCadenaAutomata1(String texto) {
        State1 estadoActual = State1.Q0;

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            switch (estadoActual) {
                case Q0 -> {
                    switch (letra) {
                        case 'a' -> estadoActual = State1.Q0;
                        case 'b' -> estadoActual = State1.Q1;
                        case 'c' -> estadoActual = State1.Q3;
                        default -> {
                            System.out.println("Caracter no válido: " + letra);
                            return false;
                        }
                    }
                }
                case Q1 -> {
                    switch (letra) {
                        case 'a' -> estadoActual = State1.Q3;
                        case 'b' -> estadoActual = State1.Q1;
                        case 'c' -> estadoActual = State1.Q2;
                        default -> {
                            System.out.println("Caracter no válido: " + letra);
                            return false;
                        }
                    }
                }

                case Q2 -> {
                    switch (letra) {
                        case 'a', 'b', 'c' -> estadoActual = State1.Q3;
                        default -> {
                            System.out.println("Caracter no válido: " + letra);
                            return false;
                        }
                    }
                }

                case Q3 -> {
                    switch (letra) {
                        case 'a', 'b', 'c' -> estadoActual = State1.Q3;
                        default -> {
                            System.out.println("Caracter no válido: " + letra);
                            return false;
                        }
                    }
                }
            }
        }
        return estadoActual == State1.Q2;
    }

    /**
     * Método que solicita al usuario ingresar una cadena de texto y muestra si es aceptada por el autómata A01
     * @return void
     */
    public void g2ValidarCadena1() {
        String textoIngresado;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nEjercicio A01. Automata a*b+c");
        System.out.print("Ingrese una cadena de texto con la sguiente estructura: a*b+c (ejemplo: aaabbbcc): ");
        textoIngresado = sc.nextLine();

        System.out.println("La cadena " + textoIngresado + " es aceptada por el automata: " + g2ProcesarCadenaAutomata1(textoIngresado));
    }

    /**
     * Lista de estados del autómata A02 (ab+ca)
     * State2: Q0, Q1, Q2, Q3, Q4, Q5
     */
    public enum State2 {
        Q0, 
        Q1,
        Q2,
        Q3,
        Q4,
        Q5
    }

    /**
     * Método que procesa la cadena de texto ingresada por el usuario y determina si es aceptada por el autómata A02
     * @param texto Cadena de texto ingresada por el usuario
     * @return true si la cadena es aceptada, false en caso contrario
     */
    public boolean g2ProcesarCadenaAutomata2(String texto) {
        State2 estadoActual2 = State2.Q0;

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            switch (estadoActual2) {
                case Q0 -> {
                    switch (letra) {
                        case 'a' -> estadoActual2 = State2.Q1;
                        case 'b', 'c' -> estadoActual2 = State2.Q5;
                        default -> {
                            System.out.println("Caracter no válido: " + letra);
                            return false;
                        }
                    }
                }
                case Q1 -> {
                    switch (letra) {
                        case 'b' -> estadoActual2 = State2.Q2;
                        case 'a', 'c' -> estadoActual2 = State2.Q5;
                        default -> {
                            System.out.println("Caracter no válido: " + letra);
                            return false;
                        }
                    }
                }
                case Q2 -> {
                    switch (letra) {
                        case 'b' -> estadoActual2 = State2.Q2;
                        case 'c' -> estadoActual2 = State2.Q3;
                        case 'a' -> estadoActual2 = State2.Q5;
                        default -> {
                            System.out.println("Caracter no válido: " + letra);
                            return false;
                        }
                    }
                }
                case Q3 -> {
                    switch (letra) {
                        case 'a' -> estadoActual2 = State2.Q4;
                        case 'b', 'c' -> estadoActual2 = State2.Q5;
                        default -> {
                            System.out.println("Caracter no válido: " + letra);
                            return false;
                        }
                    }
                }
                case Q4, Q5 -> {
                    switch (letra) {

                        case 'a', 'b', 'c' -> estadoActual2 = State2.Q5;
                        default -> {
                            System.out.println("Caracter no válido: " + letra);
                            return false;
                        }
                    }
                }
            }
        }
        return estadoActual2 == State2.Q4;
    }

    /**
     * Método que solicita al usuario ingresar una cadena de texto y muestra si es aceptada por el autómata A02
     * @return void
     */
    public void g2ValidarCadena2() {
        String textoIngresado;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nEjercicio A02. Automata ab+ca");
        System.out.print("Ingrese una cadena de texto con la sguiente estructura: ab+ca (ejemplo: abbbca): ");
        textoIngresado = sc.nextLine();

        System.out.println("La cadena " + textoIngresado + " es aceptada por el automata: " + g2ProcesarCadenaAutomata2(textoIngresado));
    }

}
