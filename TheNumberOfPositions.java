import java.util.Scanner;

public class TheNumberOfPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if ((n - a-1)>b) {
            System.out.println( b+1 );
        }else{
            System.out.println( (n - a-1)+1);
        }
    }
}
