/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week4_looping;

import java.util.Random;

/**
 *
 * @author User
 */
public class Example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random rand = new Random();
        
        int num;
        int count =0; 
        
        do{
            num=rand.nextInt();
            count++;
        }while(num < 0);      //print positive number
        
        System.out.println("After "+ count + " loop, the value of num(+ve number): "+ num);
            
        count=0;
        do{
            num=rand.nextInt();
            count++;
        }while(num % 2 == 0);       //print odd number
        
        System.out.println("After "+ count + " loop, the value of num(odd): "+ num);
            
        count=0;
        do{
            num=rand.nextInt();
            count++;
        }while(!((num > 0) && (num % 2 == 0)));       //print positive and even number
        
        System.out.println("After "+ count + " loop, the value of num(positive and even): "+ num);
        
    }
    
}
