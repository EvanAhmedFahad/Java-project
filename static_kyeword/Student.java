
package static_kyeword;

public class Student {
    
    String name;
    int id;
    static String university = "AIUB";
    
    Student(String n, int i){
        name = n;
         id = i;
         
    }
    
    
    void displayinformation(){
        System.out.println(" name ="+ name);
        System.out.println("id = "+id);
        System.out.println("university name ="+university);
      
    }
}
