/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week3;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner y=new Scanner(System.in);
       
        System.out.println("Please enter a year:");
        int year=y.nextInt();
        
        if((year%4==0) && !(year%100==0) || (year%400==0)) {
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
            
        }
    }
    
}
