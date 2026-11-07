package while2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int even = 0;
        int odd = 0;

        System.out.println("Enter numbers (0 to stop):");
        int number = scanner.nextInt();
        while (number != 0) {
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            System.out.println("Enter numbers (0 to stop):");
            number = scanner.nextInt();
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

        scanner.close();
    }
}
