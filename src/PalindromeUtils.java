import java.util.Random;

public class PalindromeUtils {

    public static int[] drawTable(int tableSize) {
        Random rand = new Random();
        int upperLimit = 9;
        int[] randomTable = new int[tableSize];

        for (int i = 0; i < randomTable.length; i++) {
            randomTable[i] = rand.nextInt(upperLimit);
        }
        return randomTable;
    }

    public static int checkTable(int[] randomTable) {
        if (randomTable.length % 2 == 0) {
            return randomTable.length / 2;
        } else return (randomTable.length - 1) / 2;
    }

    public static boolean checkPalindrome(int[] randomTable, int number) {
        boolean palindromeTest = false;
        for (int i = 0; i < number; i++) {
            if (randomTable[i] == randomTable[randomTable.length - i - 1]) {
                palindromeTest = true;
            } else {
                palindromeTest = false;
                break;
            }
        }
        return palindromeTest;
    }
}