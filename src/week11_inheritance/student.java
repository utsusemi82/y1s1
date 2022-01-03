/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week11_inheritance;

/**
 *
 * @author User
 */
public class student {
    
    public String name;
    public int age;
    private String matrixNumber;
    
    //constructor without parameter
    public student(){
        System.out.println("This is the constructor.");
        
    }
    //constructor with parameter
    public student(int age){
        System.out.println("This is the constructor with parameter " + age);
        this.age = age;
    }
    
    public student(String name, int age){
        System.out.println("This is the constructor " + name + " and " + age);
        this.name=name;
        this.age=age;
    }

    public student(String name, int age, String matrixNumber) {
        this.name = name;
        this.age = age;
        this.matrixNumber = matrixNumber;
        System.out.println("This is the constructor with parameter " + name + "," + age + " and " + matrixNumber );
        
    }
    
    //to access private instance variable
    public String getMatrixNumber() {
        return matrixNumber;
    }
    public void setMatrixNumber(String matrixNumber) {
        this.matrixNumber = matrixNumber;
    }
    
    public void printOuput(){
        System.out.println("Object with value " + this.name + " and " + this.age + " with matrix number " + this.matrixNumber);
    }
    
    public void printAge(){
        System.out.println("The age is : " + this.age);
    }
    
    public void colorBasedOnAge(){
        if(this.age%2 == 0)
            System.out.println("Blue");
        else
            System.out.println("Red");
    }
    
    //return value
    public String colorBasedOnAgeReturn(){
        if(this.age%2 == 0)
            return "Blue";
        else
            return "Red";
    }
}
