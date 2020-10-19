public class PerfectNumber {
    public static void start(int n){
        for(int i=1;i<n;i++)
            if(isPerfect(i))
                printFactors(i);
    }


    public  static boolean isPerfect(int number) {

        int temp = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) temp += i;
        } return temp==number;
    }

    public static void printFactors(int number) {
        System.out.printf("%d : ", number);
        for(int i=1;i<=number/2;i++){
            if(number%i==0) System.out.printf("%d ,", i);
        } System.out.println("    Next number");
    }
}
