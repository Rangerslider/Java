package bignnerjava;

import java.util.Scanner;

public class CapitalSmallLatter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    char ch;
     System.out.println("Enter any latter:"); 
     ch=input.next().charAt(0);
     if (ch>='a'&& ch<='z'){
         System.out.println("small latter");
     }
         else if (ch>='A'&& ch<='Z'){
                 System.out.println("capital latter");
                 }
         else{
             System.out.println("not a latter");
         }
}
}
