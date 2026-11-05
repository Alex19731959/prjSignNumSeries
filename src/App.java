import java.util.Scanner;

import pkgarrays.ArrayController;
import pkgautomata.AutomataController;
import pkgfigures.FigureController;
import pkgloading.LoadingController;
import pkgrecursive.RecursiveController;
import pkgsequences.SequenceController;
import pkgstrings.StringController;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("grupo-02\nIntegrantes:\n-imbaquingo.mateo\n-morillo.isaac\n-olalla.alexandra\n-placencia.isaac\n-redrovan.marcell");
        int n1, n2,n3;

        Scanner sc = new Scanner(System.in);
        System.out.println("\nSEQUENCES EXERCISES");
        System.out.print("Ingrese un parámetro n1: ");
        n1 = sc.nextInt();
        SequenceController controller = new SequenceController();
        controller.showSeries(n1);
        sc.nextLine(); 

        System.out.println("\nFIGURES EXERCISES");
        System.out.print("Ingrese un parámetro n2: ");
        n2 = sc.nextInt();
        FigureController figuresController = new FigureController();
        figuresController.showFigures(n2);
        sc.nextLine(); 

        System.out.println("\nSTRING EXERCISES");
        StringController stringController = new StringController();
        stringController.showStringExercises1();
        
        System.out.println("\nLOADING EXERCISES");
        LoadingController loadingController = new LoadingController();
        loadingController.showLoadingExercises2();

        System.out.println("\nRECURSIVE EXERCISES");
        RecursiveController recursiveController = new RecursiveController();
        recursiveController.showRecursiveExercises1();

        System.out.println("\nAUTOMATA EXERCISES");
        AutomataController automataController = new AutomataController();
        automataController.showAutomataExercises1();

        System.out.println("\nARRAY EXERCISES");
        System.out.print("Ingrese un parámetro n: ");
        n3 = sc.nextInt();
        sc.nextLine();
        ArrayController arrayController = new ArrayController();
        arrayController.showArrayExercises(n3);

        sc.close();
    }
}
