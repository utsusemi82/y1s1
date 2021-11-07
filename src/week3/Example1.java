/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author User
 */
public class Example1 {
    public static void main(String[] args) {
        
        int a=13;
        System.out.println("the value of A is " + a);
        
        if(a>0 && a<10){
            System.out.println("A is a positive number");
            System.out.println("A is larger than 0 but less than 10");
        }
        else if (a<0){
            System.out.println("A is a negative number");
            System.out.println("A is lesser than 0");
    }
        else{
            System.out.println("The number is invalid");
        }
    }
}
