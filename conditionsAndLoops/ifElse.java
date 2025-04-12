package conditionsAndLoops;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary :");
        int salary = input.nextInt();
        if(salary>10000){
            salary = salary + 5000;
        }else{
            salary = salary + 2000;
        }
        System.out.println("Your updated salary is "+salary);

        if(salary>10000){
            salary += 2000;
        }else if(salary>8000 && salary<=10000){
            salary += 1000;
        }else if(salary>5000 && salary<=8000){
            salary +=500;
        }else{
            salary +=0;
        }
        System.out.println("Your updated slaary is "+ salary);
    }
}
