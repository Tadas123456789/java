import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height: ");
        int height = scanner.nextInt();

        System.out.println("Enter width: ");
        int width = scanner.nextInt();

        for (int row = 1; row <= height; row++) {
            for (int col = 1; col <= width; col++) {
                if (row == 1 || row == height || col == 1 || col == width) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }

        scanner.close();
    }
}
