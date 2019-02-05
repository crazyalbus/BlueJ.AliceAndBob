    /**
    * Created by iyasuwatts on 10/17/17.
    */
import java.util.Scanner;
public class Main {
    
  public static void main(String[] args ){
     Scanner in = new Scanner(System.in);
            
     System.out.print("What is your first name? ");
     
     String firstName = in.nextLine(); 
     
     if(firstName.equals("Alice") || firstName.equals("Bob")) {
            System.out.println("Hi " + firstName); 
        }
  }
}