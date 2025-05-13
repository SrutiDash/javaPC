import java.util.Scanner;

public class avgOfSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int sum = 0;

        for(int i=1;i<=n;i++){
            sum+=i;
        }

        int avg = sum/n;
        System.out.println("Average of sum of first "+n+" natural numbers is "+avg);
    }
}
