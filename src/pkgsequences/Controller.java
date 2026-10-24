package pkgsequences;

public class Controller {

    public void showSeries() {

        LetterSeries letterSeries = new LetterSeries();
        letterSeries.imprimirAlternaciaAlfabeto();

        NumericSeries numericSeries = new NumericSeries();
        numericSeries.imprimirRepunidades();
        numericSeries.imprimirNumerosLucas();
        numericSeries.imprimirNumerosCrecientes();
        numericSeries.imprimirNumerosAlternados();

        OperatorSeries operatorSeries = new OperatorSeries();
        operatorSeries.imprimirNumerosEstrellas();
    }
}
