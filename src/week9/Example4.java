/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

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
        try{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("integer.dat"));
            int sum=0;
            for(int i=0; i<10; i++){
                int num = input.readInt();
                sum+=num;
                System.out.print(num + " ");
            }
            System.out.println("");
            System.out.println("Total value: "+sum);
            input.close();
            
        }catch(IOException e){
            System.out.println("Error File not found");
        }
    }
    
}
