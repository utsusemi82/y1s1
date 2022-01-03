/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week11_inheritance;

/**
 *
 * @author User
 */
public class W11E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //inherit student to person
        //print from parent class(student class)
        //eventho we dont put value in person class
        person personA=new person();
        personA.age=20;
        personA.name="Daus";
        personA.setMatrixNumber("U2002020");
        personA.printOuput();
        personA.printPublic();
        personA.printPublic();
        
        
        //will call from person which is from student(parent class)
        human humanA=new human();
        humanA.age=18;
        humanA.name="Human A";
        humanA.setMatrixNumber("U2020222");
        humanA.printOuput();
        
        //cannot print private
        //only protected
        humanA.printProtected();
        //print public
        humanA.printPublic();
        
        //how overriding works?
        //as we have insert value in child class
        //child class will override parent class
        //print child class instead of parent class
        personA.printPublic();
        humanA.printPublic();
        humanA.printProtected();
        
        //if wanna call back parent class
        //use super
        
        
        
    }
    
}
