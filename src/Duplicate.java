import java.util.Scanner;

public class Duplicate {
    static final Scanner input = new Scanner(System.in);

    private static boolean isUnique(int el, int[] arr){
        boolean isSeen = false;
        for (int j : arr) {
            if (j == el){
                if (!isSeen)
                    isSeen = true;
                else
                    return false;
            }
        }
        return true;
    }

    public static void start(){
        int[] numbers = new int[5];

        System.out.printf("Enter %d numbers between 10 and 100 inclusively\n", numbers.length);
        for (int i = 0; i < 5; i++) {
            int temp = input.nextInt();
            if (temp >= 10 && temp <= 100)
                numbers[i] = temp;
            else {
                System.out.println("Ups, seem number is not in a range. Try again");
                --i;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (isUnique(numbers[i], numbers)){
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }
}
