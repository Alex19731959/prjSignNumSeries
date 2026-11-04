package pkgstrings;

import java.util.Scanner;
public class StringController {
    
    public void showStringExercises1() {
        
        StringExercises1 stringExercises1 = new StringExercises1();
        StringExercises2 stringExercises2 = new StringExercises2();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase para iniciar la validacion: ");
        String frase = scanner.nextLine();

        stringExercises1.g2contarVocales(frase);
        stringExercises1.g2contarLetras(frase);

        System.out.print("Ingrese una vocal para eliminar de la frase: ");
        String vocal = scanner.nextLine();
        stringExercises1.g2eliminarVocales(frase, vocal);

        System.out.print("Ingrese una letra para eliminar de la frase: ");
        String letra = scanner.nextLine();
        stringExercises1.g2eliminarLetras(frase, letra);

        stringExercises2.g2invertirVocalesMayusculas(frase);
        stringExercises2.g2invertirLetrasAlternadas(frase);
        stringExercises2.g2mayusculasSinJ(frase);

        System.out.print("Ingrese la segunda frase para el anagrama: ");
        String frase2 = scanner.nextLine();
        stringExercises2.g2anagrama(frase, frase2);

        stringExercises2.g2alternarMayusculasMinusculas(frase);
    }
}
