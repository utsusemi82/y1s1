/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week12_polymorphism;

/**
 *
 * @author User
 */

//abstract
abstract class fruit {
    
    //abstract
    //whoever inherit fruit must have shape
    public abstract void shape();
    
    //general method
    public void color(){
        System.out.println("Fruit has color");
    }
}
