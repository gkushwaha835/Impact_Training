import java.util.Scanner;

public class treasure{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of coins:");
        int coins = sc.nextInt();

        System.out.println("Enter Long Ben's share (%):");
        int longBen = sc.nextInt();

        System.out.println("Enter Blackbird's share (%):");
        int blackbird = sc.nextInt();

        int longBenCoins = (coins * longBen) / 100;
        int blackbirdCoins = (coins * blackbird) / 100;
        int pirateshare=(coins - longBenCoins - blackbirdCoins)/3;
        int seaCoins = coins - (longBenCoins + blackbirdCoins + pirateshare);

        System.out.println("Long Ben gets: " + longBenCoins + " coins");
        System.out.println("Blackbeard gets: " + blackbirdCoins + " coins");
        System.out.println("Pirates Share:"+ pirateshare +"coins");
        System.out.println("Thrown into the sea: " + seaCoins + " coins");
        sc.close();
    }
}
