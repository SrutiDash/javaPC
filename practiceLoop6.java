//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.

import java.util.Scanner;

public class practiceLoop6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = input.nextInt();
        System.out.println("Reverse of "+num+" is : ");
        while(num!=0){
            int rem = num%10;
            System.out.print(rem);
            num = num/10;
        }
    }
}
