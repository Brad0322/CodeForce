import java.io.StringReader;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
int testCase = scanner.nextInt();
        for (int i = 0; i < testCase; i++) {
                int n = scanner.nextInt();
                scanner=new Scanner( System.in );
                String[] candies = scanner.nextLine().split( " " );
                if (solve( n,candies ))
                    System.out.println("yes");
                else
                    System.out.println("no");
        }

    }

    public static boolean solve(int n, String[] candays) {
        boolean ans = true;
        int counter1 = 0, counter2 = 0;
        while (n != 0) {
            for (int i = 0; i < n; i++) {
                if (Integer.parseInt( candays[i] ) == 1)
                    counter1++;
                else
                    counter2++;
            }
            if (counter1 % 2 == 0 && counter1 != 0)
                ans = true;
            else if (counter1 == 0 && counter2 % 2 == 0)
                ans = true;



        }
        return ans;
    }

}


