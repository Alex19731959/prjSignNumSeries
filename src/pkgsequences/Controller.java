package pkgsequences;

public class Controller {

    public void showSeries(int n) {

        LetterSeries letterSeries = new LetterSeries();
        letterSeries.g2imprimirAlternaciaAlfabeto(n);

        MixedSeries mixedSeries = new MixedSeries();
        mixedSeries.g2imprimirLetrasSignosAlternados(n);

        NumericSeries numericSeries = new NumericSeries();
        numericSeries.g2imprimirRepunidades(n);
        numericSeries.g2imprimirNumerosLucas(n);
        numericSeries.g2imprimirNumerosCrecientes(n);
        numericSeries.g2imprimirNumerosAlternados(n);

        OperatorSeries operatorSeries = new OperatorSeries();
        operatorSeries.g2imprimirSignosAlternados(n);
        operatorSeries.g2imprimirGruposSignos1(n);
        operatorSeries.g2imprimirGruposSignos2(n);
        operatorSeries.g2imprimirOperadoresCiclicos(n);
        operatorSeries.g2imprimirIndicadorDireccionalCiclo(n);
        operatorSeries.g2imprimirNumerosEstrellas(n);
        operatorSeries.g2imprimirAlternanciaOperadores(n);
    }
}
