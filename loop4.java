import java.util.Scanner;

public class loop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number : ");
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Sum of "+n+" natural even numbers is "+sum);
    }
}
