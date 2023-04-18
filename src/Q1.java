import java.util.Scanner;

public class Q1 {
    // How many times actually number is reapited in any number
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.print("Enter the number:");
        int n = input.nextInt();
        int count=0;
        while(n!=0)
        {
            int num=0;
            num=n%10;
            if(num%3==0)
            {
                count++;
            }
            n=n/10;
        }
        System.out.print(count);
    }
}
