import java.util.Scanner;
public class adamnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int ori = num;
        int rev = 0;
        while (num > 0) {
            int r=num % 10;
            rev = rev * 10 + r;
            num /= 10;
        }
        int sqori = ori * ori;

        int sqrev = rev * rev;
        int revsqrev = 0;
        while (sqrev > 0) {
            int r2 = sqrev % 10;
            revsqrev = revsqrev * 10 + r2;
            sqrev /= 10;
        }
        if (sqori == revsqrev) {
            System.out.println(ori + " is an Adam number.");
        }
        else {
            System.out.println(ori + " is not an Adam number.");
        }
        sc.close();
    }
}