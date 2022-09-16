
package bignnerjava;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        int num,sum=0,temp,r;
        System.out.println("enter any num:");
         num=input.nextInt();
        temp=num;
        while(temp!=0){
            r=temp% 10;
            sum=sum*10+r;
            temp=temp/10;
        }
        if(num==sum){
            System.out.println("palindrome num");
        }
        else{
            System.out.println("not a palindrome num");
        }
    }
    
}
