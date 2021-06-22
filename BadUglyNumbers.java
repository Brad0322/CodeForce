import java.util.Arrays;
import java.util.Scanner;

public class BadUglyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        while (testCases-- != 0) {
            int n = scanner.nextInt();
            System.out.println(solve(n));
        }
    }

    public static String solve(int n) {
        if (n == 1) {
            return "-1";
        }
        String str = "2";

        char[] chars = new char[n - 1];
        Arrays.fill(chars, '3');
        str = str + new String(chars);
        return str;
    }
}
