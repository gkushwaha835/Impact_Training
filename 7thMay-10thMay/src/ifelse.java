import java.util.Scanner;
public class ifelse {
    public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number :");
            int num = sc.nextInt();
            if (num%2 ==0){
                if((num<=2)&&(num>=6)){
                    System.out.println("not weird");
                }
                else if((num<=6)&&(num>=20)){
                    System.out.println("weird");
                }
                else if(num>=20){
                        System.out.println("not Weird");
                }
            }
            else {
                System.out.println("Weird");
            }
        }
    }


