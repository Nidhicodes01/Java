/*Sum of two numbers in java. Taking input from the user */
import java.util.*;
public class SumOfTwoNumbers {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter num1:");
        int num1=input.nextInt();
        System.out.print("Enter num2:");
        int num2=input.nextInt();
        int sum=num1+num2;
        System.out.println("Sum of num1 and num2 is:"+ sum);
    }
    
}
