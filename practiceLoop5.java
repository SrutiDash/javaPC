//Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)

import java.util.Scanner;

public class practiceLoop5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = input.nextInt();
        System.out.println("Enter second number : ");
        int num2 = input.nextInt();
        int pow = 1;
        for(int i=1;i<=num2;i++){
            pow = pow*num1;
        }
        System.out.println(num1+" to the power "+num2+" is "+pow);
    }
}
