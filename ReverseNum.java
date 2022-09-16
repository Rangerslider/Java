
/*package bignnerjava;

import java.util.Scanner;

public class ReverseNum {
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
        System.out.println("reverse="+sum);
        }
    }*/


///////write a program that read any positive integer and display sum 0f digit///



package bignnerjava;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        int num,sum=0,temp,r;
        System.out.println("enter any num:");
         num=input.nextInt();
        temp=num;
        while(temp!=0){
            r=temp% 10;
            sum=sum+r;
            temp=temp/10;
        }
        System.out.println("sum of degit="+sum);
        }
    }    

    

