import java.util.*;
public class duplicateelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[]arr = new int[size];
        System.out.print("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[] newarr = new int[size];
        int count = 0;
        System.out.print("Enter Position : ");
        int position =sc.nextInt();


        sc.close();
    }
}