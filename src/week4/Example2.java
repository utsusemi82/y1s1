/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week4;

/**
 *
 * @author User
 */
public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int num;
        
        for(num=0; num<10; num=num+2)       //for loop; increment by 2
            System.out.println(num);
        
        for(num=0; num<=100; num=num+10)    //for loop; increment by 10
            System.out.println("increment by 10:" + num);
        
        num=0;
        
        while(num<=100){                    //while loop; increment by 10
            System.out.println("while: "+num);
            num = num + 10;
        }    
        
       
    }
        
    
}
