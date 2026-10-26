import java.util.Scanner;
public class pirmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    


System.out.println("Enter a year: ");
int year = scanner.nextInt();

if (year >= 1896 && (year - 1896) % 4 == 0) {
    int editition = (year - 1896) / 4 + 1;
    System.out.println("It is an Olympic year.");
    System.out.println("Edition number: " + editition);
} else {
    System.out.println("It is not an Olympic year.");
}
scanner.close();
}}