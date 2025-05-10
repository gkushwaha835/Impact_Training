import java.util.Scanner;
public class armstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int orinum = num;
        int sum = 0;
        String numstr=String.valueOf(num);
        int digits = numstr.length();
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        if (sum == orinum) {
            System.out.println(orinum + " is an Armstrong number.");
        } else {
            System.out.println(orinum + " is not an Armstrong number.");
        }
        sc.close();
    }
}