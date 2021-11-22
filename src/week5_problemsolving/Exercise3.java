/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week5_problemsolving;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author User
 */
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int N;
        int random;
        int i=0;
        int count=0;
        
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number of staff[N] : ");
        N=sc.nextInt();
        
        while(i<N){
            random=rand.nextInt(99999-10000+1)+10000;
            System.out.println("Staff ID : " + random);
           
            int second_digit = (random % 10000)/1000;
            int fourth_digit = (((random % 10000)% 1000)% 100)/ 10;
            
            if (second_digit % 2 == 1 && fourth_digit % 2 == 0) {
                System.out.println("Weekend Duty");
                count++;
            } else {
                System.out.println("Weekend Off");
            }
            i++;
    
        }
        System.out.println("The number of staffs work during weekend is: " + count );
    }
    
}
