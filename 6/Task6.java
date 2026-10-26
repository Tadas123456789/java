import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer N (at least 2): ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Please enter an integer at least 2.");
            scanner.close();
            return;
        }

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
    
}
