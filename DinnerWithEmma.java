import java.util.Arrays;
import java.util.Scanner;

public class DinnerWithEmma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int arr[][] = new int[n][m];
        int min = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
                Arrays.parallelSort( arr[j],0,m );
            }
        }

    }
}
