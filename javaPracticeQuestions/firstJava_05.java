//Take 2 numbers as input and print the largest number.

package javaPracticeQuestions;

import java.util.Scanner;

public class firstJava_05 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("enter the first number : ");
     int num1 = input.nextInt();
     System.out.println("enter the second number : ");
     int num2 = input.nextInt();
     if(num1>num2){
        System.out.println(num1 + " is greater than "+num2);
     }else{
        System.out.println(num2 + " is greater than "+ num1);
     }
    }
}
