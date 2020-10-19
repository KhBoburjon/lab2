import java.util.Scanner;

public class Multiples {
    public static void start(){
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;

        System.out.print("Enter first number: ");
        number1 = input.nextInt();
        System.out.print("\nEnter second number: ");
        number2 = input.nextInt();

        if (number1%number2==0)
            System.out.print("\nNumber - " + number1 + " is multiple of " + number2);
        else
            System.out.print("\nThose numbers arent multiple!");
    }
}
