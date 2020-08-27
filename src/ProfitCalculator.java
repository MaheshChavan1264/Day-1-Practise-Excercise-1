//import the respective packages
import java.util.Scanner;
public class ProfitCalculator{
     public static void main(String[] args){
         //Try out your code here!...
       Scanner sc = new Scanner(System.in);
       int assignedAmount = sc.nextInt();
       int earnedAmount = sc.nextInt();
       if(assignedAmount < earnedAmount){
            float profit =(float) (earnedAmount-assignedAmount)/assignedAmount;
            System.out.println("Profit - "+(int)(profit*100.0)+"%");
        }else{
            float profit =(float) (assignedAmount-earnedAmount)/assignedAmount;
            System.out.println("Profit - "+(int)(profit*100.0)+"%");
        }

     }
}