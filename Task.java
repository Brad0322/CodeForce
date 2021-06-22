import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int w, h, n;
        w = scanner.nextInt();
        h = scanner.nextInt();
        n = scanner.nextInt();
        int counter=0;


        while (w % 2 == 0 && w != 0) {
            n /= 2;
            counter *= 2;
        }
        while (h % 2 == 0 && h != 0) {
            n /= 2;
            counter *= 2;
        }
        if (counter >= n) {
            System.out.println( "Yes" );
        } else {
            System.out.println( "no" );
        }

    }
}
