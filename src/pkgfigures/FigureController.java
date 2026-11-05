package pkgfigures;

public class FigureController {
    
    public void showFigures (int n) {

        MixedFigures mixedFigures = new MixedFigures();
        NumericFigures numericFigures = new NumericFigures();
        OperatorFigures operatorFigures = new OperatorFigures();
        AsteriskFigures asteriskFigures = new AsteriskFigures();

        operatorFigures.g2imprimirEscaleraDescendente(n);
        operatorFigures.g2imprimirEscaleraAscendente(n);
        operatorFigures.g2imprimirEscaleraAscendenteDescendente(n);
        operatorFigures.g2imprimirEscaleraSignosDescendente(n);
        operatorFigures.g2imprimirEscalerasDescendentesIterativas(n);
        numericFigures.g2imprimirNumTriangularDescendiente(n);
        numericFigures.g2imprimirNumTriangularAscendiente(n);
        numericFigures.g2imprimirTrianguloPascal(n);
        numericFigures.g2imprimirTrianguloPascalAcostado(n);
        operatorFigures.g2imprimirXdeSignos(n);
        numericFigures.g2imprimirXBinaria(n);
        numericFigures.g2imprimirTrianguloPascalFila2(n);
        mixedFigures.g2EjecutarTrianguloPascalModificado(n);
        asteriskFigures.g2imprimirFiguraF1(n);
        asteriskFigures.g2imprimirFiguraF2(n);
        asteriskFigures.g2imprimirFiguraF3(n);
        asteriskFigures.g2imprimirFiguraF4(n);
        asteriskFigures.g2imprimirFiguraF5(n);
        asteriskFigures.g2imprimirFiguraF6(n);

    }
}
