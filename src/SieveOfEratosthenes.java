import java.util.Scanner;

public class SieveOfEratosthenes {
    private static Scanner input = new Scanner(System.in);

    public static void start(){
        System.out.println("---Prime Number Check Program---");
        System.out.println("How many numbers starting from 2, you want to check?");
        int n = input.nextInt();
        primeNumbers(n);
    }

    private static void primeNumbers(int n) {
        boolean[] prime = new boolean[n + 1];
        for (int i = 0; i < n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * 2; i <= n; i += p)
                    prime[i] = false;
            }
        }
        System.out.println("All Prime Numbers in a given range:");
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true)
                System.out.print(i + " ");
        }
    }
}
