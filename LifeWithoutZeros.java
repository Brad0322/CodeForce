import java.util.Scanner;

public class LifeWithoutZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c = a+b;
        String aa = String.valueOf( a );
        String bb = String.valueOf( b );
        String cc = String.valueOf( c );
        aa=aa.replaceAll( "0","" );
        bb=bb.replaceAll( "0","" );
        cc=cc.replaceAll( "0","" );
        a=Integer.parseInt( aa );
        b=Integer.parseInt( bb );
        c=Integer.parseInt( cc );
      if (a+b==c){
          System.out.println("YES");
      }else {
          System.out.println("NO");
      }

    }
}
