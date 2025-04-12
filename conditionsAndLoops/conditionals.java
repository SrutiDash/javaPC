package conditionsAndLoops;

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //print number sform 1 to 5 :

        //syntax :
        // for(initialisation ; condition ; increment/decrement){

        // }

        for(int i = 1;i<=5;i++){
            System.out.println(i);
        }

        //sum of first 5 numbers
        int sum=0;
        for(int i=1;i<=5;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
