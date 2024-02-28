
import java.util.Scanner;

// mi clase en Java

public class HolaMundo {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el Alto del Rectangulo:");
        int Alto = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el Ancho del Rectangulo:");
        int Ancho = Integer.parseInt(scanner.nextLine());
        var area=Alto*Ancho;
        var perimetro=(Alto+Ancho)*2;
        System.out.println("El Area del Rectangulo es: "+area);
        System.out.println("El Perimetro del Rectangulo es: "+perimetro);

            
        }
}
