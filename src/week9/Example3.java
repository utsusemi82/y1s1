/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week9;

//binary file

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;

public class Example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random ();
        try{
            
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("integer.dat")); //binary file
            
            for(int i=0;i<10;i++){
                int num = rand.nextInt(100);
                System.out.print(num + " "); //print as output
                output.writeInt(num); //cannot insert space
            }
            output.close();
            
        }catch(IOException e){
            System.out.println("Error");
            
        }
    }
    
}
