/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week10_class;

/**
 *
 * @author User
 */
class person {
    
    //instance variable
    private int aPrivate;
    public int aPublic;
    

    public person() {
        System.out.println("Constructor created.");
    }

    public person(int aPrivate) {
        this.aPrivate = aPrivate;
        System.out.println("Constructor created with argument.");
    }
    
    public void displayVariable(){
        System.out.println("This is the private variable " + this.aPrivate);
        System.out.println("This is the public variable" + this.aPublic);
    }
    
    public void display(int a){
        System.out.println("Display Me");
        System.out.println(this.calculate(this.aPrivate));
    }
    
    public void displayWithoutCalculate(){
        System.out.println("displayWithoutCalculate");
    }
    //hide method or dont want ppl access it directly by using private argument
    private int calculate(int a){
        return a+a;
    }
    
    
        
    }
}
