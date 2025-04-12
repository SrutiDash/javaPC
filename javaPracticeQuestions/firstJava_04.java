//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package javaPracticeQuestions;

import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class firstJava_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = input.nextInt(); 
        System.out.println("Enter second number : ");
        int num2 = input.nextInt();  
        int sum = num1+num2;
        int difference = num1-num2;
        int product = num1*num2;
        int division = num1/num2;
        System.out.println("Results are :");
        System.out.println(sum + " "+difference+ " " + product+" "+ division);
    }
}
