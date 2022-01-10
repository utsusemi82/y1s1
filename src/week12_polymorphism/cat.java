/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week12_polymorphism;

/**
 *
 * @author User
 */

//inheritance
public class cat extends animal{

    public cat() {
        System.out.println("This is constructor for cat");
        super.publicNumber = 20;
    }
    @Override
      public void color(){
        System.out.println("Cat color = red");
    }
    
    @Override
    public void leg(){
        super.print();
        System.out.println("Cat has 4 legs");
    }
    
    @Override
    public void sound(){
        System.out.println("The cat meows");
    }
    
    public String toString(){
        System.out.println("Hey");
        return "Hello world from cat";
        
    }
}
