////get bit
//package bignnerjava;
//public class Bitmanipulatiion {
//    public static void main(String[] args) {
//        int n=5, pos= 2, bitMask=1<<pos;
//        if((bitMask & n)==0){
//            System.out.println("zero");   
//        }
//        else{
//            System.out.println("one");
//        }
//    }   
//}


//set bit 
//package bignnerjava;
//public class Bitmanipulatiion {
//    public static void main(String[] args) {
//     int n=5, pos= 1, bitMask=1<<pos;
//     int a = bitMask | n;
//        System.out.println(a);
//    }
//    
//}

//clear bit 

//package bignnerjava;
//public class Bitmanipulatiion {  
//    public static void main(String[] args) {
//     int n=5, pos= 2, bitMask=1<<pos;
//     int notBitMask = ~(bitMask);
//     
//     int a= notBitMask & n;
//        System.out.println(a);
//    }
//}

//update bit 
package bignnerjava;

import java.util.Scanner;

public class Bitmanipulatiion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation   = sc.nextInt();
       int n=5, pos= 1, bitMask=1<<pos;
       if(operation == 1){
           //set
           int a = bitMask | n;
           System.out.println(a);
           
       }
       else{
           //clear  
           int newBitMask = ~(bitMask);
           int a = newBitMask & n;
           System.out.print(a);
       }
    }
    
    
}


