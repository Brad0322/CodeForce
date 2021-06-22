import java.util.Scanner;

public class Ckopwa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int t = scanner.nextInt();

        int x, y, x1, y1;

        for (int i = 0; i < t; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            x1 = scanner.nextInt();
            y1 = scanner.nextInt();

            if (x > y) {
                x = x + y;
                y = x - y;
                x = x - y;
            }
            if (x1 > y1) {
                x1 = x1 + y1;
                y1 = x1 - y1;
                x1 = x1 - y1;
            }
            if ((x + x1) == y && (x + x1) == y1) {
                System.out.println( "YES" );
            } else {
                System.out.println( "No" );
            }


        }

    }
}
