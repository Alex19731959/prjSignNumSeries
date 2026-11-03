package pkgautomata;

import java.util.Scanner;

public class AutomataExercises2 {

    /**
     * Lista de estados del autómata A03
     * State3: Q0, Q1, Q2, Q3, Q4
     */
    public enum State3 {
        Q0,
        Q1,
        Q2,
        Q3,
        Q4
    }

    /**
     * Método que procesa la cadena de texto ingresada por el usuario y determina si es aceptada por el autómata A03
     * @param texto Cadena de texto ingresada por el usuario
     * @return true si la cadena es aceptada, false en caso contrario
     */
    public boolean g2ProcesarCadenaAutomata3(String texto) {
        State3 estadoActual3 = State3.Q0;

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            switch (estadoActual3) {
                case Q0 -> {
                    switch (letra) {
                        case 'a' -> estadoActual3 = State3.Q1;
                        case 'b' -> estadoActual3 = State3.Q2;
                        case 'c' -> estadoActual3 = State3.Q3;
                        default -> {
                            System.out.println("Caracter no válido: " + letra);
                            return false;
                        }
                    }
                }
                case Q1 -> {
                    switch (letra) {
                        case 'a' -> estadoActual3 = State3.Q1;
                        case 'b', 'c' -> estadoActual3 = State3.Q4;
                        default -> {
                            System.out.println("Caracter no válido: " + letra);
                            return false;
                        }
                    }
                }

                case Q2 -> {
                    switch (letra) {
                        case 'a', 'c' -> estadoActual3 = State3.Q4;
                        case 'b' -> estadoActual3 = State3.Q2;
                        default -> {
                            System.out.println("Caracter no válido: " + letra);
                            return false;
                        }
                    }
                }

                case Q3 -> {
                    switch (letra) {
                        case 'a', 'b'-> estadoActual3 = State3.Q4;
                        case 'c' -> estadoActual3 = State3.Q3;
                        default -> {
                            System.out.println("Caracter no válido: " + letra);
                            return false;
                        }
                    }
                }

                case Q4 -> {
                    switch (letra) {
                        case 'a','b','c' -> estadoActual3 = State3.Q4;
                        default -> {
                            System.out.println("Caracter no válido: " + letra);
                            return false;
                        }
                    }
                }
            }
        }
        return estadoActual3 == State3.Q3 || estadoActual3 == State3.Q2 || estadoActual3 == State3.Q1;
    }

    /**
     * Método que solicita al usuario ingresar una cadena de texto y muestra si es aceptada por el autómata A03
     * @return void
     */
    public void g2ValidarCadena3() {
        String textoIngresado;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nEjercicio A03. Automata a+/b+/c+");
        System.out.print("Ingrese una cadena de texto con la sguiente estructura:  a+/b+/c+ (ejemplo: aaaa): ");
        textoIngresado = sc.nextLine();

        System.out.println("La cadena " + textoIngresado + " es aceptada por el automata: " + g2ProcesarCadenaAutomata3(textoIngresado));
    }

    /**
     * Lista de estados del autómata A04
     * State4: Q0, Q1, Q2, Q3, Q4
     */
    public enum State4 {
        Q0,
        Q1,
        Q2,
        Q3,
        Q4
    }

    /**
     * Método que procesa la cadena de texto ingresada por el usuario y determina si es aceptada por el autómata A04
     * @param texto Cadena de texto ingresada por el usuario
     * @return true si la cadena es aceptada, false en caso contrario
     */
    public boolean g2ProcesarCadenaAutomata4(String texto) {
        State4 estadoActual4 = State4.Q0;

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            switch (estadoActual4) {
                case Q0 -> {
                    switch (letra) {
                        case '1' -> estadoActual4 = State4.Q1;
                        case '0' -> estadoActual4 = State4.Q2;
                        default -> {
                            System.out.println("Caracter no válido: " + letra);
                            return false;
                        }
                    }
                }
                case Q1 -> {
                    switch (letra) {
                        case '1' -> estadoActual4 = State4.Q1;
                        case '0' -> estadoActual4 = State4.Q3;
                        default -> {
                            System.out.println("Caracter no válido: " + letra);
                            return false;
                        }
                    }
                }

                case Q2 -> {
                    switch (letra) {
                        case '1' -> estadoActual4 = State4.Q4;
                        case '0' -> estadoActual4 = State4.Q2;
                        default -> {
                            System.out.println("Caracter no válido: " + letra);
                            return false;
                        }
                    }
                }

                case Q3 -> {
                    switch (letra) {
                        case '1','0'-> estadoActual4 = State4.Q3;
                        default -> {
                            System.out.println("Caracter no válido: " + letra);
                            return false;
                        }
                    }
                }

                case Q4 -> {
                    switch (letra) {
                        case '1' -> estadoActual4 = State4.Q4;
                        case '0' -> estadoActual4 = State4.Q3;
                        default -> {
                            System.out.println("Caracter no válido: " + letra);
                            return false;
                        }
                    }
                }
            }
        }
        return estadoActual4 == State4.Q1 || estadoActual4 == State4.Q2 || estadoActual4 == State4.Q4;
    }

    /**
     * Método que solicita al usuario ingresar una cadena de texto y muestra si es aceptada por el autómata A04
     * @return void
     */
    public void g2ValidarCadena4() {
        String textoIngresado;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nEjercicio A04. Automata 1+/0+1*");
        System.out.print("Ingrese una cadena de texto con la sguiente estructura:  1+/0+1* (ejemplo: 111): ");
        textoIngresado = sc.nextLine();

        System.out.println("La cadena " + textoIngresado + " es aceptada por el automata: " + g2ProcesarCadenaAutomata4(textoIngresado));
    }



}
