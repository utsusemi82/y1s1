/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week10_class;

//create a class called E01
public class E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //constructor called
        person p=new person(22);
        person b=new person();
        person c=new person();
        
        //cannot call private directly from main
        //need use constructor or accessor method
        a.aPublic=10;
        a.displayVariable();
        
        System.out.println("Public Display in main:" + a.aPublic);
        System.out.println("Private Display in main:" + a.getaPrivate());
        
        b.aPublic=100;
        b.setaPrivate(101);
        b.displayVariable();
        System.out.println("This is private value: "+ b.getaPrivate());
        
    }
    
}
