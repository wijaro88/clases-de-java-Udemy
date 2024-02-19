
import java.util.Scanner;

// mi clase en Java

public class HolaMundo {

    public static void main(String args[]) {
        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("resultado = " + resultado);

        resultado = a - b;
        System.out.println("resultado resta = " + resultado);

        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);

        var resultado2 = 3.0 / b;
        System.out.println("resultado = " + resultado2);

        resultado = a % b;
        System.out.println("resultado modulo = " + resultado);

        if (b % 2 == 0)
            System.out.println("numero par");
        else
            System.out.println("numero impar");
    }
}
