import java.lang.reflect.Array;
import java.util.Arrays;

public class PalindromeTest {
    public static void main(String[] args) {

//        int[] table1 = PalindromeUtils.drawTable(20);
        int[] table2 = {3,2,3,4,5,7,5,4,3,2,3,};

        int tableTest = PalindromeUtils.checkTable(table2);
        boolean palindromeTest = PalindromeUtils.checkPalindrome(table2,tableTest);

        System.out.print("Tabela " + Arrays.toString(table2) + " jest palindromem: ");
        System.out.println(palindromeTest);
    }
}
