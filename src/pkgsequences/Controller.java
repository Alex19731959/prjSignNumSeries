package pkgsequences;

public class Controller {

    public void showSeries(int n) {

        LetterSeries letterSeries = new LetterSeries();
        MixedSeries mixedSeries = new MixedSeries();
        NumericSeries numericSeries = new NumericSeries();
        OperatorSeries operatorSeries = new OperatorSeries();

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
        operatorSeries.g2imprimirSignosAlternados(n);
        operatorSeries.g2imprimirGruposSignos1(n);
        operatorSeries.g2imprimirGruposSignos2(n);
        operatorSeries.g2imprimirOperadoresCiclicos(n);
        operatorSeries.g2imprimirIndicadorDireccionalCiclo(n);
        letterSeries.g2imprimirLetrasConsecutivas(n);
        mixedSeries.g2imprimirLetrasSignosAlternados(n);
        letterSeries.g2generarSerieAlfabetoSC08(n);
        letterSeries.g2generarSerieAlfabetoSC09(n);
        letterSeries.g2generarSerieAlfabetoSC10(n);
        operatorSeries.g2ImprimirSerieParNumerosSC11(n);
        letterSeries.g2generarSerieVocalesSC12(n);
        letterSeries.g2generarSerieAlfabetoSC13(n);
        letterSeries.g2generarSerieAlfabetoSC14(n);
        operatorSeries.g2imprimirNumerosEstrellas(n);
        letterSeries.g2imprimirAlternaciaAlfabeto(n);
        operatorSeries.g2imprimirAlternanciaOperadores(n);
    }
}
