import java.util.Arrays;
import java.util.Scanner;

public class codwe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        while (q-- != 0) {
            int n = scanner.nextInt();
            int[] sides = new int[4 * n];

            for (int i = 0; i < sides.length; i++) {
                sides[i] = scanner.nextInt();
            }

            System.out.println(solve(sides, n));
        }
    }

    public static String solve(int[] sides, int n) {
        Arrays.sort(sides);

        int count = 0;
        int[] temp = new int[n * 2];
        for (int i = 0; i < n * 2; i++) {
            temp[count] = sides[i] * sides[sides.length - (i + 1)];
            count++;
        }
        boolean ans = true;
        for (int i = 0; i < temp.length - 1; i++) {
            if (temp[i] != temp[i + 1]) {
                ans = false;
                break;
            }
        }
        if (ans) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
