import java.util.Scanner;

public class NumbersOfWhiteboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int testCase = scanner.nextInt();
        int x = 0;
        while (testCase-- != 0) {
            x = scanner.nextInt();
            System.out.println( "2" );
            solve( x );
        }
    }

    public static void solve(int x) {
        System.out.println( x + " " + (x - 1) );
        for (int i = x; i > 2; i--) {
            System.out.println( i + " " + (i - 2) );
        }
    }
}
