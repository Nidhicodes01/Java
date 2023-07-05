import java.util.*;
public class condition{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the salary:");
        int salary=input.nextInt();
        /*if(salary>10000){
            salary=salary+2000;
        }
        else{
            salary=salary+1000;
        }
        System.out.println(salary);
        */

        if(salary>1000){
            salary=salary+2000;
        }
        else if(salary>2000){
            salary=salary+3000;
        }
        else{
            salary=salary+1000;
        }
        System.out.println(salary);
    }
}