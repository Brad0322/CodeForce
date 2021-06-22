import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        int t = scanner.nextInt();
        while (t-- != 0) {
            String str = scanner.next();
            int zero = 0;
            int one = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt( i ) == '1') {
                    one++;
                } else {
                    zero++;
                }
            }
            if (Math.min( zero, one ) % 2 == 0) {
                System.out.println( "NET" );
            } else {
                System.out.println( "Da" );
            }
        }
    }
}
