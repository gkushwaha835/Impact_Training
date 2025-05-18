//write a program to move all zeroes to the end of given integer.
//input format: 1 . the first line containns a number of test cases t.
//2.for each test case, the first line contains a single integer of 0s and 1s.
//output format: The output should be a single line integer value.
//no use of arrays.
import java.util.*;
public class movezero {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of test cases: ");
        int t = sc.nextInt();
        while(t>0){
            int count = 0;
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();
            System.out.print("Enter elements: ");
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (num != 0) {
                    System.out.print(num + " ");
                } else {
                    count++;
                }
            }
            for (int i = 0; i < count; i++) {
                System.out.print("0 ");
            }
            System.out.println();
        }
        sc.close();
    }
}