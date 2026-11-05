package pkgloading;

public class LoadingController {

    public void showLoadingExercises2() throws InterruptedException {

        LoadingExercises1 loadingExercises1 = new LoadingExercises1();
        loadingExercises1.g2ImprimirBarradeCarga();
        loadingExercises1.g2DesplazarCaracter();
        loadingExercises1.g2AnimarWaiting();
        loadingExercises1.g2AnimarBarra();
        loadingExercises1.g2AnimarBarraDesplazable();
        loadingExercises1.g2AnimarBarraRotacional();
        loadingExercises1.g2AnimarCargaNombre();
        loadingExercises1.g2AnimarCargaNombrePorLetra();

        LoadingExercises2 loadingExercises2 = new LoadingExercises2();

        loadingExercises2.g2ImprimirSenal();
        loadingExercises2.g2ImprimirBarras();
        loadingExercises2.g2AnimacionFigura();
    }

}