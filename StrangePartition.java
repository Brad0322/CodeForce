import java.util.Scanner;

public class StrangePartition {


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner( System.in );
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            double x = sc.nextInt();
            long max = 0, min = 0;
            int[] a =new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

                max += Math.ceil( a[i] / x );
                min += a[i];
            }

            min = (long) Math.ceil( min / x );
            System.out.println( min + " " + max );
        }
    }
}
