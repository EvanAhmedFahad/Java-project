/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance1;

/**
 *
 * @author Fahad
 */
public class Teacher extends Person {
    
    String qualification;
    
    void display2(){
        display1();
        System.out.println("Qualification "+qualification);
    }
    
}
