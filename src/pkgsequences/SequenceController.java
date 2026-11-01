package pkgsequences;

public class SequenceController {

    public void showSeries(int n) {

        LetterSeries letterSeries = new LetterSeries();
        MixedSeries mixedSeries = new MixedSeries();
        NumericSeries1 numericSeries1 = new NumericSeries1();
        NumericSeries2 numericSeries2 = new NumericSeries2();
        OperatorSeries operatorSeries = new OperatorSeries();

        numericSeries1.g2ImprimirFibonacci(n);
        numericSeries1.g2ImprimirImparesAlternados(n); 
        numericSeries1.g2ImprimirFibonacciSobreImpares(n);
        numericSeries1.g2ImprimirFibonacciSobrePares(n);
        numericSeries1.g2ImprimirNumerosPrimos(n);
        numericSeries1.g2ImprimirCuadradosPerfectos(n);
        numericSeries1.g2ImprimirProgresionAritmetica1(n);
        numericSeries1.g2imprimirProgresion(n);
        numericSeries1.g2imprimirPotencias2(n);

        numericSeries2.g2imprimirPotencias3(n);
        numericSeries2.g2imprimirNumOblongos(n);
        numericSeries2.g2imprimirNumTriangulares(n);
        numericSeries2.g2impimirFactoriales(n);
        numericSeries2.g2imprimirSignosAlternos(n);
        numericSeries2.g2imprimirCuadradosDesplazados(n);
        numericSeries2.g2imprimirRepunidades(n);
        numericSeries2.g2imprimirNumerosLucas(n);
        numericSeries2.g2imprimirNumerosCrecientes(n);
        numericSeries2.g2imprimirNumerosAlternados(n);

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
