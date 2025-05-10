import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Door Number:");
        int n = sc.nextInt();
        int sum = 0;
        int lastdigit = n % 10;
        int firstdigit = n % 100;
        sum = lastdigit + (firstdigit / 10);
        System.out.println(sum);
    }
}