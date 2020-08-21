
package OOP2;


public class  Parametrizedmethod {
    String name,gender;
    int phone;
    
     Parametrizedmethod(){
         System.out.println(" no value");
     }
    Parametrizedmethod (String n,String m,int ph){
        name =n;
        gender = m;
        phone = ph;
        
        
    }
    
    
  
        
        
    
    
    void displayinfomation(){
        
        System.out.println("name  :"+name);
        System.out.println("gender  :"+gender);
        System.out.println("phone :"+phone);
        
        
        System.out.println("  \n");
    }
    
}
