package pkgfigures;

public class FigureController {
    
    public void showFigures (int n) {

        MixedFigures mixedFigures = new MixedFigures();
        NumericFigures numericFigures = new NumericFigures();

        //! AQUI ISAAC 
        numericFigures.g2imprimirNumTriangularDescendiente(n);    
        mixedFigures.g2imprimirTrianguloPascalModificado(n);
    
    }
}
