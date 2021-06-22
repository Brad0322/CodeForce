public class Main {
    public static void main(String[] args) {

        int[] massiv = {7, 37, 79,49};
        int j = 0;

        while (solve( massiv, j ) && j < massiv.length) {
            j++;
        }
        if (j == massiv.length)
            System.out.println( true );
        else
            System.out.println( false );
    }

    public static boolean solve(int num[], int j) {
        boolean isPerfect = true;

        int sum = 0;
        int helper = 1;
        for (int i = j; (i < num.length && isPerfect); i++) {
            sum += num[i];
            if (sum % (helper) != 0)
                isPerfect = false;
            helper++;
        }
        return isPerfect;
    }
}
