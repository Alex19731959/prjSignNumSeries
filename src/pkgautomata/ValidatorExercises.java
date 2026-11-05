package pkgautomata;

import java.util.Scanner;

public class ValidatorExercises {

    /**
     * Método que valida si una contraseña cumple con los criterios de seguridad establecidos
     * Criterios:
     * - Debe tener al menos 4 caracteres  
     * - Debe contener al menos una letra mayúscula
     * - Debe contener al menos una letra minúscula
     * - Debe contener al menos un número
     * - Debe contener al menos un carácter especial (no alfanumérico)
     * @param password
     * @return
     */
    public boolean g2ValidarPassword(String password) {
        if (password.length() < 4) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }
            else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }

        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }

    /**
     * Método que solicita al usuario ingresar una contraseña y valida si es aceptada por el autómata A08
     * @return void
     */
    public void g2EjecutarValidadorPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEjercicio A08. Validador de contraseñas.");
        System.out.print("Ingrese una contraseña que cumpla con los criterios de seguridad: ");
        System.out.println("Criterios: Debe tener al menos 4 caracteres, una letra mayúscula, una letra minúscula, un número y un carácter especial.");
        System.out.print("Ingrese una contraseña: ");
        String password = scanner.nextLine();

        boolean esValida = g2ValidarPassword(password);
        System.out.println("La contraseña " + password + " es válida: " + esValida);
    }

}
