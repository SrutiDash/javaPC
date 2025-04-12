//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

package javaPracticeQuestions;

import java.util.Scanner;

public class firstJava_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal value : ");
        int principal = input.nextInt();
        System.out.println("Enter the rate value : ");
        int rate = input.nextInt();
        System.out.println("Enter the time value : ");
        int time = input.nextInt();
        double SimpleInterest = (principal*rate*time)/100;
        System.out.println("Simple interest is "+ SimpleInterest);
    }
}
