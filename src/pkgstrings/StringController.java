package pkgstrings;

public class StringController {
    
    public void showStringExercises1() {
        
        StringExercises1 stringExercises1 = new StringExercises1();
        StringExercises2 stringExercises2 = new StringExercises2();

        stringExercises1.g2contarVocales();
        stringExercises1.g2contarLetras();
        stringExercises1.g2eliminarVocales();
        stringExercises1.g2eliminarLetras();
        
        stringExercises2.g2invertirVocalesMayusculas();
        stringExercises2.g2invertirLetrasAlternadas();
        stringExercises2.g2mayusculasSinJ();
        stringExercises2.g2anagrama();
        stringExercises2.g2alternarMayusculasMinusculas();
    }
}
