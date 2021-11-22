/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2_basic;
import java.util.Random;
/**
 *
 * @author User
 */
public class Example4 {
    public static void main(String[]args){
        
        Random rand = new Random();
        
        int randNum1,randNum2;
        
        randNum1 = rand.nextInt(100);
        randNum2 = rand.nextInt(40);
        System.out.println(randNum1 + " " + randNum2);
        
        int randNum3;
        
        randNum3 = rand.nextInt(50)+50;
        System.out.println("Random Number between 50-100:"+randNum3);
        
    }
}
