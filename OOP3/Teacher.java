
package OOP3;

public class Teacher {
    
    String name,gender, id;
    int phone;
    
   Teacher(){
       
       System.out.println(" no value ");
       
   }
   Teacher(String n,String m){
       name =n;
       gender = m;
       
   }
   
   Teacher(String n,String m,int p){
       
       name = n;
       gender = m;
       phone =p;
   }
   void displayInformation(){
       System.out.println("name :"+name);
       System.out.println("gender :"+gender);
       System.out.println("phone :"+phone);
   }
   
   
   
   
   
   
   
    
}
