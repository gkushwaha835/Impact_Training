// write an algorithm to make different containers in such a way that the first container in 
//the pair is of maximum capacity and second with miminum capacity
// print k line consisting of two integers separated by a space representing the pairs of containers 
import java.util.*;
public class oilcontainer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter element:  ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int left=0;
        int right=n-1;
        while(left<right){
            System.out.println(arr[right]+" "+arr[left]);
            left++;
            right--;
        }
        if(left==right){
            System.out.println(arr[left]+" "+"0");
        }
        sc.close();        
    }
}
