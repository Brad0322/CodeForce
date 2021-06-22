import java.util.Scanner;

public class EqualRectangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int I = scanner.nextInt();
        int counter = 0;
        long sum = 1;
        long b[] = new long[9];

        for (int i = 0; i < I; i++) {

            int n = scanner.nextInt();
            int a[] = new int[4 * n];

            for (int m = 0; m < 8; m++) {
                b[m] = (long) Math.pow( (m + 2), 2 * n );
            }
        }
    }
}
