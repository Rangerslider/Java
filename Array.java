//2d array input output print
//package bignnerjava;
//import java.util.*;
//public class Array {
//    public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int row = sc.nextInt();
//     int col = sc.nextInt();
//     
//     int[][] num =new int[row][col];
//     
//     
//       // input rows
//       for(int i=0; i<row; i++) {
//           //colum
//           for(int j= 0; j<col; j++){
//               num[i][j]= sc.nextInt();
//           }
//       }
//       
//       //output
//       for(int i=0; i<row; i++) {
//           for(int j=0; j<col; j++){
//               System.out.print(num[i][j] + " ");
//           }
//           System.out.println();
//       }
//
//    }
//}


//3
//4
//1 2 3 4
//4 3 2 11
//1 2 3 4
//11
//x find the location:(1 ,3)
//package bignnerjava;
//import java.util.*;
//public class Array {
//    public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int row = sc.nextInt();
//     int col = sc.nextInt();
//     
//     int[][] num =new int[row][col];
//     
//     
//       // input rows
//       for(int i=0; i<row; i++) {
//           //colum
//           for(int j= 0; j<col; j++){
//               num[i][j]= sc.nextInt();
//           }
//       }
//        int x = sc.nextInt();
//       //output
//       for(int i=0; i<row; i++) {
//           for(int j=0; j<col; j++){
//               //compare with x
//               if(num[i][j] == x){
//                   System.out.print("x find the location:(" + i +"," + j + ")");
//               }
//               System.out.println("");
//           }
//           
//       }
//
//    }
//}


////passing array 
//package bignnerjava;
//import java.util.*;
//public class Array {
//    public static void main(String[] args) {
//                int arr[] = { 3, 1, 2, 5, 4 };
//                sum(arr);
//    }
//    public static void sum(int[] arr)
//    {
//        // getting sum of array values
//        int sum = 0;
//  
//        for (int i = 0; i < arr.length; i++)
//            sum += arr[i];
//  
//        System.out.println("sum of array values : " + sum);
//    }
//}


//Returning Arrays from Methods
//package bignnerjava;
//import java.util.*;
//public class Array {
//    public static void main(String[] args) {
//       int arr[] = m1();
//  
//        for (int i = 0; i < arr.length; i++)
//            System.out.print(arr[i] + " ");
//    }
//     
//    
//    public static int[] m1()
//    {
//        // returning  array
//        return new int[] { 1, 2, 3 };
//    }
//}

//Class Objects for Arrays
//package bignnerjava;
//import java.util.*;
//public class Array {
//    public static void main(String[] args) {
//        int intArray[] = new int[3];
//        byte byteArray[] = new byte[3];
//        short shortsArray[] = new short[3];
//  
//        // array of Strings
//        String[] strArray = new String[3];
//  
//        System.out.println(intArray.getClass());
//        System.out.println(
//            intArray.getClass().getSuperclass());
//        System.out.println(byteArray.getClass());
//        System.out.println(shortsArray.getClass());
//        System.out.println(strArray.getClass());
//    }
//}

//output
//class [I
//class java.lang.Object
//class [B
//class [S
//class [Ljava.lang.String;
//
//The string “[I” is the run-time type signature for the class object “array with component type int.”
//The only direct super class of an array type is java.lang.Object.
//The string “[B” is the run-time type signature for the class object “array with component type byte.”
//The string “[S” is the run-time type signature for the class object “array with component type short.”
//The string “[L” is the run-time type signature for the class object “array with component type of a Class.” The Class name is then followed.

