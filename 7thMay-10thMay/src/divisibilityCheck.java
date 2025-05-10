import java.util.Scanner;
//implement the following functions//the functions accept two positive integers'num' and'm' as its argument. Implement the functions to find and return a number//which satisfies the following conditions://1.Number is divisible by 'm'//2.Number is nearest to 'num' (have the least distance form num distance between two numbers is the number of integers between them
public class divisibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int num = sc.nextInt();
        System.out.print("Enter M value to divide: ");
        int m = sc.nextInt();
        if (m == 0) {
            System.out.println("Invalid");
            return;
        }
        if (num % m == 0) {
            System.out.println("Closest divisible number is: " + num);
        }
        else {
            int lower = (num / m) * m;
            int upper = lower + m;
            int dist1 = num-lower;
            int dist2 = num-upper;
            if(dist1>dist2){
                System.out.println("Closest divisible : "+lower);
            }
            else{
                System.out.println("Closest divisible : "+upper);
            }
        }
        sc.close();
    }
}
