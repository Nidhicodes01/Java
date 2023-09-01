//Kunal Kushwaha vid 9

/* 
import java.util.*;
public class conditionals {
    private static int j;

    public static void main(String args[]){

        Syntax for if--> 
        if(boolean T or F){
            //body
        }
        else{
            //do this 
        }

        int salary=25400;
        if(salary>10000){
            salary=salary+2000;
        }
        else if(salary>20000){
            salary=salary+3000;
        }
        else{
            salary=salary+1000;
        }
        System.out.println(salary);

        /*for loop syntax
         * 
         * for(intialization;condition; updation){
         * //body
         * }
         */

//print numbers from 1 to 5 using for loop

//  for(int i=1;i<6;i++){
//     System.out.println(i);
//  }
/* 
//print numbers from 1 to n

Scanner input=new Scanner(System.in);
int n=input.nextInt();

for(int i=1;i<=n;i++){
    //System.out.println(i);
    System.out.println("Hello World");

Scanner input=new Scanner(System.in);
int n=input.nextInt();
int i=1;

while(i<=n){
    System.out.print(i +" ");
    i=i+1; 
}

/*do while loop
 do{

 }while(condition);
 */
// int i=1;
// do{
//     System.out.println(i);
//     i++;
// }while(false);

//Largest of three numbers 

// Scanner input=new Scanner(System.in);
// int a=input.nextInt();
// int b=input.nextInt();
// int c=input.nextInt();

// if(a>b & a>c){
//     System.out.println("A is greatest");
// }
// else if(b>a & b>c){
//     System.out.println("b is greatest");
// }
// else{
//     System.out.println("c is greatest");
// }

// //method 2
//     int max=a;
//      if(b>max){
//          max=b;
//     }
//     else if(c>max){
//          max=c;
//     }
//     System.out.print(max);
// }

//method 3 using Math.max function

// System.out.print(Math.max(c, Math.max(a,b)));
// }

// }

//check character is uppercase or lowercase
// import java.util.*;
// public class conditionals{
//     public static void main(String args[]){
//         String st="Neha";
//         System.out.print(st.charAt(2));

//     }
// }

// import java.util.*;
// public class conditionals{
//     public static void main(String args[]){
//         Scanner input=new Scanner(System.in);
//         char ch= input.next().trim().charAt(0);
//          if(ch>='a' & ch<='z'){
//             System.out.println("Lowercase");
//          }
//          else if(ch>='A' & ch<='Z'){
//             System.out.println("Uppercase");
//          }
//          else{
//             System.out.println("Integer");
//          }
//     }
// }

//Find the nth fibonacci number 
// import java.util.*;
// public class conditionals{
//     public static void main(String args[]){
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();
//         int a=0;
//         int b=1;
//         int count=2;
//         while(n>=count){
//             int temp=b;
//             b=b+a;
//             a=temp;
//             count++;
//         }
//         System.out.print(b);

//     }
// }

//count num
// import java.util.*;
// public class conditionals{
//     public static void main(String args[]){
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();
//         int count=0;
//         while(n>0){
//             if(n%10==5){
//                 count++;
//             }
//             n=n/10;
//         }
//         System.out.print(count);
//     }
// }

//inverse
// import java.util.*;
// public class conditionals{
//     public static void main(String args[]){
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();
//         int ans=0;
//         while(n>0){
//             int rem=(n%10);
//             n=n/10;
//             ans=ans*10+rem;
//         }
//         System.out.print(ans);
//     }
// }

// import java.util.*;
// public class conditionals{
//     public static void main(String args[]){
//         Scanner input=new Scanner(System.in);
//         //Take input from user till user does not press x or X
//         int ans=0;
//         while(true){
//             //take the operator as input
//             System.out.print("Enter the operator:");
//             char op=input.next().trim().charAt(0);

//             if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
//                 System.out.print("Enter two numbers:");
//                 int num1=input.nextInt();
//                 int num2=input.nextInt();
//                 if(op=='+'){
//                     ans=num1+num2;
//                 }
//                 if(op=='-'){
//                     ans=num1-num2;
//                 }
//                 if(op=='*'){
//                     ans=num1*num2;
//                 }
//                 if(op=='/'){
//                     if(num2!=0){
//                         ans=num1/num2;
//                     }
//                 }
//                 if(op=='%'){
//                     ans=num1%num2;
//                 }

//             }
//             else if(op=='x' || op=='X'){
//                 break;
//             }
//             else{
//                 System.out.print("Invalid operation!");
//             }
//             System.out.println(ans);
//         }
//     }
// }
