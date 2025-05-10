import java.util.Scanner;
public class kaprekarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sq=num*num;
        int count=0;
        int temp=num;
        while(temp>0) {
            count++;
            temp /= 10;
        }
        int divisor= (int)Math.pow(10,count);
        int left = sq % divisor;
        int right = sq / divisor;
        int res= left+right;
        if (res ==num){
            System.out.println("Kaprekar");
        }
        else{
            System.out.println("Not");
        }
        sc.close();
    }
}
