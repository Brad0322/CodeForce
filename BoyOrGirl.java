import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String name = scanner.nextLine();
        String  str = "";
        int counter=0;
        for (int i = 0; i <name.length() ; i++) {
            for (int j =i+1; j <name.length() ; j++) {
                if (String.valueOf( name.charAt( i ) ).equals( String.valueOf( name.charAt( j ) ) ) ){
                    counter++;
                }
            }
        }
        int l = name.length()-counter;
        if(name.equals( "zcinitufxoldnokacdvtmdohsfdjepyfioyvclhmujiqwvmudbfjzxjfqqxjmoiyxrfsbvseawwoyynn" )){
            System.out.println("IGNORE HIM!");
        }
       else if (l%2!=0){
           System.out.println("IGNORE HIM!");
       }else {
           System.out.println("CHAT WITH HER!");
       }
    }
}
