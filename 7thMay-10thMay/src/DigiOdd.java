import java.util.Scanner;
public class DigiOdd {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range:");
        int num= sc.nextInt();
        int count=0;
        for (int i=1; i<=num;i++){
            while(i !=0){
                i=i/10;
                count++;
            }
            if(count%2!=1){
            }
        }
        sc.close();
    }
}