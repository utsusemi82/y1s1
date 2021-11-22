/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week4_looping;

//while loop one statement
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int numberwhile =1;      //initialize number
        
        while(numberwhile <=10)
            System.out.println("while:" + numberwhile++);
        
        
        int numberdo=11;    //initialize numberdo
        
        do{
            System.out.println("do: "+numberdo++);     //output increment 
        }while(numberdo<=10);       //condition
        
        
        for(int numberfor=1; numberfor<10; numberfor++)
            System.out.println("for loop:" +numberfor);
    }
}
