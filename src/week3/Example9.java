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
public class Example9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=0;
        String result;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        
        /**if(num%2==0){
            System.out.println(num + " is an even number");
        }else{
            System.out.println(num + " is an odd number");
        }
        **/
        result = (number % 2 == 0)?" is an even number":" is an odd number";
        //if the statement is true, print first statement ,else second statement
        
        System.out.println(number + result);
        
        
    }
    
}
