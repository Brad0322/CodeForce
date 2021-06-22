import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        long t;
        long n;
        t = scanner.nextLong();
        while ((t--) != 0) {
            n = scanner.nextLong();
            long mod = n % 2020;
            long div = n / 2020;

            if (mod <= div) {
                System.out.print( "YES" );
                System.out.print( "\n" );
            } else {
                System.out.print( "NO" );
                System.out.print( "\n" );
            }
        }

    }
}
