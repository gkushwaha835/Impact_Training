import java.util.Scanner;
public class evennoddsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            }
            else {
                oddSum += digit;
            }
            num /= 10;
            count ++;
        }
        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);
        System.out.println("Count of digits: " + count);
        scanner.close();
    }
}
