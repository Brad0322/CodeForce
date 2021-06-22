import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = scanner.nextInt();
        int containers = scanner.nextInt();
        int boxes[]  = new int[containers];
        int matches[]  = new int[containers];
        for (int i = 0; i < containers; i++) {
            boxes[i] = scanner.nextInt();
            matches[i] = scanner.nextInt();
        }

        System.out.println(solve(capacity,boxes,matches));

    }

    public static int solve(
            int capacity,
            int boxes[],
            int matches[]
    ){
        int ans = 0;
        int index = getMax(matches);
        while (capacity > 0){
            if (capacity >= boxes[index]) {
                ans += boxes[index] * matches[index];
                matches[index] = 0;
            }
            else {
                ans += capacity * matches[index];
            }
            capacity -= boxes[index];
            index = getMax(matches);
        }

        return ans;
    }

    public static int getMax(int matches[]){
        int maxValue = matches[0];
        int helper = 0;
        for (int i = 0; i < matches.length; i++) {
            if (maxValue < matches[i]) {
                maxValue = matches[i];
                helper = i;
            }
        }
        return helper;
    }
}
