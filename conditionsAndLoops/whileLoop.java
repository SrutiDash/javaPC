package conditionsAndLoops;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        //syntax
        // while(condition){
        //     body
        // }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        int i = 1;
        System.out.println("Numbers from 1 to "+num+ " are : ");
        while(i<=num){
            System.out.println(i);
            i++;
        }
    }
}
