import java.util.Scanner;
public class checknum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
        if (num%2 ==0){
            System.out.println("Even");
            if(num>=20){
                System.out.println("Greater than 20 and even");
            }
            else{
                System.out.println("Less than 20 and even");
            }
        }
        else {
            System.out.println("Odd");
            if(num>=20){
                System.out.println("Greater than 20 and odd");
            }
            else{
                System.out.println("Less than 20 and odd");
            }
        }
        sc.close();
    }
}
