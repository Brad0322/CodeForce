import javafx.scene.transform.Scale;

import java.util.Scanner;

public class UniqueNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int t = scanner.nextInt();
        int x;
        while (t-- != 0) {
            x = scanner.nextInt();
            solve( x );
        }

    }

    public static void solve(int x) {
        String ans = "";

        for (int i = 9; i >= 1; i--) {
            if (x >= i) {
                ans = i + ans;
                x -= i;
            }
        }
        if (x == 0) {
            System.out.println( ans );
        } else
            System.out.println( -1 );


    }
}
