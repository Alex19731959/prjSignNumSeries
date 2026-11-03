package pkgautomata;

import java.util.Scanner;

public class ValidatorExercises {

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

    public void g2EjecutarValidadorPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEjercicio A08. Validador de contraseñas.");
        System.out.print("Ingrese una contraseña: ");
        String password = scanner.nextLine();

        boolean esValida = g2ValidarPassword(password);
        System.out.println("La contraseña " + password + " es válida: " + esValida);
    }

}
