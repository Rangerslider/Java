
/*package bignnerjava;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print("Enter any positive integer:");
         int num= input.nextInt();
         int count=0;
         for(int i=2;i<num;i++){
             if(num%i==0){
                 count++;
                 break;
             }
         }
         if (count==0){
             System.out.println("prime number");
         }
         else{
             System.out.println("not prime number");
         }
    }
    
}*/

package bignnerjava;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int m,n;
         Scanner input = new Scanner(System.in);
         System.out.print("Enter inital number:");
        m = input.nextInt();
         System.out.print("Enter ending number:");
        n = input.nextInt();
      
         for(int i=m;i<n;i++){
            int count = 0;
             for(int j=2;j<i-1;j++){
             if(i%j==0){
                 count++;
                 break;
             }
         }
         if (count==0){
             System.out.println("prime num: "+i);
             
         }
          else{
             System.out.println("not prime number");
         }
        
         }
    }
    
}
