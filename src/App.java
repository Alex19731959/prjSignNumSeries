import java.util.Scanner;
import pkgsequences.Controller;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("grupo-02\nIntegrantes:\n-imbaquingo.mateo\n-morillo.isaac\n-olalla.alexandra\n-placencia.isaac\n-redrovan.marcell");
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un parámetro n: ");
        n = sc.nextInt();
        Controller controller = new Controller();
        controller.showSeries(n);
        sc.close();
    }
}
