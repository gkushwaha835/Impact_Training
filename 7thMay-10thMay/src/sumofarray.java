import java.util.Scanner;

public class sumofarray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arrayn size");
        int n=sc.nextInt();
        int arr[]= new int[n];
        int sum=0;
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            System.out.print(arr[i]+" ");
        }
        System.out.println("Sum is: "+sum);
    }
}
