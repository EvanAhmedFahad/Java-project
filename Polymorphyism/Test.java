
package Polymorphyism;


public class Test {
    public static void main(String[] args) {
         Shape s1 = new Shape ();
         Shape s2 = new Rectangle (10,20);
         Shape s3 = new Triangle(20,30);
         Shape s4 = new Circle (5);
         
        System.out.println( s1.area());
        System.out.println(s2.area()); 
         System.out.println(s3.area());
         System.out.println(s4.area());
         
          
    }
    
}
