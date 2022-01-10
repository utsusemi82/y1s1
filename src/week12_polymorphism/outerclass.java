/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week12_polymorphism;

/**
 *
 * @author User
 */
public class outerclass {
    public int a = 20;
    
    public outerclass(){
        System.out.println("This is constructor on outerclass");
    }
    
    public class innerclass{
        public int b = 10;
        
        public  innerclass(){
            System.out.println("This is constructor on innerclass");
        }
        
    }
}
