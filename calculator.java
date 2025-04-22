import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;

        while(true){
            System.out.println("Enter the operator : ");
            char operation = input.next().trim().charAt(0);
            if(operation == '+' || operation == '-' || operation == '*' || operation == '/' || operation == '%'){
                System.out.println("Enter the first number : ");
                int num1 = input.nextInt();
                System.out.println("Enter the second number : ");
                int num2 = input.nextInt();            
            
            if(operation=='+'){
                ans=num1+num2;
            }
            if(operation=='-'){
                ans=num1-num2;
            }
            if(operation=='*'){
                ans=num1*num2;
            }
            if(operation=='/'){
                if(num2!=0){
                    ans=num1/num2;
                }
            }
            if(operation=='%'){
                ans=num1%num2;
            }
          }else if(operation == 'x' || operation == 'X'){
            break;
          }else{
            System.out.println("Invalid operation");
          }
          System.out.println(ans);
        }
    }
}



