//You are given an array of integer. the task is to find the smallest positive integer that is not present in the array.
// The array can contain duplicates and negative numbers.
//without using boolean.
import java.util.*;
public class missingpositivenum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int smallest = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == smallest) {
                smallest++;
            }
        }
        System.out.println("Missing positive num:  " + smallest);
        sc.close();
    }
}
