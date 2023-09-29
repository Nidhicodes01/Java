// import java.util.*;
// public class switch1{
//     /**
//      * @param args
//      */
//     public static void main(String args[]){
//         Scanner input=new Scanner(System.in);
//         String fruit=input.next();

//         if(fruit.equals("mango")){
//             System.out.print("King of fruits");
//         }
//         else if(fruit.equals("apple")){
//             System.out.print("a sweet red fruit");
//         }
//         else if(fruit.equals("orange")){
//             System.out.print("Round fruit");
//         }
//         else if(fruit.equals("grape")){
//             System.out.print("small fruit");
//         }

//     }
// }

// import java.util.*;
// public class switch1{
//     public static void main(String args[]){
//         Scanner input=new Scanner(System.in);
//         String fruit=input.next();

//         switch(fruit){

//             case "mango":
//             System.out.print("King of fruits");
//             break;

//             case "orange":
//             System.out.print("Round fruit");
//             break;

//             case "grape":
//             System.out.print("Small fruit");
//             break;

//             case "apple":
//             System.out.print("a red small fruit");
//             break;

//             default:
//             System.out.print("Please enter a valid fruit");

//         }


//     }
// }

// import java.util.*;
// public class switch1{
//     public static void main(String args[]){
//         Scanner in=new Scanner(System.in);
//         String fruit=in.next();
//         switch(fruit){
//             case "manga"-> System.out.print("King of fruits");
//             case "orange"->System.out.print("Round fruit");
//             case "grape" ->System.out.print("Small fruit");
//             case "apple" ->System.out.print("red fruit");


//         }
//     }
// }

import java.util.*;

import javax.swing.plaf.synth.SynthLookAndFeel;
public class switch1{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int day=input.nextInt();

        switch(day){
            case 1-> System.out.println("Monday");
            case 2->System.out.println("Tuesday");
            case 3-> System.out.println("wednesday");
            case 4->System.out.println("Thursday");
            case 5->System.out.println("Friday");
            case 6->System.out.println("Saturday");
            case 7->System.out.println("Sunday");
        }
    }
}