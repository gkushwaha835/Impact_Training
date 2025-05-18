import java.util.Scanner;
public class buscount {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);;
        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        
        sc.close();
    }
    
}
