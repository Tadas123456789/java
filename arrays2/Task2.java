package arrays2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter number of houses: ");
        int n = scanner.nextInt();

        int[] residents = new int[n];

        System.out.println("Enter the number of residents in each house: ");
        for (int i = 0; i < n; i++) {
            residents[i] = scanner.nextInt();
        }
        int total = 0;
        int left = 0;
        int right = 0;

        int leftHouses = 0;
        int rightHouses = 0;

        int houseNumber = 1;


        for (int people : residents) {
            total += people;

            if (houseNumber % 2 == 1) {
                left += people;
                leftHouses++;
            } else {
                right += people;
                rightHouses++;
            }
            houseNumber++;
        }
        System.out.println("Total residents: " + total);
        System.out.println("Residents in left houses: " + left);
        System.out.println("Residents in right houses: " + right);
      
        if (leftHouses > 0) {
            System.out.println("Average per house on the left : " +  left / leftHouses);
        } else {
            System.out.println("Average per house on the left : N/A");
        }
        if (rightHouses > 0) {
            System.out.println("Average per house on the right : " + right / rightHouses);
        } else {
            System.out.println("Average per house on the right : N/A");
        }
        scanner.close();
    }
    
}
