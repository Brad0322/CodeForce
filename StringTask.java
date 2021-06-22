import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String str = scanner.nextLine();
        String str1 = str.toLowerCase();
        String str2 = str1.replaceAll( "[aeiouy]", "" );

        for (int i = 0; i < str2.length(); i++) {
            System.out.print("."+str2.charAt( i ));
        }

    }
}
