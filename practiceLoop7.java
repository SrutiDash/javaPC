//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.Scanner;

public class practiceLoop7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        int even = 0;
        int odd = 0;
        while(num!=0){
            int rem = num%10;
            if(rem%2==0){
                even = even + rem;
            }else{
                odd = odd + rem;
            }
            num=num/10;
        }
        int ans = even + odd;
        System.out.println("sum of even and odd integers are : "+ans);
    }
}
