/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8_javamethod;

import java.util.Random;

public class Example{
    
 //method definition
    public static void msg() {
        System.out.println("I am the callee");
    }
    public static void welcome(String a) {
        System.out.println("Welcome " + a);
    }
    
    public static void welcome(String a, int b) {
        System.out.println("Welcome " + a);
        System.out.println("You are " + b + " years old");
    }
    
    public static double areaOfCircle(double r) {
            return Math.PI * r * r;
    }
    
    public static String special(int a) {
        switch(a) {
            case 1:
                return "A"; //exit method                
            case 2:
                return "B";
            default :
                return "C";
        }
    }
    
    public static void nochange(int num) {
        num++;
    }
    
    public static void withchange(int[] num) {
        num[2]+=5;
    }
    
    // from N random numbers from A - B     
    public static void generateRandom(int N, int A, int B, int[] c) {
        Random r = new Random();
        for(int i=0; i<N; i++) {
            c[i] = r.nextInt(B-A+1) + A;
        }
    }
    // return the number of odd and even number 
    public static int getOdd(int[] c) {
        int odd=0;
        for(int i=0; i<c.length; i++) {
            if (c[i]%2==1) {
                odd++;
            }
        }
        return odd;
    }
    
    public static int[] getOddEven(int[] c) {
        int[] cnt= new int[2];
        for(int i=0; i<c.length; i++) {
            if (c[i]%2==1) {
               cnt[0]++;
            }
            else
               cnt[1]++; 
        }
        return cnt;
    }
   
    public static void main(String[] args) {


        // System.out.println("Testing");
     
        /*
        System.out.println("Caller");
        msg();
        
        // methods without return value        
        // Parameter, Argument
        welcome("Java");
        String str = "Tan Fong";
        welcome(str);
        
        int age = 25;
        welcome("Ang", 20);
        welcome(str, age);
        
        // System.getProperty - "os.name", "os.version"  "user.dir";
        info("os.name");
        
        // methods with return value
        System.out.println("Area of Cirlce " + areaOfCircle(2.5));
        
        double radius = 4.7;
        System.out.println("Area of Cirlce " + areaOfCircle(radius));
        
        System.out.println("Number of U and M is " + getAlphabetUM("Welcome"));
       
        String str = "SpectrUM";
        int cnt = getAlphabetUM(str);
        System.out.println("Number of U and M is " + cnt);
        
          // pass by value
        int num=6;
        nochange(num);        
        System.out.println(num);
        int[] num1 = new int[3];
        num1[2]=3;
        nochange(num1[2]);
        System.out.println(num1[2]);
        
        // pass by reference 
        withchange(num1);
        System.out.println(num1[2]);
        
        //how to make a copy in array?
        int[] f1 = {1,2,3,4};
        // a copy of array f1
        int[] f1copy = f1.clone();
        f1copy[0]+=5;
        System.out.println(f1[0]);    
        // array is reference data type
        int[] f2 = f1;
        f2[0]+=5;
        System.out.println(f1[0]);   
        
        */
        int min=10, max=50;
        int[] num = new int[10];
        generateRandom(num.length, min, max, num);
        for(int i=0; i<num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println("");
        System.out.println("Number of odd number : " + getOdd(num));
        System.out.println("Number of even number : " + (num.length-getOdd(num)));
        int[] result = getOddEven(num);
        System.out.println("Number of odd number : " + result[0]);
        System.out.println("Number of even number : " + result[1]);
        
         
       
           
    }
    
    // display Java Version no parameter
    public static void version() {
        System.out.println(System.getProperty("java.version"));
    }
        
    // display Java System Properties - one parameter
    public static void info(String name) {
        System.out.println(System.getProperty(name));
    }
    
        // display square number from 1 - 10
    public static void square() {
        final int MAX=10;
        for(int i=1; i<=MAX; i++) {
            System.out.print(i*i + " ");
        }
        System.out.println("");        
    }
    
    // display square number from A - B (A and B are the parameters)
    // precondition : A < B
    public static void square(int A, int B) {
        for(int i=A; i<=B; i++) {
            System.out.print(i*i + " ");
        }
        System.out.println("");
    }
    
    // precondition : A < B, N>=1
    // postcondition: display N random number from A - B (N, A and B are parameters)
    public static void randomnumber(int N, int A, int B) {
        Random r = new Random();
        for(int i=1; i<=N; i++) {
            System.out.print( (r.nextInt(B-A+1)+A) + " ");
        }
        System.out.println("");    
    }
    
    // postcondition- return the number of alphabet U and M in the parameter
    public static int getAlphabetUM(String a) {
        int cnt=0;
        for(int i=0; i<a.length(); i++) {
            if (a.charAt(i)=='U' || a.charAt(i)=='M') {
                cnt++;
            }
        }
        return cnt;
    }
    
    // return the perimeter of rectangle (width and height are parameters)
    public static double getPerimeter(double width, double height) {
        return (width+height)*2;
    }
    
    // return the perimeter of circle (radius is parameters)
    public static double getPerimeter(double radius) {
        return 2*Math.PI*radius;
    }
    
    // return the number of odd number from N random numbers from A - B
    public static int getOdd(int[] num, int A, int B) {
        Random r = new Random();
        int cntOdd=0;
        for(int i=0; i<num.length; i++) {
            num[i] = (r.nextInt(B-A+1)+A);
            if (num[i]%2==1) {
                cntOdd++;
            }
        }
        return cntOdd;
    }
    
    // return the number of odd and even number from N random numbers from A - B 
    public static int[] getOddEven(int[] num, int A, int B) {
        Random r = new Random();
        int[] cnt=new int[2];
        for(int i=0; i<num.length; i++) {
            num[i] = (r.nextInt(B-A+1)+A);
            if (num[i]%2==1) {
                cnt[0]++;
            }
            else {
                cnt[1]++;
            }
        }
        return cnt;
    }
}
