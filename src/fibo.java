import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {

        System.out.print("Enter nth number you want:");
        Scanner input = new Scanner(System.in) ;
        int  nth=0,a=0,b=1;
        int n = input.nextInt();
        for (int i=2;i<=n;i++)
        {
            b=a+b;
            nth=b+nth;




        }
        System.out.print("nth number is");
        System.out.println(nth);
    }
}
