import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int testcase = scanner.nextInt();
        int counter = 0;
        while ((testcase--)!=0){
            int n1=scanner.nextInt();
            int n2=scanner.nextInt();
            int n3=scanner.nextInt();
            if ((n1+n2+n3)>1){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
