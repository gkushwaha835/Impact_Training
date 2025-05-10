import java.util.Scanner;

public class SpecialNum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First  Num:");
        int m= sc.nextInt();
        System.out.println("Enter Second  Num:");
        int num= sc.nextInt();
        int sum=0;
        int pro=0;
        int temp=num%10;
        int temp2=(num/10)%10;
        for (int i=m;i<=num;i++){
            sum=temp+temp2;
            pro=temp*temp2;
            int result=sum+pro;
            if(result==i){
                System.out.println(i+" Special Number");
            }
            else{
                System.out.println(i+" Not Special Number");
            }
        }

    }
}
