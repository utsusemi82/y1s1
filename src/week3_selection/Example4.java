/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week3_selection;

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
        String stringA="Hello World";
        String stringB="hello WOrld";
        
        if(stringA.equalsIgnoreCase(stringB)) //no matter what case is it in 
            System.out.println("The strings are equal");
        else
            System.out.println("The strings are not equal");
        
        if(stringA.equals(stringB))
            System.out.println("Without the case sensitivity, the strings are equal");
        else
            System.out.println("Without the case sensitivity, the strings are not equal");
        
    }
    
}
