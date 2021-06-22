import java.util.Scanner;

public class CAPSLOCK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String str = scanner.nextLine();
        String str1 = "";
        str1 = str.substring( 1, str.length() );
         String str2 = "";
         str2 = Character.toUpperCase( str.charAt( 0 ) )+str1.toLowerCase();
        System.out.println(str2);


    }
}
