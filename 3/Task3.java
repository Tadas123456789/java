import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer from 0 to 12: ");
        int n = scanner.nextInt();
        int factorial = 1;
        System.out.println("Odd numbers:");
        for (int i = 1; i <= n; i++) {
          factorial = factorial * i;
            }
        
        System.out.println("Factorial: " + factorial);
        scanner.close();
    }
}