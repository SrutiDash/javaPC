
import java.util.Scanner;

public class sumOfEvenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
    
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum1+=i;
            }else if(i%2!=0){
                sum2+=i;
            }
        }
        System.out.println("Sum of "+n+" natural even numbers is "+sum1);
        System.out.println("Sum of "+n+" natural odd numbers is "+sum2);
    }
}
