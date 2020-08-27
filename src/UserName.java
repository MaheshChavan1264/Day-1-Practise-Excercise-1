//import the respective packages
import java.util.Scanner;
public class UserName{
     public static void main(String[] args){
         //Try out your code here!...
       Scanner sc = new Scanner(System.in);
       String firstName = sc.nextLine();
       String lastName = sc.nextLine();
       System.out.println(lastName + ". "+ firstName);
     }
}