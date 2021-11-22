/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week3_selection;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Please enter a number: ");
        int num=sc.nextInt();
        
        System.out.println("The number is " + num);
        
        if(num%2==0){
            System.out.println(num + " is an even number");
        }else{
            System.out.println(num + " is an odd number");
        }
    }
}
