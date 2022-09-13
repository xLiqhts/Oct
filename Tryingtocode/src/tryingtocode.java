import java.util.Scanner;
import java.lang.Math;

public class tryingtocode
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //FullName
        System.out.print("Full Name: ");
        String firstname = scan.nextLine();
        
        //Nickname
        System.out.print("Nickname: ");
        String nickname = scan.nextLine();
          
        //Age
        System.out.print("Age: ");
        String age = scan.nextLine();
        
        //Address
        System.out.print("Address: ");
        String address = scan.nextLine();
    	
    	//Output for print ^
        System.out.println("Hello I am "+ firstname);
        
        System.out.println("You can call me "+nickname);
        
        System.out.println("I am " + age + " years old");
        
        System.out.println("I live in " + address);
    	
    }
}