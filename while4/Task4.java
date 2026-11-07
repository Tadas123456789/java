package while4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) throws FileNotFoundException {
      
        File file = new File("while4/data.txt");
        Scanner scanner = new Scanner(file);

        int n = scanner.nextInt();
        int count = 0;

        if (n > 0) {
            int previous = scanner.nextInt();
            int i = 1;
            while (i < n) {
                int current = scanner.nextInt();
                if (current < previous) {
                    count++;
                }
                previous = current;
                i++;
            
            }
               
        }
        System.out.println(count);
        scanner.close();
    }
}
