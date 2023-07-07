//Find the largest of three numbers
//method 1

/* 
import java.util.*;
public class LargestOfThreeNumbers{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        if((a>b)&&(a>c)){
            System.out.print("a is largest");
        }
        else if((b>a)&&(b>c)){
                System.out.println("b is largest");

        }
        else{
                System.out.println("c is largest");
            }
        }
}
*/

/*method 2

import java.util.*;
public class LargestOfThreeNumbers{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.print(max);
    }
}
    */

//method 3
import java.util.*;
public class LargestOfThreeNumbers{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int max=Math.max(c,Math.max(a,b));
        System.out.print(max);
    }
}