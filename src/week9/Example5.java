/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
        
        String[] coursecode = {"WIX1111","WIX1112","WIX1113"};
        String[] coursename = {"Maths","OS","Java"};
        
        try{
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("subject.dat"));
            for(int i=0; i<coursecode.length ;i++){
                output.writeUTF(coursecode[i]);
                output.writeUTF(coursename[i]); 
            }
            output.close();
            
        }catch(IOException e){
            System.out.println("Error File Not Found");
            
        }
    
        
        //searching from the file
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coursecode: ");
        String courseSearch = input.nextLine();
        
        try{
            ObjectInputStream database = new ObjectInputStream(new FileInputStream("subject.dat"));
            
            while(true){
                if(courseSearch.equalsIgnoreCase(database.readUTF())){
                    System.out.println("Coursecode: " + courseSearch);
                    System.out.println("Coursename: " + database.readUTF());
                    break;
                }else
                    database.readUTF();
            }
            database.close();
            
        }catch(IOException e){
            System.out.println("Error File Not Found");
            
        }
    }
    
    
}
