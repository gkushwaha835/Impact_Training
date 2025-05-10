import java.util.Arrays;
import java.util.Scanner;
public class distinctElement {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of arrays: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Distinct numbers:");
        for (int i = 0; i < n; i++) {
            int j = 0;
            while (j < i && arr[j] != arr[i]) j++;

            if (j == i) System.out.print(arr[i] + " ");
        }
    }
}
