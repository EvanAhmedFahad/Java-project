
package OOP;

public class test1 {
    public static void main(String[] args) {
        
        Call_By_value ab = new Call_By_value();
        
        int x = 10;
        System.out.println(" x before call :"+ x);
        
        ab.change(x);
        System.out.println("x after call :"+x);
    }
    
}
