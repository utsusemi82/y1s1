/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week4;

//label
public class Example8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        label1:{
        for(int j=0;j<10; j++){
            for(int i=0; i<10; i++){
                if(i==5)
                break label1;
            System.out.println("Value J: "+ j +" Value i: "+ i);
            }
        
        System.out.println("Value j: "+ j);
        }
    }
    
}}
