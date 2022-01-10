/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week12_polymorphism;

/**
 *
 * @author User
 */
public class monkey extends animal {
   
    public monkey(){
        System.out.println("This is constructor for monkey");
        this.publicNumber = 2;
        
        
    }
    @Override
      public void color(){
        System.out.println("Moneky color = black");
    }
    
    @Override
    public void leg(){
        System.out.println("Monkey has 2 legs");
    }
    
    @Override
    public void sound(){
        System.out.println("Monkey says hoot");
    }
}
