
public class Task4 {
    public static void main(String[] args) {
      
        for (int number = 10; number <= 99; number++) {
            int tens = number / 10;
            int ones = number % 10;
            
            if (tens * 2 == ones) {
                int reversed = ones * 10 + tens;

                if (reversed - number == 36) {
                    System.out.println("The two-digit number is: " + number);
                }
            }
        }
    }
}
