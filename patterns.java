//*****
//*****
//*****
//*****

//package bignnerjava;
//import java.util.*;
//
//public class patterns {
//    public static void main(String[] args) {
//       int i,j,a=4,b=5;
//     
//       
//       for(i=1; i<=a; i++){
//           for(j=1;j<=b;j++){
//               System.out.print("*");
//           } 
//        System.out.println("");
//       }
//    }  
//    }
 

///////////////////////// holo rectengle //////////
//*****
//*   *
//*   *
//*****

//package bignnerjava;
//import java.util.*;
//
//public class patterns {
//    public static void main(String[] args) {
//        int i,j ,a=4,b=5;
//        
//        for(i=1; i<=a; i++){ // outer line 
//            for( j=1;j<=b;j++){//inner line 
//                if(i == 1 || j == 1 || i == a || j == b){ // boder line print r main method 
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//         
//        }
//    }
//    }



//////////////////piramid/////////////
//*
//**
//***
//****

//package bignnerjava;
//import java.util.*;
//
//public class patterns {
//    public static void main(String[] args) {
//        int i,j ,a=4;
//        
//        for(i=1; i<=a; i++){ // outer line piramid rule
//            for( j=1;j<=i;j++){//inner line rule 
//                System.out.print("*");
//            }
//            System.out.println("");
//         
//        }
//    }
//    }
//
///////////////////////////// ulta piramid/////////////
//****
//***
//**
//*
//package bignnerjava;
//import java.util.*;
//
//public class patterns {
//    public static void main(String[] args) {
//        int i,j ,a=4;
//        
//        for(i=a; i>=1; i--){ // outer line piramid rule
//            for( j=1;j<=i;j++){//inner line rule 
//                System.out.print("*");
//            }
//            System.out.println("");
//         
//        }
//    }
//    }
////////////////////////////// rotate piramid///////
//   *
//  **
// ***
//****

//package bignnerjava;
//import java.util.*;
//
//public class patterns {
//    public static void main(String[] args) {
//        int i,j ,a=4;
//        
//        for(i=1; i<=a; i++){ // outer line piramid rule
//            
//            //space  count
//            for( j=1;j<=a-i;j++){//inner line rule 
//                System.out.print(" ");
//            }
//            
//            for(j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//         
//        }
//    }
//    }

////////////////////// number print //////////////
//1 
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5 
//package bignnerjava;
//import java.util.*;
//
//public class patterns {
//    public static void main(String[] args) {
//        int i,j ,a=5;
//        
//        for(i=1; i<=a; i++){ // outer line piramid rule
//            
//            
//            for( j=1;j<=i;j++){//inner line rule 
//                System.out.print(j+" ");
//            }
//           
//            System.out.println("");
//         
//        }
//    }
//    }

//12345
//1234
//123
//12
//1
//package bignnerjava;
//import java.util.*;
//
//public class patterns {
//    public static void main(String[] args) {
//        int a=5;
//        
//        for(int i=1; i<=a; i++){ // outer line piramid rule
//            
//           
//            for(int j=1;j<=a-i+1;j++){//inner line rule 
//                System.out.print(j);
//            }
//           
//            System.out.println("");
//         
//        }
//    }
//    }




//1  
//2 3  
//4 5 6  
//7 8 9 10  
//11 12 13 14 15  
//
//package bignnerjava;
//import java.util.*;
//
//public class patterns {
//    public static void main(String[] args) {
//        int a=5, num=1;
//        
//        for(int i=1; i<=a; i++){ // outer line piramid rule
//            
//           
//            for(int j=1;j<=i;j++){//inner line rule 
//                System.out.print(num+" ");
//                num++;//num=num+1
//            }
//           
//            System.out.println(" ");
//         
//        }
//    }
//    }

// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1 
package bignnerjava;
import java.util.*;

public class patterns {
    public static void main(String[] args) {
        int a=5;
        
        for(int i=1; i<=a; i++){ // outer line piramid rule
            
           
            for(int j=1;j<=i;j++){//inner line rule
               int sum= i+j; ////////// ekhane index e matrix r i,j r value sum korle even num ase segula 11 r odd num ase 0 gula 
               if(sum % 2 == 0){
                   System.out.print(" 1");
               }
               else{
                   System.out.print(" 0");
               }
            }
           
            System.out.println(" ");
         
        }
    }
}
 