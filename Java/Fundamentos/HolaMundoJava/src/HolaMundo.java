
import java.util.Scanner;

// mi clase en Java

public class HolaMundo {

    public static void main(String args[]) {
        var a = 3;
        var b = -a;
        System.out.println("a= " + a);
        System.out.println("b= " + b);

        var c = true;
        var d = !c;
        System.out.println("c=" + c);
        System.out.println("d=" + d);

        // incremento
        // 1. preincremento( simbolo antes de la variable)
        var e = 3;
        var f = ++e;// primero incrementa la variable y despues su valor
        System.out.println("e="+e);
        System.out.println("f="+f);
        // 2. postincremento

        var g = 5;
        var h = g++;// primero se utiliza aelvalor de la variable y luego se inccrementa

        System.out.println("g="+g);//teniamos pendiente un incremento
        System.out.println("h="+h);
// decremento
var i=2;
var j=--i;
System.out.println("i=" +i);
System.out.println("j="+j);

var k =4;
var l = k--;//primero se usala variable y queda pendiente el decremento

System.out.println("k="+k);
System.out.println("l="+l);

    }
}
