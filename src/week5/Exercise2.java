/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week5;
import java.util.Scanner;
public class Exercise2 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int priceMK=25;
        int priceHL=22;
        int priceD24=20;
        int priceUM=18;
        double total=0;
        double sales;
        String type="";
        double kg;
        
        while(!type.equalsIgnoreCase("Quit")){
            System.out.println("Enter the type of durian [Quit] to terminate: ");
            Scanner sc1=new Scanner(System.in);
            type = sc1.next();
        
            System.out.println("Enter the sales in kg: ");
            Scanner sc2=new Scanner(System.in);
            kg=sc2.nextDouble();
        
    
            switch (type) {
                case "MK" -> {
                    sales=priceMK*kg;
                    total+=sales;
                }
                case "HL" -> {
                    sales=priceHL*kg;
                    total+=sales;
                }
                case "D24" -> {
                    sales=priceD24*kg;
                    total+=sales;
                }
                default -> {
                    sales=priceUM*kg;
                    total+=sales;
                }
            }
            
        }
  
        System.out.println("Total sales: "+ total);
    }
    
    
}
