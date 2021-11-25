/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week6_array;

import java.util.Random;
import java.util.Scanner;

//linear search
public class Example7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arraySize; 
        int position=-1;
        int count=1;
        
        Scanner input = new Scanner(System.in); 
        Random rand =  new Random(); 
         
        System.out.print("Enter array size: "); 
        arraySize = input.nextInt(); 
         
        int[] number =  new int[arraySize]; 
         
        for(int i=0;i<number.length;i++) 
             number[i] = rand.nextInt(500)+50; 
         
        System.out.print("Before sort: "); 
        for(int i=0;i<number.length;i++) 
            System.out.print(number[i] + " "); 
         
        System.out.print("\nEnter value for searching: ");
        int searchKey=input.nextInt();
        
        for ( int cnt = 0; cnt < number.length; cnt++ ){
            if ( number[cnt] == searchKey ){
                position=cnt;
                break;
            } 
        count++;
        }
    
        if(position!=-1)
            System.out.println("The value " + searchKey + " found in position " + position + " after " + count + " times.");
        else
            System.out.println("The value is NOT found");

        
     
    }        
    
}
