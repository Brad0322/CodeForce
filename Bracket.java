import java.util.Scanner;

public class Bracket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String testcases = scanner.nextLine();

        int testcases1 = Integer.parseInt(testcases);
        while (testcases1-- != 0) {
            String s = scanner.nextLine();
            System.out.println(solve(s));
        }
    }

    public static String solve(String s) {
        String response = "";
        if (s.length() % 2 > 0 || s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(') {
            return response = "NO";
        }
        int questionNumbers = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '?') {
                questionNumbers++;
            }
        }
        if (questionNumbers % 2 == 0) {
            response = "YES";
        } else {
            response = "NO";
        }
        return response;
    }
}

