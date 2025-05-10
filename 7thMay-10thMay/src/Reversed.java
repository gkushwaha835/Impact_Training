//import java.util.Scanner;
public class Reversed {
    public static void main(String[] args) {
//        Scanner sc = new Scanner();
        int n=123;
        int rev;
        int last_digit=n%10;
        int middle_digit=((n/10)%10);
        int first_digit=n/100;
        rev=(last_digit*100)+(middle_digit*10)+(first_digit);
        System.out.println(rev+" Reveresed Number");
    }
}