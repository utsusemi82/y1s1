/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week12_polymorphism;

/**
 *
 * @author User
 */
public class E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        animal ob1 = new animal();
        cat obcat1 = new cat ();
        
        //print publicNumber from cat (20)
        System.out.println(obcat1.publicNumber);
        
        //print publicNumber from monkey
        monkey obMonkey = new monkey();
        System.out.println(obMonkey.publicNumber);
        
        //method override
        obcat1.color();
        obMonkey.color();
        
        obcat1.leg();
        obMonkey.leg();
        
        //unable to print
        obcat1.toString();
        
        //therefore nid sout
        System.out.println(obcat1.toString());
    }
    
}
