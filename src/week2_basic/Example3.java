/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2_basic;

import java.util.Scanner;
    public class Example3 {
        public static void main(String[] args){
            //TODO code application logic here
            Scanner input = new Scanner(System.in);
        
            int num1,num2;
        
            System.out.print("Enter two number:");
            num1=input.nextInt();
            num2=input.nextInt();
            System.out.printf("The value entered:%d %d\n",num1,num2);
            System.out.printf("%d + %d = %d",num1,num2,num1+num2);
        
        
    }
}
