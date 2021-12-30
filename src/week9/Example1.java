/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week9;

//PrintWriter
//Textfile

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        try{
            
            PrintWriter write = new PrintWriter(new FileOutputStream("c:/temp/integer.txt")); //store file at temp in c drive
            
            for(int i=0;i<10;i++){
                int num = rand.nextInt(100);
                System.out.print(num + " "); //print as output
                write.print(num + " "); //num will be print in Int txt file
            }
        
            write.close(); //close file
            
        }catch(FileNotFoundException e){ //catch if there's an error 
            System.out.println("Error.");
        }
        
    
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
}}
