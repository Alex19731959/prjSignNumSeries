import java.util.Scanner;
import pkgsequences.SequenceController;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("grupo-02\nIntegrantes:\n-imbaquingo.mateo\n-morillo.isaac\n-olalla.alexandra\n-placencia.isaac\n-redrovan.marcell");
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un parámetro n: ");
        n = sc.nextInt();
        SequenceController controller = new SequenceController();
        controller.showSeries(n);
        sc.close();
    }
}
