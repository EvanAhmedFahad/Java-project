
package PblmSolveAbstrac;

public abstract class Circle extends Shape {
     Circle(double r){
        super(r,r);
    }
    @Override
    void area(){
        double result = Math.PI*a*b;
        System.out.println("Rectangle area : "+result);
    }
    
}
