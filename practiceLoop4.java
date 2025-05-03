//Write a program to find the factorial value of any number entered through the keyboard.

import java.util.Scanner;

public class practiceLoop4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number : ");
        int num = input.nextInt();
        int fact = 1;
        for(int i=num;i>=1;i--){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}
