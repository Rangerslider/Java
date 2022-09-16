
package bignnerjava;

import java.util.Scanner;

public class tamperutaure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cels,farn;
        System.out.print("celsious=");
        cels=input.nextDouble();
        farn=1.8*cels+32;
        System.out.println("farnhit:"+farn);
    }
  
}