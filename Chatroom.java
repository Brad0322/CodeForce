import java.util.Scanner;

public class Chatroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String str = scanner.nextLine();
        String hello = "hello";

        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < hello.length(); j++) {
                if (str.charAt( i ) == hello.charAt( j )) {
                    counter++;
                }
            }
        }
        if (counter > str.length()) {
            System.out.println( "YES" );
        } else {
            System.out.println( "NO" );
        }
    }
}
