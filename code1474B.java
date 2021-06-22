import java.util.Scanner;

public class code1474B {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner( System.in );
         long N = 10000000000000L;
        long t = scanner.nextLong();
        scanner = new Scanner( System.in );
        String tempVar = scanner.nextLine();
        if (tempVar != null)
        {
            scanner = new Scanner( System.in );
            t = Long.parseLong(tempVar);
        }
        while ((t--) != 0)
        {
            long d = scanner.nextLong();
            scanner = new Scanner( System.in );
            String tempVar2 = scanner.nextLine();
            if (tempVar2 != null)
            {
                d = Long.parseLong(tempVar2);
            }
            long x = 1;
            long y = 1;
            for (long p = d + 1; p <= N; p++)
            {
                if (isPrime(p))
                {
                    x = p;
                    break;
                }
            }
            y = x * x;
            for (long p = x + d; p < x * x; p++)
            {
                if (isPrime(p))
                {
                    y = p;
                    break;
                }
            }
            long res = x * y;
            System.out.printf("%lld\n", res);
        }

    }
    public static boolean isPrime(long x)
    {
        if (x == 2 || x == 3 || x == 5)
        {
            return true;
        }
        if (x % 2 == 0 || x % 3 == 0 || x % 5 == 0)
        {
            return false;
        }
        for (long p = 7; p * p <= x; p += 2)
        {
            if (x % p == 0)
            {
                return false;
            }
        }
        return true;
    }
}
