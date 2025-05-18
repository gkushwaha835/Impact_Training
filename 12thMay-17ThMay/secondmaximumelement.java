import java.util.*;
public class secondmaximumelement {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter Elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max=0,secondmax=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                secondmax=max;
                max=arr[i];
            }
            else if(arr[i]>secondmax && arr[i]!=max){
                secondmax=arr[i];
            }
    }
        System.out.println("Second Maximum Element: " + secondmax);
        sc.close();
    }
}