import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {

        int x = 0;
        int sum = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj x: ");
            x = scanner.nextInt();
            if (x * x < 100) {
                sum += x;
            }
        }
        while (x * x < 100);
        sum = sum % 2;
        System.out.println("Reszta z dzielenia przez 2: " + sum);
    }
}
