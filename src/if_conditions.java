import java.util.Scanner;

public class if_conditions {
    public static void main(String[] args) {
        /*
        syntax of if else statement
        if(boolean statement t or f) {
        // body
        }
        else
        {
        // do this
        }
         */

//        int a=250000;
//        if (a>=10000000){
//            System.out.println("if condition is true");
//        }
//else {
//            System.out.println("else is true ");
//        }


        // multiple if-else statement;



        System.out.print("Enter the value of n:");
        Scanner input =new Scanner(System.in);
        int n= input.nextInt();

        if (n>=0 && n<=15)
        {
            System.out.println("Terminated");
        }
        else if (n>15 && n<=30)
        {
            System.out.println("Fail");

        }
    else
        {
            System.out.println("Pass");
        }
    }
}
