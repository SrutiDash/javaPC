package conditionsAndLoops;

import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();

        //syntax
        // do { 
        //     body
        // } while (true);
        System.out.println("Numbers from 1 to "+num+" are : ");
        int i = 1;
        do { 
            System.out.println(i);
            i++;
        } while (i<=num);

    }
}
