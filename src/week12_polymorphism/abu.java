/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week12_polymorphism;

/**
 *
 * @author User
 */
//implement interface
public class abu implements human{

    @Override
    public void color() {
        System.out.println("abu color red");
    }

    @Override
    public void leg() {
        System.out.println("abu has 2 legs");
    }

    @Override
    public void print() {
        System.out.println("This is method print");
    }
    
}
