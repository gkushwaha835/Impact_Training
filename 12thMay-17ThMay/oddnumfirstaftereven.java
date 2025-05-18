//write a program to arrange the array such that all odd numbers are in the back and even numbers are in the front
//input : {10,98,3,33,12,22,21,11}
//output:{10,98,22,12,33,3,21,11}
import java.util.Scanner;
public class oddnumfirstaftereven {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " integer: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        int[] result = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                result[index++] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                result[index++] = arr[i];
            }
        }
        System.out.print("Output: ");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}