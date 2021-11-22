/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week6_array;

//bubble sort
public class Example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] number={111,211,131,401,51,16};
         
         System.out.print("Before bubble sort: ");
         for(int i=0;i<number.length;i++)
             System.out.print(number[i]+" ");
         
         for(int pass=1; pass<number.length; pass++)
             for(int i=0; i<number.length-1; i++)
                 if(number[i]>number[i+1]){
                     int hold=number[i];
                     number[i]=number[i+1];
                     number[i+1]= hold;
                 }
         
         System.out.print("\nAfter bubble sort: ");
         for(int i=0;i<number.length;i++)
             System.out.print(number[i]+" ");
    }
    
    
    
}
