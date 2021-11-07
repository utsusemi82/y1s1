/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week2;

/**
 *
 * @author User
 */
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        
        num1=10;
        num2=30;
        
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num1+num2);//print40
        System.out.println(num1+"+"+num2+"="+(num1+num2)); //print10+30=40
        
        System.out.printf("%d+%d=%d",num1,num2,num1+num2);
       
    }
    
}
