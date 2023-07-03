/*Converting celsius to Fahrenheit */
import java.util.*;
public class Temperature{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in celsius:");
        float cel=input.nextFloat();

        float fa= ((9*cel)/5)+32;
        System.out.println("Temperature in Fahrenheit:"+ fa);

    }
}