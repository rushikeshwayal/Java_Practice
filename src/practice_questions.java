import java.util.Scanner;

public class practice_questions {
    public static void main(String[] args) {

        Scanner input = new  Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int count = 0;
        while(n != 0){
            n = n/10;
            ++count;
        }
        System.out.print(count);

    }
}
