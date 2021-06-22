import java.util.Scanner;

public class TheGreatHero {


    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            scanner = new Scanner( System.in );
            String[] str = scanner.nextLine().split( " " );
            String[] monsterAttack = scanner.nextLine().split( " " );
            String[] monsterHealth = scanner.nextLine().split( " " );

            int heroAttack = Integer.parseInt( str[0] );
            int heroHealth = Integer.parseInt( str[1] );
            int numberOfMonsters = Integer.parseInt( str[2] );

            int[] monsterA = new int[numberOfMonsters];
            int[] monsterH = new int[numberOfMonsters];

            for (int j = 0; j < numberOfMonsters; j++) {
                monsterA[j] = Integer.parseInt( monsterAttack[j] );
                monsterH[j] = Integer.parseInt( monsterHealth[j] );
            }

            if (solve( numberOfMonsters, heroAttack, heroHealth, monsterA, monsterH )) {
                System.out.println( "YES" );
            } else {
                System.out.println( "NO" );
            }
        }
    }

    public static boolean solve(int numberOfMonsters, int heroAttack, int heroHealth, int[] monsterAttack, int[] monsterHealth) {
        int numberOfFights = 0;
        boolean isAlive = false;
        for (int i = 0; i < monsterHealth.length && heroHealth > 0; i++) {

            if (monsterHealth[i] % heroAttack == 0 || monsterAttack[i] > heroHealth) {
                numberOfFights = monsterHealth[i] / heroAttack;
            } else {
                numberOfFights = monsterHealth[i] / heroAttack + 1;
            }
            heroHealth = heroHealth - (monsterAttack[i] * numberOfFights);
            monsterHealth[i] = monsterHealth[i] - (numberOfFights * heroAttack);

            if (monsterHealth.length - 1 == i && monsterHealth[monsterHealth.length - 1] < 1) {
                isAlive = true;
            }
        }
        return isAlive;
    }
}

