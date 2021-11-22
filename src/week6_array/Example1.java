/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week6_array;

/**
 *
 * @author User
 */
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare and initialize array score 
        double[] score=new double[20];
        for(int i=0;i<score.length;i++)
            System.out.println("position index [" + i +"] is " +score[i]+" ");
        
        score[9]=100.2; //manipulate value of score[9]
        for(int i=0;i<score.length;i++)
            System.out.println("position index [" + i +"] is " +score[i]+" ");
        
       
        
        for(int i=0;i<score.length;i++)
            System.out.println("position index [" + i +"] is "+ score[i]);
        
    }
    
}
