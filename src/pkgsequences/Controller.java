package pkgsequences;

public class Controller {

    public void showSeries() {
        NumericSeries numericSeries = new NumericSeries();
        numericSeries.imprimirRepunidades();
        numericSeries.imprimirNumerosLucas();
        numericSeries.imprimirNumerosCrecientes();
        numericSeries.imprimirNumerosAlternados();

        OperatorSeries operatorSeries = new OperatorSeries();
        operatorSeries.imprimirNumerosEstrellas();
    }
}
