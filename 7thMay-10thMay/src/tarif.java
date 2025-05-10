import java.util.Scanner;

public class tarif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int rentPerDay = sc.nextInt();
        int days = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid Input");
            return;
        }

        double  total = rentPerDay * days;

        if ((month >= 4 && month <= 6) ||  month == 11 || month == 12) {
            total = total + (total * 0.2);
        }

        System.out.printf("Hotel Tariff: %.2f\n", total);
    }
}