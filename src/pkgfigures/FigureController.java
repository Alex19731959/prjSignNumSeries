package pkgfigures;

public class FigureController {
    
    public void showFigures (int n) {

        MixedFigures mixedFigures = new MixedFigures();
        NumericFigures numericFigures = new NumericFigures();
        OperatorFigures operatorFigures = new OperatorFigures();

        numericFigures.g2imprimirNumTriangularDescendiente(n);
        numericFigures.g2imprimirNumTriangularAscendiente(n);
        numericFigures.g2imprimirTrianguloPascal(n);
        numericFigures.g2imprimirTrianguloPascalAcostado(n);
        operatorFigures.g2imprimirXdeSignos(n);
        numericFigures.g2imprimirXBinaria(n);
        numericFigures.g2imprimirTrianguloPascalFila2(n);
        operatorFigures.g2imprimirEscaleraDescendente(n);

        mixedFigures.g2imprimirTrianguloPascalModificado(n);
    
    }
}
