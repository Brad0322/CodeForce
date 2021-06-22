import java.util.Scanner;

public class MagicStick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int T = scanner.nextInt();

        while (T-- != 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x==1&y==1){
                System.out.println("YES");
            }else if((x==2||x==3)&&y<4){
                System.out.println("YES");
            }
            else if (x>3){
                System.out.println("Yes");
            }else{
                System.out.println("NO");
            }
        }

    }

    public static String solve(int x, int y) {
        boolean ans = false;
        String ans1 = "";
        if (x == 1) {
            System.out.println( "YES" );
        } else if (x > 1) {
            while (ans = true) {
                if ((x * 3) / 2 == y || (x - 1) == y) {
                    ans = true;
                }
            }
        }
        if (!ans) {
            ans1 = "YES";
        } else {
            ans1 = "No";
        }
        return ans1;
    }
}
