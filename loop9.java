import java.util.Scanner;

public class loop9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        System.out.println("numbers from 1 to "+n+" : ");
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}