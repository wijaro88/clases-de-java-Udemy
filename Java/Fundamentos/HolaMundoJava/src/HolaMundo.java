
// import java.util.Scanner;

//mi clase en Java

// public class HolaMundo {

//     public static void main(String args[]) {
//         String nombre;
//         int libroId;
//         double precio;
//         boolean envio;

//         var consola = new Scanner(System.in);
        
//         System.out.println("Proporcione el nombre:");
//         nombre = consola.nextLine();
//         System.out.println("Proporciona el ID");
//         libroId = Integer.parseInt(consola.nextLine());
//         System.out.println("Proporciona el precio:");
//         precio= Double.parseDouble(consola.nextLine());
        
//         System.out.println("envio gratuito:(true or false)");
//         envio=Boolean.valueOf(consola.nextLine());

//         System.out.println(nombre+" #"+libroId);
//         System.out.println("Precio: $" +precio);
//         System.out.println("Envio Gratuito: " + envio);        
//     }
// }

import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Proporciona el id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el precio:");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
 
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito : " + envioGratuito);
    }
}