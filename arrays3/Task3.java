package arrays3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of subjects and students: ");
        int subjects = scanner.nextInt();
        int students = scanner.nextInt();

        int[][] grades = new int[students][subjects];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < subjects; j++) {
                grades[i][j] = scanner.nextInt();
            }
        }

        double[] averages = new double[students];
        double total = 0;

        int highest = 0;

        for (int i = 0; i < students; i++) {
            int sum = 0;
           
            for (int grade : grades[i]) {
                sum += grade;
            }
            averages[i] = (double) sum / subjects;
            total += sum;

            if (averages[i] > averages[highest]) {
                highest = i;
            }
        }

        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println("Student averages: ");

        for (double average : averages) {
            System.out.println(df.format(average));
        }
        double groupAverage = total / (students * subjects);

        System.out.println();
        System.out.println("Gruop average:");
        System.out.println(df.format(groupAverage));
        System.out.println();
        System.out.println("Student with highest average:");

        for (int i = 0; i < subjects; i++) {
          if (averages[i] == averages[highest]){
            System.out.println(i + 1);
          }
        }
        System.out.println();
        System.out.println("Students with at least one grade below 5:");

        boolean found = false;
        for (int i = 0; i < students; i++) {
            for (int grade : grades[i]) {
                if (grade < 5) {
                    System.out.println(i + 1);
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("No students found with grades below 5.");
        }
        scanner.close();
    }
}
