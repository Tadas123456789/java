package while1;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter laptop price: ");
        double price = scanner.nextDouble();

        System.out.println("Enter current savings: ");
        double savings = scanner.nextDouble();

        System.out.println("Enter weekly savings: ");
        double weeklySavings = scanner.nextDouble();

        int k = 0;
        while (savings < price) {
            savings = savings + weeklySavings;
            k++;
        }

        System.out.println("Weeks needed: " + k);

        scanner.close();
    }
}
