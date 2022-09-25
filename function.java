
package bignnerjava;
public class function {
    public static void main(String[] args) {
       int n1 = Math.abs(80);//abs positive value return kore negitive holeo pos dibe
       System.out.println("absolute value of 80 is: "+n1);
       int n2 = Math.abs(-60);
       System.out.println("absolute value of -60 is: "+n2);
       
        
       double n3 = Math.sqrt(36.0);//square
       System.out.println("Square root of 36.0 is: "+n3);

       double n4 = Math.cbrt(8.0);//cube
       System.out.println("cube root 0f 8.0 is: "+n4);
 
       int n5= Math.max(15,80);
       System.out.println("max value is: "+n5);
 
       int n6 =Math.min(15,80);
       System.out.println("min value is: "+n6);

       double n7 = Math.ceil(6.34);
       System.out.println("ceil value of 6.34 is "+n7);

       double n8 = Math.floor(6.34);
       System.out.println("floor value of 6.34 is: "+n8);

       double n9 = Math.round(22.445);
       System.out.println("round value of 22.445 is: "+n9);

       double n10 = Math.round(22.545);
       System.out.println("round value of 22.545 is: "+n10);

       double n11= Math.pow(2.0, 3.0);
       System.out.println("power value is: "+n11);

       double n12= Math.random();
       System.out.println("random value is: "+n12);

       double n13 = Math. signum (22.4);
       System.out.println("signum value of 22.4 is: "+n13);

       double n14 = Math. signum (-22.5);
       System.out.println("signum value of 22.5 is: "+n14);
 
       int n15= Math.addExact(35, 21);
       System.out.println("added value is: "+n15);

       int n16=Math. incrementExact(36);
       System.out.println("increment of 36 is: "+n16);

       int n17 = Math.subtractExact(36, 11);
       System.out.println("difference is: "+n17);

       int n18 = Math.multiplyExact(5, 5);
       System.out.println("product is: "+n18);

       int n19 =Math. decrementExact (36);
       System.out.println("decrement of 36 is: "+n19);

       int n20 =Math. negateExact(36);
       System.out.println("negation value of 36 is: "+n20);
       
       double num1 = 60;
      // Conversion of value to radians
    double value = Math.toRadians(num1);
    System.out.println("sine value is : "+Math.sin(value));
    System.out.println("cosine value is : "+Math.cos(value));
    System.out.println("tangent value is : "+Math.tan(value));
    
    double num2 = 1.0;
    System.out.println("acosine value is : "+Math.acos(num2));
    System.out.println("asine value is : "+Math.asin(num2));
    
     double num3 = 6.267;
     System.out.println("atangent value is : "+Math.atan(num3));
     
    double a1 = Math.expm1(2.0);
    double a2 = Math.exp(2.0);
    double a3 = Math.log(38.9);
    double a4 = Math.log10(38.9);
    double a5 = Math.log1p(26);
    double a6 = Math.sinh (30);
    double a7 = Math.cosh (60.0);
    double a8 = Math.tanh (60.0);
    double a9 = Math.toRadians(180.0);
    double a10 = Math. toDegrees (Math.PI);

    System.out.println("expm1 value of 2.0 is : "+a1);
    System.out.println("exp value of 2.0 is : "+a2);
    System.out.println("log of 38.9 is : "+a3);
    System.out.println("log10 of 38.9 is : "+a4);
    System.out.println("log1p of 26 is : "+a5);
    System.out.println("Hyperbolic sine value of 300 is : "+a6);
    System.out.println("Hyperbolic cosine value of 60.0 is : "+a7);
    System.out.println("Hyperbolic tangent value of 60.0 is : "+a8);
    System.out.println("Radian value of 180.0 is : "+a9);
    System.out.println("Degree value of pi is : "+a10);

}
}

//output
//absolute value of 80 is: 80
//absolute value of -60 is: 60
//Square root of 36.0 is: 6.0
//cube root 0f 8.0 is: 2.0
//max value is: 80
//min value is: 15
//ceil value of 6.34 is 7.0
//floor value of 6.34 is: 6.0
//round value of 22.445 is: 22.0
//round value of 22.545 is: 23.0
//power value is: 8.0
//random value is: 0.8737401140129851
//signum value of 22.4 is: 1.0
//signum value of 22.5 is: -1.0
//added value is: 56
//increment of 36 is: 37
//difference is: 25
//product is: 25
//decrement of 36 is: 35
//negation value of 36 is: -36
//sine value is : 0.8660254037844386
//cosine value is : 0.5000000000000001
//tangent value is : 1.7320508075688767
//acosine value is : 0.0
//asine value is : 1.5707963267948966
//atangent value is : 1.4125642791467878
//expm1 value of 2.0 is : 6.38905609893065
//exp value of 2.0 is : 7.38905609893065
//log of 38.9 is : 3.6609942506244004
//log10 of 38.9 is : 1.5899496013257077
//log1p of 26 is : 3.295836866004329
//Hyperbolic sine value of 300 is : 5.343237290762231E12
//Hyperbolic cosine value of 60.0 is : 5.710036949078421E25
//Hyperbolic tangent value of 60.0 is : 1.0
//Radian value of 180.0 is : 3.141592653589793
//Degree value of pi is : 180.0

