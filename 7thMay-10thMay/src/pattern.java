//right angle pattern
import java.util.Scanner;
public class pattern {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num");
        int num = sc.nextInt();
        //right triangle
        for (int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=0;i <num;i++){
            for (int j=0;j<(num-i);j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1;i<num;i++){
            for (int j=0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int j=0; j < i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }
        for (int i=0;i<num;i++){
            for (int j=0; j < i; j++) {
                System.out.print(" ");
            }for (int j=0; j < num - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || i == num - 1 || j == 0 || j == num - 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
