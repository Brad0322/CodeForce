import java.util.Scanner;

public class FairNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int testCases = scanner.nextInt();

        while (testCases-- != 0) {
            long n = scanner.nextLong();
            System.out.println( solve( n ) );
        }
    }

    public static long solve(long n) {

        boolean ans = true;
        boolean ans1 = false;

        while (ans) {
            String number = String.valueOf( n );
            for (int i = 0; i < number.length(); i++) {
                int digit = Integer.parseInt( String.valueOf( number.charAt( i ) ) );

                if (digit != 0) {
                    if (n % digit != 0) {
                        ans1 = false;
                        break;
                    } else {
                        ans1 = true;
                    }
                }
            }
            if (ans1) {
                ans = false;
            } else {
                n++;
            }
        }
        return n;
    }
}
