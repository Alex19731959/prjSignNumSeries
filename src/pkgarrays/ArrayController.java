package pkgarrays;

public class ArrayController {

    public void showArrayExercises(int n) {
        ArraysExercises arraysExercises = new ArraysExercises();
        arraysExercises.g2imprimirArrayCargaNombre(n);
        arraysExercises.g2imprimirMatrizIniciales(n);
        arraysExercises.g2imprimirPlanoCoordenadas(n);
        arraysExercises.g2imprimirMatrizXNombreApellido(n);
        arraysExercises.g2imprimirMatrizAleatoriaConDelay(n);
    }
}
