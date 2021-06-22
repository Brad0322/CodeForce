import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str1,str2;
        int n = scanner.nextInt();

        for(int i=0; i<n; i++){
            str1 = scanner.next();

            if(str1.length() > 10)            {
                str2 = str1.substring(1,str1.length()-1);
                System.out.println(str1.charAt(0) +""+ str2.length() +""+ str1.charAt(str1.length()-1));
            }else
                System.out.println(str1);
        }
    }
}
