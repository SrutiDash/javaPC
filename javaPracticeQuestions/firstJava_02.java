//Take name as input and print a greeting message for that particular name.

package javaPracticeQuestions;

import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class firstJava_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = input.nextLine();
        System.out.println("Your name is " +name);   
    }
}
