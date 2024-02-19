
import java.util.Scanner;

// mi clase en Java

public class HolaMundo {

    public static void main(String args[]) {
        var a = 3;
        var b = 2;
        //operador de igualdad ==
        var c=(a==b);

        System.out.println("c= " + c);

        var d= a !=b;

        System.out.println("d= " + d);

        var cadena= "Hola";
        var cadena2 = "Hola";
        var e= cadena ==cadena2;//cmpara referencias de objetos
        System.out.println(e);
        var f=cadena.equals(cadena2);//comparamos contenido de cadenas
        System.out.println(f);
    }
}
