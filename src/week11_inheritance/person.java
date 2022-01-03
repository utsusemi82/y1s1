/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week11_inheritance;

/**
 *
 * @author User
 */
    //extending student class
    //child class
    public class person extends student{
        public String nickName;

        public person(){
            System.out.println("This constructor from child class(Person)");
        }

        public person(String nickName, String name, int age, String matrixNumber) {
            super(name, age, matrixNumber);
            this.nickName = nickName;
        }
    
        public void printOutput(){
            System.out.println("Object with value " + super.name + " and " + super.age + " with matrix number " + super.getMatrixNumber() + "with nickName " + this.nickName);
        }
        
        
        //can have similar name as parent class
        @Override
        public void printPublic(){
            System.out.println("This is a public method from child class (Person)");
            
            
        }
        
        public void printProtected(){
            //to print from parent class
            super.printProtected();
            System.out.println("This is a protected method from child class(Person)");
        }
}
