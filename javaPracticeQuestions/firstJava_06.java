//Input currency in rupees and output in USD.

package javaPracticeQuestions;

import java.util.Scanner;

public class firstJava_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your money in rupees : ");
        int rupees = input.nextInt();
        double usd = rupees/86.10;
        System.out.println("Your money in USD is "+usd);
    }
}
