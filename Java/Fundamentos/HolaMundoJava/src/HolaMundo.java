
import java.util.Scanner;

// mi clase en Java

public class HolaMundo {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona un numero:");
        int numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona otro numero:");
        int numero2 = Integer.parseInt(scanner.nextLine());
        if (numero1 == numero2) {
            System.out.println("Los numeros son iguales");
        } else if (numero1 < numero2) {
            System.out.println("el numero mayor es:" + numero2);
        } else {
            System.out.println("el numero mayor es:" + numero1);
        }
    }
}
