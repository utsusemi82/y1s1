/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week11_inheritance;

/**
 *
 * @author User
 */
public class W11E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        person a = new person();
        person b = new person ("Bad","Badrul",42,"S12121212");
        
        System.out.println(b.nickName);
        System.out.println(b.name);
        System.out.println(b.getMatrixNumber());
        
        b.printOutput();
        
        //private method from parent class
        b.accessPrivatePrint();
        
    }
    
    
}
