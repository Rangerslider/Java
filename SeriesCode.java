///1. 1+2+3+4+......+n
/*package bignnerjava;

import java.util.Scanner;

public class SeriesCode {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          int sum=0;
          int n;
          System.out.print("enter the last num:");
          n=input.nextInt();
          for(int i=1;i<=n;i++){
                System.out.print(" "+i);
            sum=sum+i;
                  
           }
           System.out.println("");
           System.out.println("The sum is:"+sum);
           }
         
    
}*/

///2. 1+3+5+......+n    
/*package bignnerjava;

import java.util.Scanner;

public class SeriesCode {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          int sum=0;
          int n;
          System.out.print("enter the last num:");
          n=input.nextInt();
          for(int i=1;i<=n;i=i+2){
                System.out.print(" "+i);
            sum=sum+i;
                  
           }
           System.out.println("");
           System.out.println("The sum is:"+sum);
           }
         
    
}*/
    

///3. 1.5+2.5+3.5+......+n
/*package bignnerjava;

import java.util.Scanner;

public class SeriesCode {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          double n, sum=0;
          System.out.print("enter the last num:");
          n=input.nextDouble();
          for(double i=1.5;i<=n;i=i+1){
                System.out.print(i+" ");
            sum=sum+i;       
           }
           System.out.println("");
           System.out.println("The sum is:"+sum);
           }
         
    
}*/


///4. 1^2+2^2+3^2+......+n

/*package bignnerjava;

import java.util.Scanner;

public class SeriesCode {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          int sum=0;
          int n;
          System.out.print("enter the last num:");
          n=input.nextInt();
          for(int i=1;i<=n;i=i+1){
                System.out.print(" "+i);
            sum=sum+i*i;
                  
           }
           System.out.println("");
           System.out.println("The sum is:"+sum);
           }
         
    
}*/



///5. 2+4+6+......+n    
/*package bignnerjava;

import java.util.Scanner;

public class SeriesCode {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          int sum=0;
          int n;
          System.out.print("enter the last num:");
          n=input.nextInt();
          for(int i=2;i<=n;i=i+2){
                System.out.print(" "+i);
            sum=sum+i;
                  
           }
           System.out.println("");
           System.out.println("The sum is:"+sum);
           }
         
    
}*/

//////1*2*3*.....*n

package bignnerjava;

import java.util.Scanner;

public class SeriesCode {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          int result=1;
          int n;
          System.out.print("enter the last num:");
          n=input.nextInt();
          for(int i=1;i<n;i++){
                System.out.print(i+" ");
           result =result*i;
                  
           }
           System.out.println("");
           System.out.println(result);
           }
         
    
}