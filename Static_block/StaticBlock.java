
package Static_block;

public class StaticBlock {
    static int id;
    static String name;
    static {
        id = 10100;
        name = " fahad";
    }
    
    
   static  void display(){
        System.out.println(" id :"+id);
        System.out.println(" name :"+name);
    }
}
