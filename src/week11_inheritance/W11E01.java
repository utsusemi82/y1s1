/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week11_inheritance;

//revision for week 10_class
//main class
//can create object from main class
public class W11E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student a=new student();
        student b=new student(1);
        student c=new student("Ali",20);
        student d=new student();
        student e=new student(20);
        student f=new student("Iman",40);
        student g=new student("Badrul" ,21,"S1212033");
        
        //green=public variable
        //f is the object, name is f's parameter
        //this is how u call the value
        System.out.println(f.name);
        
        //print c object's parameter of age
        System.out.println(c.age);
        
        //print null as we havent declare anything
        System.out.println(a.name);
        System.out.println(b.name);
        
        System.out.println(g.name);
        
        //cannot print matrixNumber because it is private
        //cannot access directly
        //System.out.println(g.matrixNumber);
        //to print matrixNumber
        //use accessor method(setter and getter)
        System.out.println(g.getMatrixNumber());
        
        //change the variable of a object
        a.age=21;
        a.name="Adam";
        System.out.println("Object A with value " + a.name + " and " + a.age);
        
        b.name="Arif";
        b.age=22;
        
        //set mutator to call value
        b.setMatrixNumber("U21212220");
        
        //to print out everthing
        b.printOuput();
        
        //print everything manually
        System.out.println("Object B with value " + b.name + " and " + b.age + " with matrix number " + b.getMatrixNumber());
        
        c.name="Chong";
        c.age=23;
        c.setMatrixNumber("U20212222");
        c.colorBasedOnAge();
        c.printOuput();
        System.out.println("Object c with value " + c.name + " and " + c.age + " with matrix number " + c.getMatrixNumber());
        
        f.printAge();
        f.setMatrixNumber("U20205115");
        f.printOuput();
        f.colorBasedOnAge();
        
        g.colorBasedOnAge();
        
        System.out.println("This is an object G with color "+ g.colorBasedOnAgeReturn());
    }
    
}
