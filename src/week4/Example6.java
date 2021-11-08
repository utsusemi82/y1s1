/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week4;

import java.util.Scanner;

/*Enter a number(-1 to stop):20
  Enter a number(-1 to stop):230
  Enter a number(-1 to stop):200
  Enter a number(-1 to stop):10
  Enter a number(-1 to stop):-1

  The total number entered:460
 */
public class Example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int sum=0;
        int num;
        
        do{
            System.out.print("Enter a number(-1 to stop) :");
            num=in.nextInt();
            if(num!=-1)
                sum+=num;     
        }while(num!=-1);
        
        System.out.println("The total number entered:" + sum );
    }
    
}
