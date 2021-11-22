/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week6_array;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
       
        //declare variable
        int arraySize;
        
        //input variable
        System.out.println("Enter array size: ");
            arraySize=sc.nextInt();
        
        //declare and initialize new variable with previous variable(arraySize)
        int[] score=new int [arraySize];
        
        for(int i=0;i<score.length;i++)
            score[i]=rand.nextInt(51)+50;
        
        for(int i=0;i<score.length;i++)
            System.out.println("position index [" + i +"] is " +score[i]+" ");
        
        
    }
    
}
