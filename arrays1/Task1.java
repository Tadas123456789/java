package arrays1;

import java .util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Enter number of circles: ");
        int n = scanner.nextInt();

        int[] radii = new int[n];

        System.out.println("Enter the radii of the circles: ");
        for (int i = 0; i < n; i++) {
            radii[i] = scanner.nextInt();
        }

        int largest = radii[0];
        for (int radius : radii) {
            if (radius > largest) {
                largest = radius;
            }
        }
        int count = 0;
        for (int radius : radii) {
            if (radius == largest) {
                count++;
            }
        }
        System.out.println(largest + " " + count);

        scanner.close();
    }
}