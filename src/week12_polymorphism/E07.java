/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week12_polymorphism;

/**
 *
 * @author User
 */
public class E07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        outerclass outer = new outerclass();
        outerclass.innerclass inner =  outer.new innerclass();
        
    }
    
}
