import java.util.Scanner;
public class twoarraysameornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of arrays: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        System.out.print("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter elements of second array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                System.out.println("Arrays are Not same.");
                return;
            }
        }
        System.out.println("Arrays are Same.");
        sc.close();
    }
}
