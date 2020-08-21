
package PblmSolveAbstrac;


public abstract class Triangle extends Shape {
    
    Triangle(double a, double b){
        super(a,b);
    }
    @Override
    void area(){
        double result =0.5* a*b;
        System.out.println(" Triang;le area : "+result);
    }
    
}
