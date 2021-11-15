/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week5;
import java.util.Random;
import java.util.Scanner;

//revision week1-4
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int num, randomNum;
        int count=0;
        
        //run multiple times until num==randomNum
        do{
        
            count++;
            //to generate random number with range: (max - min + 1) + min
            randomNum = rand.nextInt(1001)+100; //100-2000
        
            System.out.print("Enter a number: ");
            num=sc.nextInt();
        
            System.out.println("Input from user is: " + num);
        
            //selection
            if(num==randomNum){
                System.out.println("The number entered is similar to the random number after " + count + "times.");
            }else if(num<randomNum){
                System.out.println("The number entered is less than the random number.");
            }else{
                System.out.println("The number entered is larger than the random number.");
            }
        
        }while(num!=randomNum);
        
        System.out.println("Random number from code: "+ randomNum);
        
        
    }
    
}
