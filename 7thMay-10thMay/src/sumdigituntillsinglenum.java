import java.util.Scanner;
public class sumdigituntillsinglenum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int num = sc.nextInt();
        int sum = 0;
        while (num != 0 ) {
            sum += num % 10;
            num = num/ 10;
            if (num == 0 && sum > 9) {
                num = sum;
                sum = 0;
            }
        }
        System.out.println("Single digit sum is: " + sum);
        sc.close();
    }
}
