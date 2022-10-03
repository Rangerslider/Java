/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//concatation of string 


//package bignnerjava;
//import java.util.*;
//public class Strings {
//    public static void main(String[] args) {
//        
//         String fname = "nuri";
//         String lname = "joy";
//         
//         //System.out.println( fullname); ///here we concate two string 
//         String fullname = fname + " " + lname ;  
//         
//         
//          // here using length() function we calculate our string variable(nuri joy) length
//         System.out.println(fullname.length());
//         
//         
//         // charAt eta array r moto sob indx e jabe car store korbe den print korbe
//         
//         for(int i=0; i<fullname.length(); i++){
//             System.out.println(fullname.charAt(i));
//             
//       
//        
//         }
//    }
//    
//}

/////////////////////////////////////////////////////string compare
//package bignnerjava;
//import java.util.*;
//public class Strings {
//    public static void main(String[] args) {
//        String name1 = "nuri";
//        String name2 = "nuri";
//        
//        //case1 = str1> str2 : +value 
//        //case2 = str==str2  : null
//        //case3= s1< str2  : - value 
//        
//        if(name1.compareTo(name2) == 0){ // comapareto method use korbo cs == use korle onek time e function thik moto compare korte pare na 
//            System.out.println("str is equal");
//        }
//        else {
//            System.out.println("str is not equal");
//        }
//            
//               
//    }
//}

//sub string 
//package bignnerjava;
//import java.util.*;
//public class Strings {
//    public static void main(String[] args) {
//        String sentence = "my name is nuri";
//        //substring(beg index , end index)
//        String name =  sentence.substring(11, sentence.length());
//        System.out.println(name);
//    }
//    
//}

//////////////////////////////////////string builder
//package bignnerjava;
//import java.util.*;
//public class Strings {
//    public static void main(String[] args) {
//     StringBuilder sb = new StringBuilder("joy");
//        System.out.println(sb);
//        
//        //char at index 0
//        System.out.println(sb.charAt(0)); 
//        
//        // set char at index 0
//        sb.setCharAt(0,'c');
//        System.out.println(sb);
//        
//        //insert 
//        sb.insert(2,'m');
//        System.out.println(sb);
//        
//        ///delete
//        sb.delete(2,3);
//        System.out.println(sb);
//        
//        ///appand mane last index  e add kora index
//        sb.append("a");/// str =str +"a";
//        System.out.println(sb);
//       
//    }
//    
//}

package bignnerjava;
import java.util.*;
public class Strings {
    public static void main(String[] args) {
     StringBuilder sb = new StringBuilder("joy");
      for(int i=0; i<sb.length()/2; i++){
          int fornt =i;
          int back = sb.length()-1 -i; ///5-1-0 => 4 
          
          char forntchar = sb.charAt(fornt);
          char backchar = sb.charAt(back);
          
          sb.setCharAt(fornt ,backchar);
          sb.setCharAt(back ,forntchar);
       
      }
        System.out.println(sb);
}
}



    