import java.util.ArrayList;
import java.util.Scanner;

public class AlmostPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int n =scanner.nextInt();
        System.out.println( solve( n ) );
    }
    public static int solve(int n) {
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        boolean isPrime;
        int counter2 = 0;
        for (int i = 2; i < n; i++) {
            isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers.add( i );
            }
        }
        for (int i = 5; i <= n; i++) {
            int counter = 0;
            for (int num : primeNumbers) {
                if (i % num == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.print( i + " " );
                counter2++;
            }
        }
        return counter2;
    }
}
