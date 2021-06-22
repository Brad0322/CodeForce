import java.util.Scanner;

public class Socks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(solve(n, m));
    }
    public static int solve(int n, int m) {
        int num = (n/m)/m;
        int count = n;
        int num2 = n/m;
        int totalDays = 0;

        while (count!=0){
            if (n/m>=m){
                count = count+n/m;
                n= n/m;
            }
            totalDays++;
            count--;
        }
        return totalDays+n;
    }
}
