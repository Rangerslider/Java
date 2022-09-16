//1.print sum of all the number from 1 to10
/*package bignnerjava;
public class LoopRelated {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=10;i++){
            sum=sum+i;
        }
        System.out.println("the sum is :"+sum);
    }
    
}*/

///2.print sum of all the number from n to m////


/*package bignnerjava;

import java.util.Scanner;

public class LoopRelated {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          int sum=0;
          int m,n;
          System.out.println("enter inital num:");
          m=input.nextInt();
          System.out.println("enter final num: ");
          n=input.nextInt();
           for(int i=m;i<=n;i++){
            sum=sum+i;
           }
           System.out.println("The sum is:"+sum);
    }
}*/


/////3.even num m to n////

/*package bignnerjava;

import java.util.Scanner;

public class LoopRelated {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          int sum=0;
          int m,n;
          System.out.print("enter inital num:");
          m=input.nextInt();
          System.out.print("enter final num: ");
          n=input.nextInt();
           for(int i=m;i<=n;i++){
               if(i%2==0){
            sum=sum+i;
                   System.out.print(" "+i);
           }
           }
           System.out.println("");
           System.out.println("The sum is:"+sum);
    
}
}*/


/////4.odd num m to n////
package bignnerjava;

import java.util.Scanner;

public class LoopRelated {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          int sum=0;
          int m,n;
          System.out.print("enter inital num:");
          m=input.nextInt();
          System.out.print("enter final num: ");
          n=input.nextInt();
           for(int i=m;i<=n;i++){
               if(i%2!=0){
            sum=sum+i;
                   System.out.print(" "+i);
           }
           }
           System.out.println("");
           System.out.println("The sum is:"+sum);
    
}
}