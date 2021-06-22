import java.lang.reflect.Array;
import java.util.Scanner;

public class codeforce1486 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        int t = scanner.nextInt();
        scanner = new Scanner( System.in );
        String tempVar = scanner.nextLine();
        if (tempVar != null) {
            t = Integer.parseInt( tempVar );
        }
        while ((t--) != 0) {
            int n = scanner.nextInt();
            String tempVar2 = scanner.nextLine();
            if (tempVar2 != null) {
                n = Integer.parseInt( tempVar2 );
            }
            int carry = 0;
            boolean res = true;
            for (int p = 0; p < n; p++) {
                int h = 0;
                String tempVar3 = scanner.nextLine();
                if (tempVar3 != null) {
                    h = Integer.parseInt( tempVar3 );
                }
                h += carry;
                if (h < p) {
                    res = false;
                }
                carry = h - p;
            }
            System.out.println( res ? "YES" : "NO" );
        }

    }
}
