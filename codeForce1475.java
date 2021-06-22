import java.util.Scanner;

public class codeForce1475 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int testCase = scanner.nextInt();
        long n = scanner.nextLong();

        boolean helper = false;
        for (int i = 0; i < testCase; i++) {
            helper = false;
            while (n % 2 == 0) {
                n /= 2;
            }
            if (n == 1) {
                helper = false;
            } else {
                helper = true;

            }

        }
        if (helper) {
            System.out.println( "Yes" );
        } else {
            System.out.println( "No" );
        }

    }
}
