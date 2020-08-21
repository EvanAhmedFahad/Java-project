

package OOP;


public class Test {
    public static void main(String[] args) {
        
        Teacher teacher1;//object declear
        teacher1 = new Teacher();//creat object
        
        teacher1.name = "fahad";
        teacher1.gender = "male";
        teacher1.phone = 22264884;
        
        
        System.out.println("name :"+teacher1.name);
        System.out.println("gender :"+teacher1.gender);
        System.out.println("phone :"+teacher1.phone);
        
        
        
        
        Teacher teacher2 = new Teacher();//creat object
        
        teacher2.name = "rifat";
        teacher2.gender = "male";
        teacher2.phone = 226764884;
        
        
        System.out.println("name :"+teacher2.name);
        System.out.println("gender :"+teacher2.gender);
        System.out.println("phone :"+teacher2.phone);
        
    }
    
}
