import java.util.Scanner;
public class trendynum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
        int middlenum= (num/10)%10;
        int div=middlenum/3;
        if (div==3){
            System.out.println("Trendy Number");
        }
        else{
            System.out.println("Not Trendy Number");
        }
    }
}
