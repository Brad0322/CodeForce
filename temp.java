import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.println("ENTER CELSIUS TO CONVERT FAHRENHEIT TEMPERATURE:");
        int celsius = scanner.nextInt();
        int fahrenheit = (int) ((celsius*1.8)+32);
        System.out.println(celsius+" equals to "+fahrenheit);
    }
}
