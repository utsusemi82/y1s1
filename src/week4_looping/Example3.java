/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week4_looping;

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
        int num;
        
        num=100;
        while(num>=0){                    //while loop; increment by 10
            System.out.println("countdown: "+num);
            num = num - 10;
        }
        
        for(num=100;num<=0;num=num-10)
            System.out.println("for countdown:" + num);
        
       
        do{
            System.out.println("while :" + num);
            num = num - 1;
        }while(num>=50);
        
    }
    
}
