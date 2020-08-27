
//import the respective packages
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class LuhnAlgorithm{
     public static void main(String[] args){
         //Try out your code here!...
       Scanner sc = new Scanner(System.in);
       String number=sc.nextLine();
       if(valid(number)){
         System.out.println("Valid credit card!");
       }else{
         System.out.println("Invalid credit card!");
       }
     }
    public static boolean valid(String code)
    {
        String reversed = new StringBuilder(code).reverse().toString();
        int index = 1;
        List<Integer> resultArray = new ArrayList<Integer>();

        for (int i = 0; i < reversed.length(); i++) {
            char charAtIndex = reversed.charAt(i);
            int singular = Integer.parseInt(String.valueOf(charAtIndex));
            int value = singular;
            if(index % 2 == 0) {
                value = singular * 2;
                if(value > 9) {
                    value = value - 9;
                }
            }
            resultArray.add(value);
            index++;
        }
        return resultArray.stream().reduce(0, Integer::sum) % 10 == 0;
}
}