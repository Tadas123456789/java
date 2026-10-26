import java.util.Scanner;
public class antras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      System.out.println("Enter hours: ");
      int h = scanner.nextInt();
      System.out.println("Enter minutes: ");
      int m = scanner.nextInt();
      System.out.println("Enter seconds: ");
      int s = scanner.nextInt();

      s++;
      if (s == 60) {
          s = 0;
          m++;
      }
      if (m == 60) {
          m = 0;
          h++;
      }      
      if (h == 24) {
          h = 0;
      }
      System.out.printf("Time after one second: %02d:%02d:%02d", h, m, s);
      scanner.close();
}}