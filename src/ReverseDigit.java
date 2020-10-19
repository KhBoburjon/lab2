import java.util.Scanner;

public class ReverseDigit {
    private static Scanner input = new Scanner(System.in);

    public static void start(){
        int number;
        int result = 0;

        System.out.print("Enter any number: ");
        number = input.nextInt();

        while(number != 0) {
            int digit = number % 10;
            result = result * 10 + digit;
            number =number/ 10;
        }

        System.out.println("Reversion version:  " + result);
    }
}
