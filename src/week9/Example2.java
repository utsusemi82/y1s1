/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week9;

//read data from file

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            int max = 0;
            Scanner read = new Scanner (new FileInputStream ("integer.txt")); //location of file
            
            while(read.hasNextInt()){ //while-loop needed
                int num = read.nextInt();
                System.out.print(num + " ");
                if(num > max)
                    max = num;
            }
            System.out.println("");
            System.out.println("Maximum number is " + max );
            read.close();
            
        }catch(FileNotFoundException e){ 
            System.out.println("File Error");
            
        } 
    }
    
}
