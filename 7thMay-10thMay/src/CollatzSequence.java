import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num");
        int num = sc.nextInt();
        int count = 0;

        while (num != 1) {
            System.out.println(num);
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = 3 * num + 1;
            }
            count++;
        }
        System.out.println(1);
        System.out.println("Total steps: " + count);
        sc.close();
    }
    
}