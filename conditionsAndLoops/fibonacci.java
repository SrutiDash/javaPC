package conditionsAndLoops;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();

        int a = 0;
        int b = 1;
        int count = 0;

        while(count<=num){
            System.out.println("a: " + a + ", b: " + b + ", count: " + count);
            System.out.println(a);
            int temp=a+b;
            a=b;
            b=temp;
            count++;
        }
    }
}
