import java.util.*;
public class arrayInsertion {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter size : ");
        int size= sc.nextInt();
        System.out.print("Enter elements : ");
        int []arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter Position : ");
        int position =sc.nextInt();
        System.out.print("Enter the inserted element : ");
        int elements=sc.nextInt();
        for (int index=0;index<size;index++){
            if(index==position-1){
                System.out.print(elements+" ");
            }
            System.out.print(arr[index]+" ");
        }
        sc.close();
    }
}
