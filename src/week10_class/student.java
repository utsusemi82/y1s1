/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week10_class;

/**
 *
 * @author User
 */
public class student {
    
    private String name;
    private int age;

    public student(String name) {
        this.name = name;
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void printInfo(){
        System.out.println("Student name:" + this.name);
        System.out.println("Student age:" + this.age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    
}
