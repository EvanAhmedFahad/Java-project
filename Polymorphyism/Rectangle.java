
package Polymorphyism;


public class Rectangle extends Shape{
    double len,width;
    
    Rectangle(double len,double width){
        this.len=len;
        this.width = width;
    }
    @Override
    double area(){
        return len*width;
        
    }
    
}
