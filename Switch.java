package bignnerjava;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        int digit;
         System.out.println("enter any digit:");
        digit =input.nextInt();
        switch(digit){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            default:
                System.out.println("not a digit");
           
                
        }
    }
    
}
