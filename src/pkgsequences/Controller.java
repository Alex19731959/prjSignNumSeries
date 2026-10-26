package pkgsequences;

public class Controller {

    public void showSeries(int n) {

        LetterSeries letterSeries = new LetterSeries();
        letterSeries.g2imprimirLetrasConsecutivas(n);
        letterSeries.g2imprimirAlternaciaAlfabeto(n);

        MixedSeries mixedSeries = new MixedSeries();
        mixedSeries.g2imprimirLetrasSignosAlternados(n);

        NumericSeries numericSeries = new NumericSeries();
        numericSeries.g2ImprimirFibonacci(n);
        numericSeries.g2ImprimirImparesAlternados(n);
        numericSeries.g2ImprimirFibonacciSobreImpares(n);
        numericSeries.g2ImprimirFibonacciSobrePares(n);
        numericSeries.g2ImprimirNumerosPrimos(n);
        numericSeries.g2ImprimirCuadradosPerfectos(n);
        numericSeries.g2ImprimirProgresionAritmetica1(n);
        numericSeries.g2imprimirProgresion(n);
        numericSeries.g2imprimirPotencias2(n);
        numericSeries.g2imprimirPotencias3(n);
        numericSeries.g2imprimirNumOblongos(n);
        numericSeries.g2imprimirNumTriangulares(n);
        numericSeries.g2impimirFactoriales(n);
        numericSeries.g2imprimirSignosAlternos(n);
        numericSeries.g2imprimirCuadradosDesplazados(n);
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
