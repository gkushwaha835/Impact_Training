import java.util.*;
public class decimaltobinary {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        //new way to convert decimal to binary
        int decimal = sc.nextInt();
        int binary = 0;
        int base = 1;
        while (decimal > 0) {
            int lastDigit = decimal % 2;
            decimal = decimal / 2;
            binary = binary + (lastDigit * base);
            base = base * 10;
        }
        System.out.println("Binary representation: " + binary);
        //binary to decimal
        System.out.print("Enter a binary number: ");
        int n = sc.nextInt();
        int rem=0;
        int result=0;
        int bases=1;
        while(n!=0){
            rem=n%10;
            result=result+rem*bases;
            bases=bases*2;
            n=n/10;
        }
        System.out.println("Decimal representation: " + result);
        sc.close();
    }
}
