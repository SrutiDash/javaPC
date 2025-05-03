
import java.util.Scanner;

//Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.

public class practiceLoop8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a natural number : ");
        int num = input.nextInt();
        boolean isPrime = true;
        if(num<=1){
            System.out.println("Neither prime nor composite");
        }else{
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println(num+" is prime");
        }else{
            System.out.println(num+" is not prime");
        }
    }
}
