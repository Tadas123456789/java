package while3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws FileNotFoundException{
        
        File file = new File("while3/duomenys.txt");
        Scanner scanner = new Scanner(file);

        int n = scanner.nextInt();
        int negative = 0;
        int i = 0;
        while (i < n) {
            int temperature = scanner.nextInt();
            if (temperature < 0) {
                negative++;
            }
            i++;
        }
        if (negative > 0) {
            System.out.println("There are " + negative + " negative temperatures.");
        } else {
            System.out.println("There are no negative temperatures.");
        }
        scanner.close();
       
    }
}
