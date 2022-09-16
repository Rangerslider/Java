
package bignnerjava;

import java.util.Scanner;

public class PositiveNegtive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("enter any integer:");
        num =input.nextInt();
        if(num>0){
            System.out.println("positive");
        }
        else if(num<0){
            System.out.println("negtive");  
        }
        else {
            System.out.println("zero");
        }
    }
    
}
