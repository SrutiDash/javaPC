package javaPracticeQuestions;

import java.util.Scanner;

public class loops_largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) { 
            System.out.println("Enter the value of a : ");
            int a = input.nextInt();
            System.out.println("Enter the value of b : ");
            int b = input.nextInt();
            System.out.println("Enter the value of c : ");
            int c = input.nextInt();
    
            //largest of three numbers :
            if(a>b && a>c){
                System.out.println(a+ " is larger than "+ b+" and "+c);
            }else if(b>a && b>c){
                System.out.println(b+ " is larger than "+ a+" and "+c);
            }else if(c>a && c>b){
                System.out.println(c+ " is larger than "+ a+" and "+b);
            }else{
                System.out.println("You need to enter different values of a b and c. Please try again");
            }   
        }
    }
}
