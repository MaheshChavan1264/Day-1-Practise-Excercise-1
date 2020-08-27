//import the respective packages
import java.util.Scanner;
public class KaprekarNumber{
     public static void main(String[] args){
         //Try out your code here!...
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       if (n == 1) 
           System.out.println("Kaprekar number");
        // Count number of digits in square 
        int sq_n = n * n; 
        int count_digits = 0; 
       int sum=0;
        while (sq_n != 0) 
        { 
            count_digits++; 
            sq_n /= 10; 
        } 
        sq_n = n*n; // Recompute square as it was changed 
        // Split the square at different poitns and see if sum 
        // of any pair of splitted numbers is equal to n. 
        for (int r_digits=1; r_digits<count_digits; r_digits++) 
        { 
             int eq_parts = (int) Math.pow(10, r_digits); 
       
             // To avoid numbers like 10, 100, 1000 (These are not 
             // Karprekar numbers 
             if (eq_parts == n) 
                continue; 
       
             // Find sum of current parts and compare with n 
             sum = sq_n/eq_parts + sq_n % eq_parts;     
        }
       if (sum == n){
                    System.out.println("Kaprekar number");
       }else{
                    System.out.println("Not a Kaprekar number");
       }
     }
}