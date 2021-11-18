/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week5;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Exercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        int num, factor;
        String ans="";
        int score=0;
        int count=0;
        
        do{
            System.out.print("Enter a number (-1 to quit) :");
            num=sc.nextInt();
            
            if(num==-1){
                break;
            }
            
            System.out.print("Enter a factor: ");
            factor=sc.nextInt();
            count++;
            
            System.out.println(factor + " is a factor of "+ num + " ?");
            
            System.out.print("(true/false): " );
            ans=sc.next();
            
            if(num%factor==0 && ans.equalsIgnoreCase("True")){
                System.out.println("Your answer is correct.");
                score++;
            }else if(num%factor!=0 && ans.equalsIgnoreCase("False")){
                System.out.println("Your answer is correct.");
                score++;
            }else{
                System.out.println("Your answer is incorrect.");
            }
            
        }while(num!=-1);
        
        System.out.println("The final score is " + score + "/" + count);
                
            
            
            
            
        }
        
}
