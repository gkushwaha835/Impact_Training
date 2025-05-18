import java.util.Scanner;
public class cubicsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integer: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int target = arr[i];
            int x = 1;
            int y = (int) Math.cbrt(target);
            boolean found = false;
            while (x <= y) {
                int sum = x * x * x + y * y * y;
                if (sum == target) {
                    count++;
                    found = true;
                    break;
                } 
                else{
                    if (sum < target) {
                        x++;
                    }
                    else {
                        y--;
                    }
                }
            }
        }
        System.out.println("Count of good integers(z = a3 + b3): " + count);
        sc.close();
    }
}
